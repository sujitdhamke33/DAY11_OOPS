package Day11_oops.Stockportfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateStockValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        System.out.println("\nStock Report:");
        for (Stock stock : stocks) {
            System.out.println(stock + ", Total Value: $" + stock.calculateStockValue());
        }
    }
}

public class StockReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of stocks:");
        int numStocks = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        StockPortfolio portfolio = new StockPortfolio();


        for (int i = 0; i < numStocks; i++) {
            System.out.println("Enter details for stock " + (i + 1) + ":");
            System.out.print("Share Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of Shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Share Price: ");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine();
            Stock stock = new Stock(name, numShares, sharePrice);
            portfolio.addStock(stock);
        }


        portfolio.printStockReport();
        System.out.println("\nTotal Portfolio Value: $" + portfolio.calculateTotalValue());

        scanner.close();
    }
}
