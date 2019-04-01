package assignment05.q04;

public abstract class NewspaperSubscription {
    private String name;
     String address;
    private int rate;

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public abstract void setAddress(String address);

    public int getRate() {
        return rate;
    }
}
