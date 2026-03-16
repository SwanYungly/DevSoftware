import java.util.Scanner;

public class Atividade6 {

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números (X) você vai digitar? ");
        int x = scan.nextInt();

        int[] numeros = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        System.out.print("Quantos números primos (N) você quer exibir do array? ");
        int n = scan.nextInt();

        System.out.println("\n--- Resultados ---");
        int primosExibidos = 0; 

        for (int i = 0; i < x; i++) {
            if (verificarPrimo(numeros[i])) {
                System.out.println("Primo encontrado: " + numeros[i]);
                primosExibidos++; 
            }

            if (primosExibidos == n) {
                break; 
            }
        }

        if (primosExibidos < n) {
            System.out.println("(Havia apenas " + primosExibidos + " número(s) primo(s) no array).");
        }

        scan.close();
    }
}