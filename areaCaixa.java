public class areaCaixa {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Por favor digite respectivamente o comprimento, a largura e a altura.");
            return;
        }
        double comprimento, largura, altura;
        comprimento = Double.parseDouble(args[0]);
        largura = Double.parseDouble(args[1]);
        altura = Double.parseDouble(args[2]);

        double areaDaCaixa = 2 * (comprimento * largura) + 2 * (comprimento * altura) + 2 * (largura * altura);
        System.out.printf("A área da caixa é -> %.2f\n", areaDaCaixa);
    }
}