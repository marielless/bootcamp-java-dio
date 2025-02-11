public class BoletimEstudantil {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7)
            System.out.println("APROVADO");

        else if (nota >= 5 && nota < 7)
            System.out.println("PROVA RECUPERAÇÃO");

        else
            System.out.println("REPROVADO");

    }
}
