package assignment05.q05;

public abstract class Element {
    private char symbols;
    private int atomicNumber;
    private int atomicWeight;

    public Element() {
    }

    public Element(char symbols, int atomicNumber, int atomicWeight) {
        this.symbols = symbols;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }


    public char getSymbols() {
        return symbols;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public int getAtomicWeight() {
        return atomicWeight;
    }

    public abstract void describeElement ();

}
