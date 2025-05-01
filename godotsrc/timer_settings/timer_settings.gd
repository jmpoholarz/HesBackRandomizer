class_name TimerSettings
extends PanelContainer

@onready var multiplier_line_edit: LineEdit = %MultiplierLineEdit
@onready var multiplier_error_shake: ErrorShakeComponent = %MultiplierErrorShake

const WHITE = Color(1, 1, 1)
const RED = Color(1, 0, 0)

var mode: String = "dynamic"
var multiplier: float = 1.0
var exceed_max_timer: bool = false


func is_valid_multiplier(value: String) -> bool:
	if !value.is_valid_float():
		return false
	return true


func validate_settings() -> bool:
	if !is_valid_multiplier(multiplier_line_edit.text):
		multiplier_error_shake.do_shake()
		return false
	return true


func _on_multiplier_line_edit_text_changed(new_text: String) -> void:
	if !is_valid_multiplier(new_text):
		multiplier_line_edit.modulate = RED
	else:
		multiplier = float(new_text)
		multiplier_line_edit.modulate = WHITE


func _on_mode_vanilla_checkbox_toggled(toggled_on: bool) -> void:
	if toggled_on:
		mode = "vanilla"


func _on_mode_dynamic_checkbox_toggled(toggled_on: bool) -> void:
	if toggled_on:
		mode = "dynamic"


func _on_exceed_max_checkbox_toggled(toggled_on: bool) -> void:
	exceed_max_timer = toggled_on
