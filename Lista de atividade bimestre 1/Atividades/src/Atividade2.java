import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        while(continuar!=0){
        System.out.print("Digite um número inteiro para verificar se é de Fibonacci: ");
        int numeroInformado = scan.nextInt();

       
        int anterior = 1;
        int atual = 1;
        int proximo;

        
        if (numeroInformado == 1) {
            System.out.println("O número " + numeroInformado + " faz parte da sequência de Fibonacci.");
        } else {
            
            while (atual < numeroInformado) {
                proximo = anterior + atual;
                
                
                anterior = atual;
                atual = proximo;
            }

            
            if (atual == numeroInformado) {
                System.out.println("O número " + numeroInformado + " faz parte da sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numeroInformado + " NÃO faz parte da sequência de Fibonacci.");
            }
        }
        System.out.println("Digite 0 para encerrar o programa: ");
        continuar = scan.nextInt();
        
    }
    scan.close();
}
}


