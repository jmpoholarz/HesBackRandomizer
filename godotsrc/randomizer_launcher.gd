class_name RandomizerLauncher
extends Node


##
func do_pc_randomization(froglord_args: Array[String]) -> String:
	# froglord.jar
	run_froglord(froglord_args)
	
	# mv original files to .bck
	move_file("FROGPSX.MWD", "FROGPSX.MWD.bck")
	move_file("frogger.exe", "frogger.exe.bck")
	
	# rename -MODIFIED files
	move_file("FROGPSX-MODIFIED.MWD", "FROGPSX.MWD")
	move_file("frogger-modified.exe", "frogger.exe")
	return ""


##
func do_psx_randomization(froglord_args: Array[String], base_path: String) -> String:
	# dumpsxiso.exe - `.\dumpsxiso.exe 'Frogger (Track 1).bin'`
	var dumpsxiso_path: String = base_path + "\\dumpsxiso.exe"
	var dumpsxiso_args: Array[String] = [base_path + "\\'" + "Frogger (Track 1).bin" + "'"]
	var output: Array = []
	var exit_code = OS.execute(dumpsxiso_path, dumpsxiso_args, output)
	print(exit_code)
	print(output)
	
	# froglord.jar
	run_froglord(froglord_args)
	
	# mv original files to .bck
	move_file("FROGPSX.MWD", "FROGPSX.MWD.bck")
	move_file("SLUS_005.06", "SLUS_005.06.bck")
	
	# rename -MODIFIED files
	move_file("FROGPSX-MODIFIED.MWD", "FROGPSX.MWD")
	move_file("SLUS_005-modified.exe", "SLUS_005.06")
	
	# mkpsxiso.exe
	
	# rename mkpsxiso.bin and .cue (?)
	
	return ""


##
func run_froglord(args: Array[String]) -> int:
	var output = []
	var exit_code = OS.execute("java", args, output, true)
	print(output)
	return exit_code


##
func move_file(old_name: String, new_name: String) -> void:
	var output: Array = []
	var args = ["'" + old_name + "'", "'" + new_name + "'"]
	var exit_code = OS.execute("mv", args, output)
	print(exit_code)
	print(output)


##
func run_dumpsxiso() -> void:
	pass


##
func run_mkpsxiso() -> void:
	pass
