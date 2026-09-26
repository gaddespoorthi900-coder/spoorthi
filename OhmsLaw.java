import java.util.Scanner;

class OhmsLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current (I): ");
        double I = sc.nextDouble();

        System.out.print("Enter resistance (R): ");
        double R = sc.nextDouble();

        double V = I * R;

        System.out.println("Voltage = " + V + " V");
    }
}
