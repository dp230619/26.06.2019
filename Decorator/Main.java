
public class Main {

	public static void main(String[] args) {

		IPizza basePizza = new BasePizza();
		System.out.println(basePizza);
	
		IPizza pizzaWithTomatto = new TomatoTopping(basePizza);
		System.out.println(pizzaWithTomatto.getDetails() + " " + pizzaWithTomatto.getCost());
		
		IPizza hawaiienPizzal = new PineappleTopping(new TomatoTopping(new BasePizza()));
		System.out.println(hawaiienPizzal.getDetails() + " " + hawaiienPizzal.getCost());
		
		IPizza discount = new ToppingHalfPrice(hawaiienPizzal);
		System.out.println(discount.getDetails() + " " + discount.getCost());
		
	}

}
