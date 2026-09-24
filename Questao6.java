public class Questao6 {
    public static void main(String[] args) {
        int capacidadeTanque = 50;
        int combustivelAtual = 20;

        int litrosFaltantes = capacidadeTanque - combustivelAtual;

        System.out.println("Capacidade total do tanque: " + capacidadeTanque + " litros");
        System.out.println("Quantidade atual: " + combustivelAtual + " litros");
        System.out.println("Faltam para encher o tanque: " + litrosFaltantes + " litros");
    }
}