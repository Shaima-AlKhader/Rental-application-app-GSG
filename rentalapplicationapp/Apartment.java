package rentalapplicationapp;


public abstract class Apartment {
    private String address;
    private String name;
    private int size;
    private String apartmentOwner;

    public Apartment(String address, String name, int size, String apartmentOwner) {
        this.address = address;
        this.name = name;
        this.size = size;
        this.apartmentOwner = apartmentOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getApartmentOwner() {
        return apartmentOwner;
    }

    public void setApartmentOwner(String apartmentOwner) {
        this.apartmentOwner = apartmentOwner;
    }
}
