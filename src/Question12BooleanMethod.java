
public class Question12BooleanMethod {

	public static void main(String[] args) {

		boolean isHotOutside = true;
		double moneyInPOcket = 100.00;
		boolean willDrink = willBuyDrink(isHotOutside, moneyInPOcket);
		System.out.println(willDrink);
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPOcket) {
		return isHotOutside && moneyInPOcket > 10.50;
	}
}
