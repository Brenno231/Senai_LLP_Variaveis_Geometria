
import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        double base = ler.nextDouble();

        System.out.println("Digite a altura");
        double altura = ler.nextDouble();

        double area = base * altura / 2;
        System.out.printf("A área do triângulo é: %.2f\n",area);
    }
}
