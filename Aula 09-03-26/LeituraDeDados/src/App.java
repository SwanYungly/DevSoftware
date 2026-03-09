import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in); // inicia o leitor 
        System.out.println("Digite um número: "); // exibe a mensagem
        int numero =  input.nextInt(); // Lê do teclado
        System.out.println("Você digitou o número: "+numero); // exibe o numero digitado
        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();

        int soma = numero + numero2;
        System.out.println("O resultado da soma é " + soma);

        int num1 = 0;
        while(num1<=10){
            System.out.println("- " + (num1++));
        }

        input.close(); // fecha o leitor
        

    }
}
