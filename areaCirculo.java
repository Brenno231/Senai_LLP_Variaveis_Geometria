public class areaCirculo {
    public static void main(String[] args) {
        double raio = Double.parseDouble(args[0]);
        if (args.length == 0){ 
            System.out.println("Você não digitou nada, Digite algo por favor!!!");
            return;
    }
    Double area = raio * raio * Math.PI;
    System.out.printf("Area do círculo é: %.2f",area);


    }
}
