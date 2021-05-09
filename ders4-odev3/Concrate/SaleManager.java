package Concrate;
import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;
public class SaleManager implements SaleService{

	
	
	@Override
	public void addSale(Gamer gamer, Game game) {
		
		System.out.println(gamer.getFirstName()+" has bought "+ game.getName()+" named game for "+game.getPrice()+"$");
		
	}
	
	@Override
	public void deleteSale(Sale sale) {

		System.out.println("Sale "+sale.getsaleId()+"is deleted.");
		
	}

	@Override
	public void updateSale(Sale sale) {

		System.out.println("Sale "+sale.getsaleId()+"is updated.");
		
	}



}
