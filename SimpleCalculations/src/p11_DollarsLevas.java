import java.text.DecimalFormat;
        import java.util.Scanner;

public class p11_DollarsLevas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("USD = ");
        Double dollars = Double.parseDouble(scanner.nextLine());
        Double levas = dollars * 1.79549;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        //System.out.print("BGN: ");
        System.out.println(decimalFormat.format(levas));
    }
}
