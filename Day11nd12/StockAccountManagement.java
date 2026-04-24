package Day11nd12;

import java.util.Scanner;

class Stock {
    String stockName;
    int numberOfShares;
    double sharePrice;

    Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    double calculateStockValue() {
        return numberOfShares * sharePrice;
    }
}

class StockPortfolio {
    Stock[] stocks;
    int count;

    StockPortfolio(int size) {
        stocks = new Stock[size];
        count = 0;
    }

    void addStock(Stock stock) {
        stocks[count] = stock;
        count++;
    }

    void printStockReport() {
        double totalValue = 0;

        System.out.println("\n----- Stock Report -----");

        for (int i = 0; i < count; i++) {
            double value = stocks[i].calculateStockValue();
            totalValue += value;

            System.out.println("Stock Name: " + stocks[i].stockName);
            System.out.println("Number of Shares: " + stocks[i].numberOfShares);
            System.out.println("Share Price: " + stocks[i].sharePrice);
            System.out.println("Total Stock Value: " + value);
            System.out.println("------------------------");
        }

        System.out.println("Total Value of All Stocks: " + totalValue);
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();

        StockPortfolio portfolio = new StockPortfolio(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Stock " + (i + 1));

            System.out.print("Enter Stock Name: ");
            String name = sc.next();

            System.out.print("Enter Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Enter Share Price: ");
            double price = sc.nextDouble();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printStockReport();
        sc.close();
    }
}
