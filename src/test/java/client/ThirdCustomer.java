package client;

import domain.Customer;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.junit.Before;
import org.junit.Test;

public class ThirdCustomer {

  private Region<Long, Customer> customerRegion;

  @Before
  public void setup() {
    ClientCache cache = new ClientCacheFactory().create();
    customerRegion = cache.getRegion("Customer");
  }

  @Test
  public void addAnotherCustomer() {
    Customer c3 = new Customer();
    c3.setFirstName("Tom");
    c3.setLastName("Smith");
    c3.setTelephone("(512) 333-4444");
    customerRegion.put(3L, c3);
  }
}
