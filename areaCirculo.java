public class areaCirculo {
    public static void main(String[] args) {
        if (args.length == 0){ 
            System.out.println("Você não digitou nada, Digite algo por favor!!!");
            return;
    }
    double raio = Double.parseDouble(args[0]);
    Double area = raio * raio * Math.PI;
    System.out.printf("Area do círculo é: %.2f",area);


    }
}
