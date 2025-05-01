extends Control


@onready var pick_jar_button: Button = %PickJarButton

@onready var randomize_button: Button = %RandomizeButton
@onready var pick_jar_dialog: FileDialog = %PickJarDialog

@onready var error_popup: AcceptDialog = %ErrorPopup
@onready var error_popup_label: Label = %ErrorLabel
@onready var success_popup: AcceptDialog = %SuccessPopup


@onready var general_settings: GeneralSettings = %GeneralSettings
@onready var timer_settings: TimerSettings = %TimerSettings

var froglord_jar_path := ""


func validate_all() -> bool:
	if !general_settings.validate_settings():
		return false
	if !timer_settings.validate_settings():
		return false
	return true


func _on_pick_jar_button_pressed() -> void:
	pick_jar_dialog.popup_centered(Vector2(640, 480))


func _on_pick_jar_dialog_file_selected(path: String) -> void:
	print("file selected : " + path)
	froglord_jar_path = path
	pick_jar_button.text = path
	randomize_button.disabled = false


func _on_randomize_button_pressed() -> void:
	if !validate_all():
		return

	var args = [
		"-jar", froglord_jar_path, 
		"--seed="+str(general_settings.seed), 
		"--timer_mode=" + str(timer_settings.mode),
		"--timer_multiplier=" + str(timer_settings.multiplier),
		"--timer_exceed_max=" + str(timer_settings.exceed_max_timer),
		"1>", "out.txt", "2>&1"
	]
	print("Args: " + str(args))
	var output = []
	var exit_code = OS.execute("java", args, output, true)
	print(output)
	if exit_code == 0:
		success_popup.popup_centered()
	else:
		error_popup_label.text = (
			"Could not randomize.  Error code " + str(exit_code) + " " + str(output)
		)
		error_popup.popup_centered()
