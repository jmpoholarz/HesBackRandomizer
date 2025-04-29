extends PanelContainer

@onready var multiplier_line_edit: LineEdit = %MultiplierLineEdit

const WHITE = Color(1, 1, 1)
const RED = Color(1, 0, 0)

var multiplier: float = 1.0


func is_valid_multiplier(value: String) -> bool:
	if !value.is_valid_float():
		return false
	return true


func _on_multiplier_line_edit_text_changed(new_text: String) -> void:
	if !is_valid_multiplier(new_text):
		multiplier_line_edit.modulate = RED
	else:
		multiplier = float(new_text)
		multiplier_line_edit.modulate = WHITE
