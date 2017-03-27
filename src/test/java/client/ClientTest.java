package client;

import domain.Customer;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.junit.Test;

public class ClientTest {

  @Test
  public void writeTwoCustomers() {

    ClientCache cache = new ClientCacheFactory().create();
    Region<Long, Customer> customerRegion = cache.getRegion("Customer");

    Customer c = new Customer();
    c.setFirstName("John");
    c.setLastName("Doe");
    customerRegion.put(1L, c);

    Customer c2 = new Customer();
    c2.setFirstName("Jane");
    c2.setLastName("Doe");
    customerRegion.put(2L, c2);
  }
}
