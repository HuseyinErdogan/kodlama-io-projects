package Concrate;
import Abstract.GameService;
import Entities.Game;
public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println("Game: "+ game.getName()+" is added.");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Game: "+ game.getName()+" is deleted.");		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game: "+ game.getName()+" is updated.");		
	}
	

}
