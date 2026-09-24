public class Questao20 {
    public static void main(String[] args) {
        boolean pago = false;
        int emissao = 1;

        do {
            System.out.println("Emitindo boleto de cobranca (Tentativa " + emissao + ")...");

            // Simulacao: o cliente realiza o pagamento na 3ª tentativa
            if (emissao == 3) {
                pago = true;
            }

            emissao++;
        } while (!pago);

        System.out.println("Pagamento confirmado! Cobranca finalizada.");
    }
}