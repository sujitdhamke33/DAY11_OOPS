package Day11_oops.Commercial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Stock_Account {
   List<Share_information> stockAccountlist;

   public Stock_Account(){
       stockAccountlist = new ArrayList<>();
   }

    public void buy(String stock_symbol, int No_of_stock, LocalDateTime date_Time)
    {
        updatestockaccount(stock_symbol,No_of_stock,date_Time);
        System.out.println("No. of share buy is : "+No_of_stock +" and Stock Symbol is : "+stock_symbol);

    }

    public void sell(String stock_symbol, int No_of_stock, LocalDateTime date_Time)
    {
        updatestockaccount(stock_symbol,-No_of_stock,date_Time);
        System.out.println("No. of share sell is : "+No_of_stock +" and Stock Symbol is : "+stock_symbol);
    }

    private void updatestockaccount(String stock_symbol, int no_of_stock, LocalDateTime date_Time) {
        boolean Ispresent=false;

        for(Share_information companyshare : stockAccountlist)
        {
            if(Share_information.getSymbol().equals(stock_symbol))
            {
                companyshare.setNo_of_stock(Share_information.getNo_of_stock()+ no_of_stock);
                Ispresent=true;
                break;
            }
        }

        if(!Ispresent)
        {
            stockAccountlist.add(new Share_information(stock_symbol, no_of_stock, date_Time));
            System.out.println("No. of share buy is : "+no_of_stock +" and Stock Symbol is : "+stock_symbol);
        }

    }

    public List<Share_information> getCompanyshare()
    {
        return stockAccountlist;
    }
}
