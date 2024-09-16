package rentalapplicationapp;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerPhone;
    private ArrayList<Apartment> buildings = new ArrayList<>();

    public Customer(int customerID, String customerName, String customerPhone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }    
    
    public void rentBuilding(Apartment apartment, Payment pay, int rentalPeriod, double price){
        buildings.add(apartment);
        pay.paymentWay(price);
        Contract contract = new Contract(rentalPeriod, price, this, apartment.getApartmentOwner());
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public ArrayList<Apartment> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Apartment> buildings) {
        this.buildings = buildings;
    }
   
}
