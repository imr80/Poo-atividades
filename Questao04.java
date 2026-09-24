public class Questao4 {
    public static void main(String[] args) {
        double valorTotal = 23.50;
        double valorPago = 50.00;

        double troco = valorPago - valorTotal;

        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Valor pago pelo cliente: R$ " + valorPago);
        System.out.println("Troco a devolver: R$ " + troco);
    }
}