public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(12, .3, .05);
    }

}
