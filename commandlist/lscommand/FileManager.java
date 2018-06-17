package lscommand;

public class FileManager {
	
	public static String ls(String path) {
		return "file1\nfile2\nfile3\nfile4\n";
	}
	
	
	public static String ls_l(String path) {
		String str = "drw_rw_rw root system 1024 2009-8-20 10:23 file1\n ";
		str += "drw_rw_rw root system 1024 2009-8-20 10:23 file2\n ";
		str += "drw_rw_rw root system 1024 2009-8-20 10:23 file3\n ";
		
		return str;
	}
	
	public static String ls_a(String path) {
		String str = ".\n..\nfile1\nfile2\nfile3\n";
		return str;
	}
}
