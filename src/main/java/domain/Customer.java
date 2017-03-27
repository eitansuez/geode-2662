package domain;

public class Customer {
  String firstName, lastName;
  String telephone;

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Customer() { }

  @Override
  public String toString() {
    return "Customer{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", telephone='" + telephone + '\'' +
        '}';
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
