public class TiposVariaveis {
    public static void main(String[] args) {
        // String
        String meuNome = "Marielle Santos";

        // Tipos primitivos
        int idade = 28;
        double altura = 1.63;

        // Boolean
        boolean moraEmSP = true;

        // char
        char genero = 'F';

        System.out.println(
                "Nome: " + meuNome + " | Idade: " + idade + " anos" +
                        " | Altura: " + altura + " m" +
                        " | Gênero: " + genero +
                        " | Mora em SP? " + (moraEmSP ? "Sim" : "Não"));
    }
}
