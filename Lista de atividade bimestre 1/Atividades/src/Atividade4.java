import java.util.Scanner;

public class Atividade4
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

       
        System.out.print("Digite um número inteiro de 1 a 12 para saber o mês: ");
        int numero = scan.nextInt();

        
        if (numero >= 1 && numero <= 12) {
            
            String nomeMes = meses[numero - 1];
            System.out.println("O mês correspondente é: " + nomeMes);
        } else {
            
            System.out.println("Inválido!");
        }

        scan.close();
    }
}