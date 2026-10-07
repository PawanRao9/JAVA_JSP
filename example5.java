// calculate total generate electricity bill
public class example5 {
    static double electricityBill(int unit) {
        double bill = 0.0;
        if(unit>=100){
            bill = unit*5;
        }
        bill = bill+(bill * 0.18);
        return bill;
    }



    public static void main(String[] args) {
        int units = 100;
        double bill = electricityBill(units);
        System.out.println("Total electricity bill for " + units + " units: " + bill);
    }
}
