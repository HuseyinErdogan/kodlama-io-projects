import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;
import Concrete.StarbucksCustomerManager;
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, "H�seyin", "Erdo�an", "12333212321"));
	}

}
