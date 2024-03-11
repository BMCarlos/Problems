class Stock
{
private String symbol;
private String name;
private double previousClosingPrice;
private double currentPrice;

public Stock(String symbol, String name, double previousClosingPrice, double currentPrice)
{
this.symbol = symbol;
this.name = name;
this.previousClosingPrice = previousClosingPrice;
this.currentPrice = currentPrice;
}


public double changePercent()
{
return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
}
}


public class StockProgram {
public static void main (String[] args)
{
Stock stock = new Stock("ORCL","Oracle Corporation",34.5,34.35);
System.out.println("Percentage change in price for ORCL: " + stock.changePercent());
}
}
/*
A string data field named symbol for the stock's symbol.

A string data field named name for the stock's name.

A double data field named previousClosingPrice that stores the stock price for the previous day.

A double data field named currentPrice that stores the stock price for the current time.

A constructor that creates a stock with the specified symbol and name.

A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
*/