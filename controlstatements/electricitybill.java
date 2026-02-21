import java.util.Scanner;
public class bill {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Customer name:");
        String name = s.nextLine();
        System.out.println("Enter the previous reading unit:");
        double prev = s.nextDouble();
        System.out.println("Enter the current reading unit:");
        double curr = s.nextDouble();
        System.out.println("Enter the consumer type:");
        String type = s.next();
        double unit = curr - prev;
        double bill = 0;
 if (type.equalsIgnoreCase("domestic")) {
            if (unit <= 100) {
                bill = unit * 4.80;
            } else if (unit <= 200) {
                bill = (100 * 4.80) + ((unit - 100) * 5.80);
            } else {
                bill = (100 * 4.80) + (100 * 5.80) + ((unit - 200) * 6.50);
            }
        } else if (type.equalsIgnoreCase("nondomestic")) {
            if (unit <= 100) {
                bill = unit * 6.05;
            } else {
                bill = (100 * 6.05) + ((unit - 100) * 8.50);
            }
        }
        System.out.println("Customer name: " + name);
        System.out.println("The usage slab(units): " + unit);
        System.out.println("Bill amount: " + bill);
        s.close();
    }
}
