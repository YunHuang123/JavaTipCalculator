import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Total Bill: $");
        Double totalBill = s.nextDouble(); //stores the user input in totalBill

        System.out.print("Tip Percentage: ");
        int tipPercentage = s.nextInt(); //stores the user input in tipPercentage

        System.out.print("Number of People: ");
        int numPeople = s.nextInt();  //stores the user input in numPeople

        double tipAmount = ((double) tipPercentage / 100) * totalBill; //solves for the tip amount
        double totalPay = tipAmount + totalBill;  //solves for the total amount of money paid
        double tipPerPerson = tipAmount / numPeople; //solves for the amount of tip paid for person
        double payPerPerson = totalPay / numPeople; //solves for total amount of money paid per person

        System.out.println("Tip Amount: $" + String.format("%.2f", tipAmount));
        System.out.println("Total Pay: $" + String.format("%.2f", totalPay));
        System.out.println("Tip per Person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total Pay per Person: $" + String.format("%.2f", payPerPerson));
        //prints out everything in the correct format
    }
}
