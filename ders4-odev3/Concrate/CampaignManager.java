package Concrate;
import Abstract.CampaignService;
import Entities.Campaign;
public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {

		System.out.println("Campaign: "+campaign.getName()+" is added");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {

		System.out.println("Campaign: "+campaign.getName()+" is deleted");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Campaign: "+campaign.getName()+" is updated");
		
	}
	
}
