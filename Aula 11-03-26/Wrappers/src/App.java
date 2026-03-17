import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses[] = {"Janeiro",
                         "Fevereiro",
                         "Março",
                         "Abril",
                         "Maio",
                         "Junho",
                         "Julho",
                         "Agosto",
                         "Setembro",
                         "Outubro",
                         "Novembro",
                         "Dezembro"};
        Scanner sc = new Scanner(System.in); // leitor do teclado
        System.out.println("Digite um número entre 1 e 12");
        int digitado = sc.nextInt()-1;
        while(digitado<0 || digitado>11){
            System.out.println("Número inválido, digite novamente:");
            digitado = sc.nextInt()-1;
        }
        
        // Exiba a qual mês o número digitado se refere
        System.out.println("O mês de "+meses[digitado]+" esta na posição "+digitado+ " do array");
        sc.close(); 
    }
}
