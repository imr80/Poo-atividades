public class Questao15 {
    public static void main(String[] args) {
        int horario = 14; // Exemplo: 14 horas

        // Operador ternário para classificar o voo (entre 6h e 18h é Diurno)
        String tipoVoo = (horario >= 6 && horario <= 18) ? "Diurno" : "Noturno";

        System.out.println("Horário do voo: " + horario + "h");
        System.out.println("Classificação: " + tipoVoo);
    }
}