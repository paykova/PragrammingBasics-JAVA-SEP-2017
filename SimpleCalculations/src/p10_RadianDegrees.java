import java.text.DecimalFormat;
        import java.util.Scanner;

public class p10_RadianDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double rad = Double.parseDouble(scanner.nextLine());
        Double deg = rad*180/Math.PI;

        DecimalFormat decimalFormat = new DecimalFormat ("#");
        System.out.println(decimalFormat.format(deg));

    }
}
