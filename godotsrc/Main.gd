extends Control


@onready var randomize_button: Button = %RandomizeButton

@onready var error_popup: AcceptDialog = %ErrorPopup
@onready var error_popup_label: Label = %ErrorLabel
@onready var success_popup: AcceptDialog = %SuccessPopup


@onready var general_settings: GeneralSettings = %GeneralSettings
@onready var timer_settings: TimerSettings = %TimerSettings

@onready var randomizer_launcher: RandomizerLauncher = %RandomizerLauncher

var directory_path := ""


##
func validate_all() -> bool:
	if !general_settings.validate_settings():
		return false
	if !timer_settings.validate_settings():
		return false
	return true


##
func do_randomization() -> String:
	var froglord_args = [
		"-jar", directory_path + "\\FrogLord.jar", 
		"--version=" + str(general_settings.version),
		"--seed=" + str(general_settings.seed), 
		"--timer_mode=" + str(timer_settings.mode),
		"--timer_multiplier=" + str(timer_settings.multiplier),
		"--timer_exceed_max=" + str(timer_settings.exceed_max_timer),
		"1>", "out.txt", "2>&1"
	]
	print("Args: " + str(froglord_args))
	
	if general_settings.version == GeneralSettings.VERSION.PC:
		return randomizer_launcher.do_pc_randomization(froglord_args, directory_path)
	elif general_settings.version == GeneralSettings.VERSION.PSX:
		return randomizer_launcher.do_psx_randomization(froglord_args, directory_path)
	return "Error: Version not supported"


func _on_file_picker_directory_chosen(value: String) -> void:
	directory_path = value
	randomize_button.disabled = false


func _on_randomize_button_pressed() -> void:
	if !validate_all():
		return
	
	do_randomization()
	
	#
	#
	#
	#if exit_code == 0:
		#success_popup.popup_centered()
	#else:
		#error_popup_label.text = (
			#"Could not randomize.  Error code " + str(exit_code) + " " + str(output)
		#)
		#error_popup.popup_centered()
