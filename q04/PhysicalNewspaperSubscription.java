package assignment05.q04;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
        if (address.contains("1") || address.contains("2") || address.contains("3") ||
                address.contains("4") || address.contains("5") ||
                address.contains("6") || address.contains("7") ||
                address.contains("8") || address.contains("9") || address.contains("0")) {
            super.address = address;
            super.setRate(15);
        } else {
            super.setRate(0);
            System.out.println("The parameter for the setAddress() method must contain at least one digit");
        }
    }
}
