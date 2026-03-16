import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\n--- Elementos do vetor (sem repetições) ---");

        for (int i = 0; i < 20; i++) {
            boolean jaApareceu = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    jaApareceu = true;
                    break;
                }
            }

            if (!jaApareceu) {
                System.out.println(numeros[i]);
            }
        }

        entrada.close();
    }
}