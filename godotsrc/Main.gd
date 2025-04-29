extends Control

@onready var seed_error_popup: AcceptDialog = %SeedErrorPopup

@onready var zone_order_checkbox: CheckBox = %ZoneOrderCheckbox

@onready var pick_jar_button: Button = %PickJarButton

@onready var randomize_button: Button = %RandomizeButton
@onready var pick_jar_dialog: FileDialog = %PickJarDialog

@onready var error_popup: AcceptDialog = %ErrorPopup
@onready var error_popup_label: Label = %ErrorLabel
@onready var success_popup: AcceptDialog = %SuccessPopup


@onready var general_settings: GeneralSettings = %GeneralSettings

var froglord_jar_path := ""




func _ready() -> void:
	pick_jar_button.pressed.connect(_on_pick_jar_button_pressed)
	randomize_button.pressed.connect(_on_randomize_button_pressed)


func _on_pick_jar_button_pressed() -> void:
	pick_jar_dialog.popup_centered(Vector2(640, 480))


func _on_pick_jar_dialog_file_selected(path: String) -> void:
	print("file selected : " + path)
	froglord_jar_path = path
	pick_jar_button.text = path
	randomize_button.disabled = false


func _on_randomize_button_pressed() -> void:
	if not general_settings.is_valid_seed(general_settings.seed):
		seed_error_popup.popup_centered()
		return
	var args = [
		"-jar", froglord_jar_path, 
		"--seed="+str(general_settings.seed), 
		"--randZones="+str(zone_order_checkbox.button_pressed),
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
