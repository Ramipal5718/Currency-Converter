import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    
    private static Map<String, Double> exchangeRates = new HashMap<>();

    static {
        
        exchangeRates.put("EUR", 1.0);
        exchangeRates.put("USD", 1.09); 
        exchangeRates.put("INR", 88.0); 
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");

        
        System.out.println("Available Currencies: EUR USD INR");

        
        System.out.print("Enter the base currency : ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency : ");
        String targetCurrency = scanner.next().toUpperCase();

        
        System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amount = scanner.nextDouble();

        
        if (!exchangeRates.containsKey(baseCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currencies. Please choose valid currencies.");
            return;
        }

        
        double exchangeRate = exchangeRates.get(targetCurrency) / exchangeRates.get(baseCurrency);
        double convertedAmount = amount * exchangeRate;

        
        System.out.println("Result:");
        System.out.println(amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}
