package client;

import domain.Customer;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {

  private Region<Long, Customer> customerRegion;

  @Before
  public void setup() {
    ClientCache cache = new ClientCacheFactory().create();
    customerRegion = cache.getRegion("Customer");
  }

  @Test
  public void writeTwoCustomers() {
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
