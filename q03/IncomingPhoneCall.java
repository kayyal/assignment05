package assignment05.q03;

public class IncomingPhoneCall  extends  PhoneCall{

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        super.setPrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public void callInformation() {
        System.out.println("phone number : " + super.phoneNumber + "\n" +
                "rate : " + super.price + "\n" + "price : " + super.price);

    }
}
