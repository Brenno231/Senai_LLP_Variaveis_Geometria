
import java.util.Scanner;

public class AreaPiramide {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println(
                    "Digite os valores respectivamente, valor do lado da base da pirâmide e a altura da pirâmide!!!!!!!");
            return;
        }
        Scanner ler = new Scanner(System.in);
        double ladoBase = Double.parseDouble(args[0]);
        double alturaPiramide = Double.parseDouble(args[1]);
        double areaDaBase, areaDoLado;
        System.out.println("A pirâmide é de base quadrada ou triangular?");
        String tipoDeBase = ler.next().toLowerCase();
        if (tipoDeBase.equals("quadrada")) {
            double apotemaQuadrado = Math.sqrt(Math.pow(alturaPiramide, 2.0) + Math.pow(ladoBase / 2.0, 2.0));
            areaDaBase = ladoBase * ladoBase;
            areaDoLado = ladoBase * apotemaQuadrado / 2.0;
            areaDoLado *= 4;
        } else if (tipoDeBase.equals("triangular")) {
            double apotemaBase = ladoBase / (2.0 * Math.sqrt(3));
            double apotemaTriangular = Math.sqrt(Math.pow(alturaPiramide, 2.0) + Math.pow(apotemaBase, 2.0));
            areaDaBase = (ladoBase * ladoBase * Math.sqrt(3.0)) / 4.0;
            areaDoLado = ladoBase * apotemaTriangular / 2.0;
            areaDoLado *= 3;
        } else {
            System.out.println("Tipo de base inválido");
            return;
        }
        double areaTotal = areaDoLado + areaDaBase;
        System.out.printf("A área da pirâmide é: %.2f\n", areaTotal);
    }
}