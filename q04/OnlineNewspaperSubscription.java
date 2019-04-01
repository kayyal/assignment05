package assignment05.q04;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
            if (address.contains("@")){
                super.address = address;
                super.setRate(9);
            }else{
                System.out.println("The parameter for the setAddress() must contain an at sign");
            }
    }
}
