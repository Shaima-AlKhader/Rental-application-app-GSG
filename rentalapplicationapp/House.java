package rentalapplicationapp;


public class House extends Apartment {
    private int numOfRooms;

    public House(int numOfRooms, String address, String name, int size, String apartmentOwner) {
        super(address, name, size, apartmentOwner);
        this.numOfRooms = numOfRooms;
    }
    
}
