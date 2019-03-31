package assignment05.q05;

public class ElementArray {

    public static void main(String[] args) {
        Element [] elements = new Element [2];
        elements[0] = new NonMetalElement();
        elements[1] = new MetalElement();
        elements[0].describeElement();
        elements[1].describeElement();


    }


}
