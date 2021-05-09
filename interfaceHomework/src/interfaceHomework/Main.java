package interfaceHomework;

import interfaceHomework.Campaign.CampaignManager;
import interfaceHomework.Campaign.Retail;
import interfaceHomework.Campaign.Wholesale;
import interfaceHomework.Verification.EDevletVerification;
import interfaceHomework.Verification.Verification;
import interfaceHomework.Sales.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Verification[] verifications = {
				new EDevletVerification()
		};
		
		PlayerManager manager = new PlayerManager(verifications);
		Player sefa = new Player(1,"Sefa","Çakýr","10000000000", "2001");
		manager.add(sefa);
		//manager.update(sefa);
		//manager.delete(sefa);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Wholesale());
		campaignManager.add(new Retail());
		campaignManager.delete(new Wholesale());
	
		SalesManager salesManager = new SalesManager();
		salesManager.sale(sefa,new Retail());
		salesManager.sale(sefa, new Wholesale());
		
		
		
	}
}