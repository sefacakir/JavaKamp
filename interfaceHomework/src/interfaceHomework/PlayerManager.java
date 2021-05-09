package interfaceHomework;

import interfaceHomework.Verification.Verification;

public class PlayerManager {
	
	private Verification [] verifications;
	
	public PlayerManager(Verification [] verifications) {
		this.verifications = verifications;
	}
	
	public void add(Player player) {
		Utils.runVerification(verifications, player.firstName+" "+player.lastName);
		System.out.println("Sisteme eklendi: "+ player.firstName+" "+player.lastName);
	}
	
	public void update(Player player) {
		Utils.runVerification(verifications, player.firstName+" "+player.lastName);
		System.out.println("Sistemde güncelleme yapýldý: "+ player.firstName+" "+player.lastName);
	}
	
	public void delete(Player player) {
		Utils.runVerification(verifications, player.firstName+" "+player.lastName);
		System.out.println("Sistemden silindi: "+ player.firstName+" "+player.lastName);
	}
	
}
