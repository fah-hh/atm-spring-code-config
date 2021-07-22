package th.ku.ac.atm;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
