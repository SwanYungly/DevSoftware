
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        cls();
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta(); // Declarando e instanciando um objeto da classe conta

        // Editando atributos do objeto
        int opcao = 0;
        while (opcao != 5) {
            System.out.println(
                    "---- SISTEMA BANCARIO ----\n1.Cadastrar conta\n2.Listar conta\n3.Sacar\n4.Depositar\n5.Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    cls();
                    System.out.println("--- CADASTRAR CONTA ----");
                    System.out.println("Digite o nome do cliente");
                    conta1.setNome(sc.nextLine()); // lendo o nome do teclado
                    System.out.println("Digite o número da conta");
                    conta1.setNumero(sc.nextInt());
                    System.out.print("Digite o saldo da conta: R$");
                    conta1.deposito(sc.nextDouble());
                    System.out.print("Digite o limite da conta: R$");
                    conta1.setLimite(sc.nextDouble());
                    cls();
                    break;
                case 2:
                    cls();
                    System.out.println("---- Listar conta ----");
                    System.out.println("Nome: " + conta1.getNome() + "\nNúmero: " + conta1.getNumero() + "\nSaldo: R$"
                            + conta1.getSaldo() + "\nLimite: R$" + conta1.getLimite());
                    System.out.println("Digite enter para continuar...");
                    sc.nextLine();
                    cls();
                    break;
                case 3:
                    cls();
                    System.out.println("---- SAQUE ----\n");
                    System.out.print("Digite o valor do saque: R$");
                    double valor = sc.nextDouble();
                    // conta1.saque(valor);
                    if (conta1.sacaVerifica(valor)) {
                        System.out.println("Saque efetuado com sucesso !!");

                    } else {
                        System.out.println("Saldo insuficiente para o saque!!");
                    }
                    System.out.println("Digite enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    cls();
                    break;
                case 4:
                    cls();
                    System.out.println("---- DEPOSITO ----\n");
                    System.out.print("Digite o valor do deposito: R$");
                    double valorDeposito = sc.nextDouble();
                    conta1.deposito(valorDeposito);
                    System.out.println("Digite enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    cls();
                case 5:
                    cls();
                    System.out.println("Codigo finalizado!!");
                    cls();
                    break;
                default:
                    cls();
                    System.out.println("Opção invalida");

            }

        }
        sc.close(); // fechar o scanner

    }

    public static void cls() throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }

    

}
