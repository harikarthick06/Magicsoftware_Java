package Day11nd12;

import java.time.LocalDateTime;
import java.util.Scanner;

class CompanyShares {
    String stockSymbol;
    int numberOfShares;
    LocalDateTime dateTime;

    CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.dateTime = LocalDateTime.now();
    }

    void display() {
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Number of Shares: " + numberOfShares);
        System.out.println("Transaction Time: " + dateTime);
        System.out.println("----------------------");
    }
}

class StockAccount {
    CompanyShares[] sharesList;
    int count;

    StockAccount(int size) {
        sharesList = new CompanyShares[size];
        count = 0;
    }

    void buy(String symbol, int shares) {
        for (int i = 0; i < count; i++) {
            if (sharesList[i].stockSymbol.equalsIgnoreCase(symbol)) {
                sharesList[i].numberOfShares += shares;
                sharesList[i].dateTime = LocalDateTime.now();
                System.out.println("Shares bought successfully.");
                return;
            }
        }

        sharesList[count] = new CompanyShares(symbol, shares);
        count++;
        System.out.println("New company shares added successfully.");
    }

    void sell(String symbol, int shares) {
        for (int i = 0; i < count; i++) {
            if (sharesList[i].stockSymbol.equalsIgnoreCase(symbol)) {
                if (sharesList[i].numberOfShares >= shares) {
                    sharesList[i].numberOfShares -= shares;
                    sharesList[i].dateTime = LocalDateTime.now();
                    System.out.println("Shares sold successfully.");
                } else {
                    System.out.println("Not enough shares available.");
                }
                return;
            }
        }

        System.out.println("Company shares not found.");
    }

    void printReport() {
        System.out.println("\n----- Stock Account Report -----");

        for (int i = 0; i < count; i++) {
            sharesList[i].display();
        }
    }
}

public class StockAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StockAccount account = new StockAccount(10);

        while (true) {
            System.out.println("\n1. Buy Shares");
            System.out.println("2. Sell Shares");
            System.out.println("3. Print Report");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Stock Symbol: ");
                String symbol = sc.next();

                System.out.print("Enter Number of Shares: ");
                int shares = sc.nextInt();

                account.buy(symbol, shares);
            } else if (choice == 2) {
                System.out.print("Enter Stock Symbol: ");
                String symbol = sc.next();

                System.out.print("Enter Number of Shares: ");
                int shares = sc.nextInt();

                account.sell(symbol, shares);
            } else if (choice == 3) {
                account.printReport();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}