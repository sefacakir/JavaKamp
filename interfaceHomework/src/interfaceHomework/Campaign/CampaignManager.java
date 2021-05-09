package interfaceHomework.Campaign;

public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.print("Yeni bir kampanya eklendi : ");
		campaign.sales();
	}
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi.");
	}
	
}
