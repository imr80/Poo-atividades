public class Questao5 {
    public static void main(String[] args) {
        int valorAluguel = 1250;
        int numeroColegas = 3;

        int valorPorPessoa = valorAluguel / numeroColegas;
        int resto = valorAluguel % numeroColegas;

        System.out.println("Valor total do aluguel: R$ " + valorAluguel);
        System.out.println("Número de colegas: " + numeroColegas);
        System.out.println("Cada um deve pagar: R$ " + valorPorPessoa);
        System.out.println("Valor restante (resto): R$ " + resto);
    }
}