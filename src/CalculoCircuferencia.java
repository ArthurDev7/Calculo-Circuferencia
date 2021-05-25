import java.util.Scanner;

public class CalculoCircuferencia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Raio:");
        double raio = scan.nextDouble();

        double area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);
    }
}