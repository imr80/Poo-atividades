public class Questao7 {
    public static void main(String[] args) {
        final double TAXA_ENTREGA = 6.00;
        double valorPedido = 45.50;

        double valorTotal = valorPedido + TAXA_ENTREGA;

        System.out.println("Valor do pedido: R$ " + valorPedido);
        System.out.println("Taxa de entrega: R$ " + TAXA_ENTREGA);
        System.out.println("Valor total a pagar: R$ " + valorTotal);
    }
}