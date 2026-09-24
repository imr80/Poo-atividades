public class Questao19{
    public static void main(String[] args) {
        int[] temperaturas = {25, 28, 30, 22, 27, -100};
        int soma = 0;
        int i = 0;

        while (temperaturas[i] != -100) {
            soma += temperaturas[i];
            i++;
        }

        System.out.println("Soma total das temperaturas: " + soma);
    }
}