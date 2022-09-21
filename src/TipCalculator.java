import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Total Bill: $");
        Double totalBill = s.nextDouble();

        System.out.print("Tip Percentage: ");
        int tipPercentage = s.nextInt();

        System.out.print("Number of People: ");
        int numPeople = s.nextInt();

        double tipAmount = ((double) tipPercentage / 100) * totalBill;
        double totalPay = tipAmount + totalBill;
        double tipPerPerson = tipAmount / numPeople;
        double payPerPerson = totalPay / numPeople;

        System.out.println("$" + tipAmount);
        System.out.println("$" + totalPay);
    }
}
