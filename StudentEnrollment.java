import java.util.Scanner;

public class StudentEnrollment {

    // compute the total enrollment fee
    public static int computeFee(int units) {
        int feePerUnit = 1000;
        return units * feePerUnit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // collect student information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Number of Units (Max 10): ");
        int units = scanner.nextInt();

        // put the unit/s of course
        if (units > 10) {
            System.out.println("Error: Maximum number of units is 10.");
            return;
        }

        // compute the total enrollment fee
        int totalFee = computeFee(units);

        // output the student's name and total enrollment fee
        System.out.println("\n--- Enrollment Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        // payment Section
        System.out.print("\nEnter Payment Amount: ");
        int payment = scanner.nextInt();

        // check if the payment is fully paid or partially paid
        if (payment == totalFee) {
            System.out.println("Payment Status: Fully Paid");
        } else if (payment < totalFee) {
            System.out.println("Payment Status: Partial Payment");
            System.out.println("Amount Paid: " + payment);
            System.out.println("Remaining Balance: " + (totalFee - payment));
        } else {
            System.out.println("Error: Payment exceeds total fee.");
        }

        scanner.close();
    }
}