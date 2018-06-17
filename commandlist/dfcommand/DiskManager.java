package dfcommand;

public class DiskManager {

	public static String df() {
		return "/\t10485760\n/usr\t10485760\n/home\t10485760\n";
	}
	
	
	public static String df_k() {
		return "/\t10240\n/usr\t10240\n/home\t102400\n";
	}
	
	public static String df_g() {
		return "/\t10\n/usr\t100\n/home\t1000\n";
	}
}
