public class Main {

    public static double employeeSalary(double hours, double amount) {

        if (hours < 0) {
            return -1;
        }

        if (amount < 0) {
            return -1;
        }
        
        double totalWeek = hours * amount;
        double totalYear = totalWeek * 52;
        return totalYear;
    }
    public static void main(String[] args) {

        double salary = employeeSalary(40, 35);
        System.out.println(salary);

        double excludingVacation = salary - (8 * 8 * 35);
        System.out.println(excludingVacation);
        
    }

}
