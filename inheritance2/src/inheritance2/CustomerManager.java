package inheritance2;

public class CustomerManager {
	//bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý new'leyemez.
	public void add(Logger logger) {
		System.out.println("Müþteri eklendi.");
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
