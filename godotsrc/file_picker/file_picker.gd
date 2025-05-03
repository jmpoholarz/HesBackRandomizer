extends PanelContainer

signal directory_chosen

@onready var pick_jar_button: Button = %PickJarButton
@onready var pick_jar_dialog: FileDialog = %PickJarDialog


func _on_pick_jar_button_pressed() -> void:
	pick_jar_dialog.popup_centered(Vector2(640, 480))


#func _on_pick_jar_dialog_file_selected(path: String) -> void:
	#print("file selected : " + path)
	#froglord_jar_path = path
	#pick_jar_button.text = path
	#randomize_button.disabled = false


func _on_pick_jar_dialog_dir_selected(dir: String) -> void:
	print("directory chosen : " + dir)
	pick_jar_button.text = dir
	directory_chosen.emit(dir)
