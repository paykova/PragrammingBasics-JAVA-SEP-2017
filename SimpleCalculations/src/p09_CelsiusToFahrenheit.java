import java.text.DecimalFormat;
import java.util.Scanner;

public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double celsius = Double.parseDouble(scanner.nextLine());
        Double fahrenheit = celsius*1.8 +32;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(fahrenheit));

    }
}
