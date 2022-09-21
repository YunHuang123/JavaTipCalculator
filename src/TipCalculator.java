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

        System.out.println("Tip Amount: $" + String.format("%.2f", tipAmount));
        System.out.println("Total Pay: $" + String.format("%.2f", totalPay));
        System.out.println("Tip per Person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total Pay per Person: $" + String.format("%.2f", payPerPerson));
    }
}
