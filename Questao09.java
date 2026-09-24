public class Questao9 {
    public static void main(String[] args) {
        int idade = 65;
        boolean temCartaoSocio = false;

        boolean temDireitoDesconto = idade > 60 || temCartaoSocio;

        System.out.println("Tem direito ao desconto? " + temDireitoDesconto);
    }
}