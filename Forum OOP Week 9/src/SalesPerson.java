public class SalesPerson {

    private String id;
    private Sales[] salesHistory;
    private int count = 0;

    /* a */
    public SalesPerson(String id){
        this.id = id;
        this.salesHistory = new Sales[100];
        this.count = 0;
    }
    /* a */
    public SalesPerson(String id, Sales[] s, int c){
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    public int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count = count +1;
    }

    public double calcTotalSales(){
        double totalSales = 0.0;
        for (int i = 0; i < count; i++) {
            totalSales += salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return totalSales;
    }

    public Sales largestSale(){
        Sales largest = salesHistory[0];
        for(int i = 1; i < count; i++) {
            if (salesHistory[i].getValue() > largest.getValue()) {
                largest = salesHistory[i];
            }
        }
        return largest;
    }

    public Sales getSalesHistory (int index) {
        if (index >= 0 && index < count) {
            return salesHistory[index];
        }
        return null;
    }

}
