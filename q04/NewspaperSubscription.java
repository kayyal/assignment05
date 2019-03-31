package assignment05.q04;

public abstract class NewspaperSubscription {
    private String name;
    private int address;
    private int rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public abstract void setAddress(int address);

    public int getRate() {
        return rate;
    }
}
