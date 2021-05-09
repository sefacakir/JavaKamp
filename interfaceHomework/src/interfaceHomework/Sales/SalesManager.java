package interfaceHomework.Sales;
import interfaceHomework.Player;
import interfaceHomework.Campaign.Campaign;
import interfaceHomework.Campaign.CampaignManager;

public class SalesManager {
	
	public void sale(Player player, Campaign campaign) {
		System.out.print(player.getFirstName()+ " adlý müþteri kampanyadan yararlandý: ");			
		campaign.sales();

	}
}
