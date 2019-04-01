package assignment05.q03;

public abstract class PhoneCall {
    String phoneNumber;
    double price;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }


    public abstract String getPhoneNumber();

    public abstract void callInformation();

    public abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }
}
