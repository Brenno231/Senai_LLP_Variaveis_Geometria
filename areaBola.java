public class areaBola {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Digite o raio da Bola!!!!!!");
        }
        double areaDaBola, raio;
        raio = Double.parseDouble(args[0]);
        areaDaBola = 4 * Math.PI * raio * raio;
        System.out.printf("A área da bola é: %.2f",areaDaBola);
    }
}
