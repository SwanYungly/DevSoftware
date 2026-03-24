
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         new ProcessBuilder("clear").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta(); // Declarando e instanciando um objeto da classe conta
        // Editando atributos do objeto
        int opcao = 0;
        while(opcao!=5){
            System.out.println("---- SISTEMA BANCARIO ----\n1.Cadastrar conta\n2.Listar conta\n3.Sacar\n4.Depositar\n5.Sair");
            opcao = sc.nextInt();
            sc.nextLine();
        switch(opcao){
            case 1:
            new ProcessBuilder("clear").inheritIO().start().waitFor();    
            System.out.println("--- CADASTRAR CONTA ----");
             System.out.println("Digite o nome do cliente");
                conta1.nome = sc.nextLine(); // lendo o nome do teclado
                System.out.println("Digite o número da conta");
                conta1.numero = sc.nextInt();
                System.out.print("Digite o saldo da conta: R$");
                conta1.saldo = sc.nextDouble();
                System.out.print("Digite o limite da conta: R$");
                conta1.limite = sc.nextDouble();
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                break;
            case 2:
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("---- Listar conta ----");
            System.out.println(conta1.toString());
            System.out.println("Digite enter para continuar...");
            sc.nextLine();
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            break;
            case 3:
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("---- SAQUE ----\n");
                System.out.print("Digite o valor do saque:");
                double valor = sc.nextDouble();
                // conta1.saque(valor);
                if(conta1.sacaVerifica(valor)){
                    System.out.println("Saque efetuado com sucesso !!");
                    System.out.println("Saldo: R$"+conta1.saldo);
                 }else{
                    System.out.println("Saldo insuficiente para o saque!!");
                }
                System.out.println("Digite enter para continuar...");
                sc.nextLine();
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                break;
            case 4:
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("---- DEPOSITO ----\n");
                System.out.print("Digite o valor do deposito: R$");
                double valorDeposito = sc.nextDouble();
                conta1.deposito(valorDeposito);
                System.out.println("Digite enter para continuar...");
                sc.nextLine();
                sc.nextLine();
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            case 5:
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("Codigo finalizado!!");
                break;
            default:
                new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("Opção invalida");
                
        }
       
        
        
        
    }sc.close(); // fechar o scanner
    }
} 
