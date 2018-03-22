package util;

public class URLHelper {
	
	
	private static final String URL_PREFIX = "WEB-INF/jsp/";

	private URLHelper() {
		
	}
	
	public static String to(String jspPage) {
		return String.format("%s%s", URL_PREFIX, jspPage);
	}
	
	

}
