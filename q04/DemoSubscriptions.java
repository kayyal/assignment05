package assignment05.q04;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalNewspaperSubscription = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onlineNewspaperSubscription = new OnlineNewspaperSubscription();
        physicalNewspaperSubscription.setName("washington Post");
        physicalNewspaperSubscription.setAddress("washington ,  12");
        onlineNewspaperSubscription.setName("New York times");
        onlineNewspaperSubscription.setAddress("NYT@times.com");


    }
}
