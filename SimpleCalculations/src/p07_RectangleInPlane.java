import java.text.DecimalFormat;
import java.util.Scanner;

public class p07_RectangleInPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());

        double width = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) + Math.min(y1, y2);

        DecimalFormat decimalFormat = new DecimalFormat("#.#########");
        System.out.println(decimalFormat.format(width*height));
        System.out.println(decimalFormat.format(2*(width+height)));
    }
}
