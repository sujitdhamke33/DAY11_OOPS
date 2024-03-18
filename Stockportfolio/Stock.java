package Day11_oops.Stockportfolio;

public class Stock {
        private String shareName;
        private int numShare;
        private double sharePrice;

        public Stock(String shareName, int numShare, double sharePrice) {
                this.shareName = shareName;
                this.numShare = numShare;
                this.sharePrice = sharePrice;
        }
        public double calculateStockValue(){
                return numShare * sharePrice;
        }

        @Override
        public String toString() {
                return
                        "shareName='" + shareName + '\'' +
                        ", numShare=" + numShare +
                        ", sharePrice=" + sharePrice;
        }

}


