package rentalapplicationapp;

public class Paypal implements Payment {
    private String mobile;
    
    @Override
    public void paymentWay(double price) {
        System.out.println("this payment is done by Palpay, the price is: " +
                price+"$ his/her mobile: " + mobile);
        
    }

    public Paypal(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
}
