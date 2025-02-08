//Classe
public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Marielle";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Metodo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
