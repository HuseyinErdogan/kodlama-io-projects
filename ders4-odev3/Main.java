import Concrate.*;
import Entities.*;

public class Main {

	public static void main(String[] args) {
		
		
		GameManager gameManager = new GameManager();
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		
		CampaignManager campaignManager = new CampaignManager();
		
		SaleManager saleManager = new SaleManager();
		
		
		Game game = new Game();
		game.setId(1);
		game.setName("The Witcher 2");
		game.setPrice(35);
		
		gameManager.addGame(game);
		gameManager.updateGame(game);
		gameManager.deleteGame(game);
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Hüseyin");
		gamer.setLastName("Erdoðan");
		
		gamerManager.addGamer(gamer);
		gamerManager.deleteGamer(gamer);
		gamerManager.updateGamer(gamer);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Blabla");
		campaign.setDiscount(25);
		
		campaignManager.addCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
		
		
		
		saleManager.addSale(gamer, game);
		
				
		

	}

}
