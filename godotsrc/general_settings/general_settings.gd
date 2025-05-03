class_name GeneralSettings
extends PanelContainer

@onready var seed_line_edit: LineEdit = %SeedLineEdit
@onready var seed_error_shake: ErrorShakeComponent = %SeedErrorShake

enum VERSION {
	PC = 0,
	PSX = 1
}

const WHITE = Color(1, 1, 1)
const RED = Color(1, 0, 0)

var version: VERSION = VERSION.PC
var seed: int = -1


##
func is_valid_seed(value) -> bool:
	if value == "":
		return true
	if not value.is_valid_int():
		return false
	value = int(value)
	if value < 0 || value > 2147483647:
		return false
	return true


func validate_settings() -> bool:
	if !is_valid_seed(seed_line_edit.text):
		seed_error_shake.do_shake()
		return false
	return true


func _on_seed_line_edit_text_changed(new_text: String) -> void:
	if (is_valid_seed(new_text)):
		seed_line_edit.modulate = WHITE
		seed = int(new_text)
	else:
		seed_line_edit.modulate = RED


func _on_pc_check_box_toggled(toggled_on: bool) -> void:
	if toggled_on:
		version = VERSION.PC


func _on_psx_check_box_2_toggled(toggled_on: bool) -> void:
	if toggled_on:
		version = VERSION.PSX
