import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        double raio = input.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.println("A=" + String.format("%.4f", area));

        input.close();
    }

}
