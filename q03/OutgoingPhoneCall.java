package assignment05.q03;

public class OutgoingPhoneCall extends PhoneCall {

    int time;

    public OutgoingPhoneCall(String phoneNumber, int time) {
        super(phoneNumber);
        this.time = time;
        super.price = 0.04 * time;
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public void callInformation() {
        System.out.println("phone number : " + super.phoneNumber + "\n" +
                "rate : " + super.price + "\n" + "the number of minutes :" + time +
                "\n" + "total price : " + super.price);

    }

    @Override
    public double getPrice() {
        return super.price;
    }
}
