package inheritance2;

public class CustomerManager {
	//bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� new'leyemez.
	public void add(Logger logger) {
		System.out.println("M��teri eklendi.");
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
