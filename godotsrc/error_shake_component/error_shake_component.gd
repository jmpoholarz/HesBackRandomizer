class_name ErrorShakeComponent
extends Control

@export var target: Control

var animating: bool = false

func do_shake() -> void:
	if animating:
		return
	animating = true
	var tween = get_tree().create_tween()
	tween.tween_property(target, "position", target.position + Vector2(16,0), .1).set_trans(Tween.TRANS_SPRING).set_ease(Tween.EASE_OUT)
	tween.tween_property(target, "position", target.position - Vector2(16,0), .1).set_trans(Tween.TRANS_SPRING).set_ease(Tween.EASE_OUT)
	tween.tween_property(target, "position", target.position + Vector2(8,0), .1).set_trans(Tween.TRANS_SPRING).set_ease(Tween.EASE_OUT)
	tween.tween_property(target, "position", target.position - Vector2(8,0), .1).set_trans(Tween.TRANS_SPRING).set_ease(Tween.EASE_OUT)
	tween.tween_property(target, "position", target.position, .1).set_trans(Tween.TRANS_SPRING).set_ease(Tween.EASE_OUT)
	tween.tween_callback(_on_tween_complete)


func _on_tween_complete() -> void:
	animating = false
