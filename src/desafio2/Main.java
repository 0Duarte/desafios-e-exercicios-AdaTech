package desafio2;

public class Main {
    public static void main(String[] args) {
        // Funcionário 1, menos de 7 dias
        Reembolso r1 = new Reembolso("Carla", 5);
        double total1 = r1.calcularReembolso(150.0, 100.0, 135.0);
        r1.imprimirResumoReembolso(total1);

        // Funcionário 2, mais de 7 dias, com hospedagem
        Reembolso r2 = new Reembolso("João", 10);
        double total2 = r2.calcularReembolso(200.0, 120.0, 180.0);
        r2.imprimirResumoReembolso(total2);

        // Funcionário 3, mais de 7 dias, sem hospedagem
        Reembolso r3 = new Reembolso("Ana", 8);
        double total3 = r3.calcularReembolso(180.0, 90.0);
        r3.imprimirResumoReembolso(total3);
    }
}

