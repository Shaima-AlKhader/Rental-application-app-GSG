package rentalapplicationapp;


public class Card  implements Payment{

    private String cardNumber;
    
    @Override
    public void paymentWay(double price) {
        System.out.println("this payment is done by credit card, the price is: "+
                price+"$ his/her card Number: "+cardNumber);
    }

    public Card(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}
