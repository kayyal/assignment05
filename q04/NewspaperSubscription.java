package assignment05.q04;

public abstract class NewspaperSubscription {
    private String name ;
    private int address;
    private int rate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public int getRate() {
        return rate;
    }
}
