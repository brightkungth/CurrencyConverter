package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.93);
				this.exchangeValues.put("GBP", 0.66);
				this.exchangeValues.put("CHF", 1.01);
				this.exchangeValues.put("CNY", 6.36);
				this.exchangeValues.put("JPY", 123.54);
				this.exchangeValues.put("THB", 34.74);
				this.exchangeValues.put("XBT", 0.0000328339);
				this.exchangeValues.put("ETH", 0.000472663);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.073);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.71);
				this.exchangeValues.put("CHF", 1.08);
				this.exchangeValues.put("CNY", 6.83);
				this.exchangeValues.put("JPY", 132.57);
				this.exchangeValues.put("THB", 36.1525);
				this.exchangeValues.put("XBT", 0.0000341513);
				this.exchangeValues.put("ETH", 0.000491580);
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.51);
				this.exchangeValues.put("EUR", 1.41);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.52);
				this.exchangeValues.put("CNY", 9.60);
				this.exchangeValues.put("JPY", 186.41);
				this.exchangeValues.put("THB", 42.492);
				this.exchangeValues.put("XBT", 0.0000401576);
				this.exchangeValues.put("ETH", 0.000578619);
				break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 0.99);
				this.exchangeValues.put("EUR", 0.93);
				this.exchangeValues.put("GBP", 0.66);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 6.33);
				this.exchangeValues.put("JPY", 122.84);
				this.exchangeValues.put("THB", 34.680);
				this.exchangeValues.put("XBT", 0.0000327828);
				this.exchangeValues.put("ETH", 0.000473962);
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.16);
				this.exchangeValues.put("EUR", 0.15);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("CHF", 0.16);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 19.41);
				this.exchangeValues.put("THB", 5.1189);
				this.exchangeValues.put("XBT", 0.00000483471);
				this.exchangeValues.put("ETH", 0.0000699598);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.008);
				this.exchangeValues.put("EUR", 0.007);
				this.exchangeValues.put("GBP", 0.005);
				this.exchangeValues.put("CHF", 0.008);
				this.exchangeValues.put("CNY", 0.051);
				this.exchangeValues.put("JPY", 1.000);
				this.exchangeValues.put("THB", 0.269);
				this.exchangeValues.put("XBT", 0.000000254922);
				this.exchangeValues.put("ETH", 0.00000370160);
				break;
			case "Thai Bath":
				this.exchangeValues.put("USD", 0.028);
				this.exchangeValues.put("EUR", 0.027);
				this.exchangeValues.put("GBP", 0.0235);
				this.exchangeValues.put("CHF", 0.028);
				this.exchangeValues.put("CNY", 0.195);
				this.exchangeValues.put("JPY", 3.705);
				this.exchangeValues.put("THB", 1.000);
				this.exchangeValues.put("XBT", 0.000000941);
				this.exchangeValues.put("ETH", 0.0000137133);
				break;
			case "Bitcoin":
				this.exchangeValues.put("USD", 30456.327);
				this.exchangeValues.put("EUR", 29281.441);
				this.exchangeValues.put("GBP", 24901.909);
				this.exchangeValues.put("CHF", 30503.835);
				this.exchangeValues.put("CNY", 206837.84);
				this.exchangeValues.put("JPY", 3922775.4);
				this.exchangeValues.put("THB", 1061770.000);
				this.exchangeValues.put("XBT", 1.000);
				this.exchangeValues.put("ETH", 14.432879);
				break;
			case "Ethereum":
				this.exchangeValues.put("USD", 2115.6727);
				this.exchangeValues.put("EUR", 2034.2564);
				this.exchangeValues.put("GBP", 1728.2533);
				this.exchangeValues.put("CHF", 2109.8726);
				this.exchangeValues.put("CNY", 14293.928);
				this.exchangeValues.put("JPY", 270153.41);
				this.exchangeValues.put("THB", 72921.65);
				this.exchangeValues.put("XBT", 0.0693756);
				this.exchangeValues.put("ETH", 1.000);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		currencies.add( new Currency("Thai Bath", "THB") );
		currencies.add( new Currency("Bitcoin", "XBT") );
		currencies.add( new Currency("Ethereum", "ETH") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}