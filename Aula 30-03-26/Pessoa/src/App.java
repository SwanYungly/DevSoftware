import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Ler dados para instanciar a classe Pessoa
        System.out.println("Digite o nome da pessoa");
        String nome = sc.next();
        //sc.next(); Limita o buffer
        System.out.println("Digite o CPF: ");
        String cpf = sc.next();

        Pessoa pl = new Pessoa(nome,cpf); //utiliza construtor de 2 parametros
        Calendar data = Calendar.getInstance();
        data.set(2000, 2,7);

        pl.setNascimento(data);
        System.out.println(pl.toString);
        sc.close();
    }
}
