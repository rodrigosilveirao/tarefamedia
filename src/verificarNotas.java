import java.util.Scanner;

public class verificarNotas {
    public static void 7 (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3  + nota4) / 4;

                if (media >= 7) {
                    System.out.println("Aprovado.");
                } else if (media >= 5) {
                    System.out.println("Recuperacao.");
                } else {
                    System.out.println("Reprovado.");
                }
                scanner.close();
    }
}