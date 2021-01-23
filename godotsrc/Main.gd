extends Control

onready var lnedtEnterSeed = \
	$pnlWindow/MarginContainer/vbxMainLayout/hboxEnterSeed/lnedtEnterSeed
onready var btnPickJar = \
	$pnlWindow/MarginContainer/vbxMainLayout/hboxPickJar/btnPickJar

onready var btnRandomize = \
	$pnlWindow/MarginContainer/vbxMainLayout/btnRandomize
onready var popupErrorInvalid = $pnlWindow/popupErrorInvalidSeed
onready var fdlPickJar = $pnlWindow/fdlPickJar

onready var popupErrorRandomizer = $pnlWindow/popupErrorRandomizer
onready var popupErrorRandText = \
	$pnlWindow/popupErrorRandomizer/MarginContainer/Label
onready var popupErrorSuccess = $pnlWindow/popupSuccessRandomizer

var randomizer_seed = ""
var froglord_jar_path := ""


# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	lnedtEnterSeed.connect(
		"text_changed", self, "_on_lnedtEnterSeed_text_changed")
	btnPickJar.connect("pressed", self, "_on_btnPickJar_pressed")
	btnRandomize.connect("pressed", self, "_on_btnRandomize_pressed")



func _on_lnedtEnterSeed_text_changed(new_text):
	randomizer_seed = new_text
	print(randomizer_seed)



func _on_btnPickJar_pressed() -> void:
	fdlPickJar.popup_centered(Vector2(640, 480))

func _on_fdlPickJar_file_selected(path: String) -> void:
	print("file selected : " + path)
	froglord_jar_path = path
	btnPickJar.text = path
	btnRandomize.disabled = false


func _on_btnRandomize_pressed() -> void:
	if not is_valid_seed(randomizer_seed):
		popupErrorInvalid.popup_centered()
		return
	var exit_code = OS.execute("java", 
		["-jar", froglord_jar_path, "--seed="+randomizer_seed, "1>", "out.txt", "2>&1"], 
		true)
	if exit_code == 0:
		popupErrorSuccess.popup_centered()
	else:
		popupErrorRandText.text = (
			"Could not randomize.  Error code " + str(exit_code))
		popupErrorRandomizer.popup_centered()




func is_valid_seed(value) -> bool:
	if value == "":
		return true
	if not value.is_valid_integer():
		return false
	value = int(value)
	if value < 0 || value > 2147483647:
		return false
	return true
