package Day11_oops.Commercial;

import java.time.LocalDateTime;

public class Stock_Account_main {
    public static void main(String[] args) {
        Stock_Account stockAccount=new Stock_Account();

        stockAccount.buy("Apple", 20, LocalDateTime.now());
        stockAccount.sell("Apple", 5, LocalDateTime.now());


        for(Share_information companyshare : stockAccount.getCompanyshare())
        {
            System.out.println(companyshare);
        }
    }
}
