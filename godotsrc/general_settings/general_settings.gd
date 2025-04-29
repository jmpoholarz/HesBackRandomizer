class_name GeneralSettings
extends PanelContainer

enum VERSION {
	PC = 0,
	PSX = 1
}

var version: VERSION = VERSION.PC

var seed: int = -1


const WHITE = Color(1, 1, 1)
const RED = Color(1, 0, 0)

@onready var seed_line_edit: LineEdit = %SeedLineEdit


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


func _on_seed_line_edit_text_changed(new_text: String) -> void:
	if (is_valid_seed(new_text)):
		seed_line_edit.modulate = WHITE
		seed = int(new_text)
	else:
		seed_line_edit.modulate = RED
