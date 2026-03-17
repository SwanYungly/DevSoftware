import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine(); // João
        
        System.out.println("Você digitou um texto com " + nome.length()+" caracteres");
        System.out.println("Digite outro nome");
        String nome2 = sc.nextLine();

        // Para comparar Strings utilizamos equals que considera a caixa
        if(nome.equals(nome2)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
        // Para comparar Strings ignorando a caixa
        if(nome.equalsIgnoreCase(nome2)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        String textoQuebrado[] = nome.split(" ");
        for(int i =0; i<4;i++){
        System.out.println(textoQuebrado[i]);
        }
        sc.close(); // sempre no fim do codigo
    }
}
