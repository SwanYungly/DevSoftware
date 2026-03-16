import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Digite o nome do produto: ");
        String nome = scan.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scan.nextInt();

       
        double valorTotal = preco * quantidade;
        double porcentagemDesconto = 0.0;

        
        if (quantidade <= 10) {
            porcentagemDesconto = 0.0; 
        } else if (quantidade >= 11 && quantidade <= 20) {
            porcentagemDesconto = 0.10; 
        } else if (quantidade >= 21 && quantidade <= 50) {
            porcentagemDesconto = 0.20; 
        } else if (quantidade > 50) {
            porcentagemDesconto = 0.25; 
        }

        
        double valorDoDesconto = valorTotal * porcentagemDesconto;
        double valorFinal = valorTotal - valorDoDesconto;

      
        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Produto: " + nome);
        System.out.println("Valor total a ser pago: R$ " + valorFinal);

        
        scan.close();
    }
}