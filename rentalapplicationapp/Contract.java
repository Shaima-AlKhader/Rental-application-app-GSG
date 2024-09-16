package rentalapplicationapp;

public class Contract {
    private int rentalPeriod;
    private double price;
    private Customer customer;
    private String apartmentOwner;

    public Contract(int rentalPeriod, double price, Customer customer, String apartmentOwner) {
        this.rentalPeriod = rentalPeriod;
        this.price = price;
        this.customer = customer;
        this.apartmentOwner = apartmentOwner;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getApartmentOwner() {
        return apartmentOwner;
    }

    public void setApartmentOwner(String apartmentOwner) {
        this.apartmentOwner = apartmentOwner;
    }
    
}
