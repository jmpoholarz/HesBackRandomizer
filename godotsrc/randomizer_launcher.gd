class_name RandomizerLauncher
extends Node


##
func do_pc_randomization(froglord_args: Array[String], base_path: String, seed: String) -> String:
	# froglord.jar
	run_froglord(froglord_args)
	await get_tree().process_frame
	
	# mv original files to .bck
	move_file(base_path + "/FROGPSX.MWD", base_path + "/FROGPSX.MWD.bck")
	move_file(base_path + "/frogger.exe", base_path + "/frogger.exe.bck")
	await get_tree().process_frame
	
	# rename -MODIFIED files
	move_file(base_path + "/FROGPSX-MODIFIED.MWD", base_path + "/FROGPSX.MWD")
	move_file(base_path + "/frogger-modified.exe", base_path + "/frogger.exe")
	await get_tree().process_frame
	return ""
	
	# ["/C", "move 
	# C:\\Users\\Jonathan\\Documents\\Dev\\FrogLord\\HesBackRandomizer\\out\\0.3\\New folder\\FROGPSX.MWD 
	# C:\\Users\\Jonathan\\Documents\\Dev\\FrogLord\\HesBackRandomizer\\out\\0.3\\New folder\\FROGPSX.MWD.bck"
	# ]
	
	# ["/C", "move 
	# C:\\Users\\Jonathan\\Documents\\Dev\\FrogLord\\HesBackRandomizer\\out\\0.3\\frogger\\SLUS_005-modified.exe 
	# C:\\Users\\Jonathan\\Documents\\Dev\\FrogLord\\HesBackRandomizer\\out\\0.3\\frogger\\SLUS_005.06"]


##
func do_psx_randomization(froglord_args: Array[String], base_path: String, seed: String) -> String:
	print("base_path : " + base_path)
	run_dumpsxiso(base_path)
	await get_tree().process_frame
	
	# froglord.jar
	run_froglord(froglord_args)
	await get_tree().process_frame
	
	# mv original files to .bck
	move_file(base_path + "/frogger/FROGPSX.MWD", base_path + "/frogger/FROGPSX.MWD.bck")
	move_file(base_path + "/frogger/SLUS_005.06", base_path + "/frogger/SLUS_005.06.bck")
	await get_tree().process_frame
	
	# rename -MODIFIED files
	move_file(base_path + "/frogger/FROGPSX-MODIFIED.MWD", base_path + "/frogger/FROGPSX.MWD")
	move_file(base_path + "/frogger/SLUS_005-modified.exe", base_path + "/frogger/SLUS_005.06")
	await get_tree().process_frame
	
	# mkpsxiso.exe
	run_mkpsxiso(base_path, seed)
	await get_tree().process_frame
	
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
	# Switch / to \ for Windows CLI compatibility
	old_name = old_name.replace("/", "\\")
	new_name = new_name.replace("/", "\\")
	
	var output: Array = []
	var args = ["/C", "move " + old_name + " " + new_name]
	print(args)
	var exit_code = OS.execute("CMD.exe", args, output, true)
	print(exit_code)
	print(output)


##
func run_dumpsxiso(base_path: String) -> void:
	# dumpsxiso.exe - `.\dumpsxiso.exe 'Frogger (Track 1).bin'`
	var dumpsxiso_path: String = base_path + "/dumpsxiso.exe"
	var dumpsxiso_args: Array[String] = ["-x", base_path + "/frogger", "-s", base_path + "/frogger.xml", base_path + "/frogger.bin"]
	print("dumpsxiso_path : " + dumpsxiso_path)
	print("dumpsxiso_args : " + str(dumpsxiso_args))
	var output: Array = []
	var exit_code = OS.execute(dumpsxiso_path, dumpsxiso_args, output)
	print(exit_code)
	print(output)


##
func run_mkpsxiso(base_path: String, seed: String) -> void: # TODO: Make this overwrite existing file so it doesn't get stuck
	var mkpsxiso_path: String = base_path + "/mkpsxiso.exe"
	var mkpsxiso_args: Array[String] = ["-y", "-o", base_path + "/frogger_randomized_" + seed + ".bin", base_path + "/frogger.xml"]
	print("mkpsxiso_path : " + mkpsxiso_path)
	print("mkpsxiso_args : " + str(mkpsxiso_args))
	var output: Array = []
	var exit_code = OS.execute(mkpsxiso_path, mkpsxiso_args, output)
	print(exit_code)
	print(output)
