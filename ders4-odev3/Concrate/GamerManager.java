package Concrate;
import Abstract.GamerService;
import Entities.Gamer;
public class GamerManager implements GamerService{
	
	GamerCheckManager gamerCheckManager;
	
	public GamerManager(GamerCheckManager gamerCheckManager) {
		this.gamerCheckManager = gamerCheckManager;
	}
	
	@Override
	public void addGamer(Gamer gamer) {
		
		if(gamerCheckManager.checkGamer(gamer))
			System.out.println("Gamer "+gamer.getFirstName()+" is added.");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {

		System.out.println("Gamer "+gamer.getFirstName()+" is deleted.");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {

		if(gamerCheckManager.checkGamer(gamer))
			System.out.println("Gamer "+gamer.getFirstName()+" is updated.");
		
	}

}
