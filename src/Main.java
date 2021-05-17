import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, "15113248454",
                "hatice",
                "Ay",
        LocalDate.parse("2000-01-25")));

    }
}
