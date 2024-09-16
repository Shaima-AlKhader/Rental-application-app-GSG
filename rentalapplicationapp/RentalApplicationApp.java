package rentalapplicationapp;

public class RentalApplicationApp {


    public static void main(String[] args) {
       Apartment apartment1 = new House(6, "Al-Quds Street", "Roze Home", 400, "Omar Ali");
       Apartment apartment2 = new Shop("Al-Ersal Street", "Maka Mole", 30, "Mohammad Khader");
       
       Customer customer1 = new Customer(100, "Hala", "+970595048665");
       Customer customer2 = new Customer(101, "Khalid", "+970595041265");
       
       Paypal paypal = new Paypal(customer1.getCustomerPhone());
       Card card = new Card("201411258");
       
       customer1.rentBuilding(apartment1, paypal, 2, 4000);
       customer1.rentBuilding(apartment2, card, 3, 8000);
    }
    
}
