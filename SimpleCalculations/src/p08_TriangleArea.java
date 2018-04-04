import java.text.DecimalFormat;
import java.util.Scanner;

public class p08_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double a = Double.parseDouble(scanner.nextLine());
        Double h = Double.parseDouble(scanner.nextLine());

        Double area = a*h/2;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(area));
    }
}
