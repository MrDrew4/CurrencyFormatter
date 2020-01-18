import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Convert {

	public static void main(String[] args) {
		double money = 1.2324134;
		// Create a string using number format and then getting the currency instance
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(money);
		String india = NumberFormat.getCurrencyInstance((new Locale("en", "IN"))).format(money);
		// Creating a number format right away and with the currency instance method and
		// then formatting the money later
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china.format(money));
		System.out.println("France: " + france.format(money));

	}

}
