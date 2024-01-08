package Basket;

public class demo {
	public static void main(String[] args) {
        Basket_e<Double, Double> b = new Basket_e<>();
        b.add(2.4);
        b.add(5.6);
        System.out.println(b.toString());
        b.add(8.0);
        System.out.println(b.toString()); 
    }
}
