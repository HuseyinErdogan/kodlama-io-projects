package Abstract;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;
public interface SaleService {
	void addSale(Gamer gamer, Game game);
	
	void deleteSale(Sale sale);
	void updateSale(Sale sale);
}
