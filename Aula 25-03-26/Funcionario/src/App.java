import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao = 0; 
        Funcionario func = new Funcionario();
        
        
        while (opcao !=5) {
            System.out.println("---- FUNCIONARIO ----");
            System.out.println("1. Contratar");
            System.out.println("2. Informações");
            System.out.println("3. Bonificar");
            System.out.println("4. Demitir");
            System.out.println("5. Sair");
            opcao = sc.nextInt();
        }
    }
}
