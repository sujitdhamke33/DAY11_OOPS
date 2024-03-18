package Day11_oops.Commercial;

import java.time.LocalDateTime;

public class Share_information {
    static String symbol;
    static int No_of_stock;
    LocalDateTime dateTime;

    public Share_information(String symbol, int no_of_stock, LocalDateTime dateTime) {
        this.symbol = symbol;
        No_of_stock = no_of_stock;
        this.dateTime = dateTime;
    }

    public static String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static int getNo_of_stock() {
        return No_of_stock;
    }

    public void setNo_of_stock(int no_of_stock) {
        No_of_stock = no_of_stock;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Share_information{" +
                "symbol='" + symbol + '\'' +
                ", No_of_stock=" + No_of_stock +
                ", dateTime=" + dateTime +
                '}';
    }
}
