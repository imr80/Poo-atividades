public class Questao3 {
    public static void main(String[] args) {
        // Declaração das variáveis
        int consumoKwh = 250;
        double valorPorKwh = 0.75;

        // Cálculo do valor total
        double valorTotal = consumoKwh * valorPorKwh;

        // Exibição dos resultados com mensagem explicativa
        System.out.println("=== Detalhamento da Conta de Luz ===");
        System.out.println("Consumo registado: " + consumoKwh + " kWh");
        System.out.println("Preço por kWh: R$ " + valorPorKwh);
        System.out.println("O valor total da sua conta de energia é: R$ " + valorTotal);
    }
}