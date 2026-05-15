public class areaTubo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Digite respectivamente o raio do tubo é a altura dele!!!!!!!!!");
            return;
        }
        double areaDoTubo, raio, altura;
        raio = Double.parseDouble(args[0]);
        altura = Double.parseDouble(args[1]);
        areaDoTubo = 2 * Math.PI * raio * altura;
        System.out.printf("A área do tubo é: %.2f\n", areaDoTubo);
    }
}
