package interfaceHomework;

import interfaceHomework.Verification.Verification;

public class Utils {
	
	public static void runVerification(Verification[] verifications, String message) {
		for(Verification verification: verifications) {
			verification.kontrol(message);
		}
	}
	
}
