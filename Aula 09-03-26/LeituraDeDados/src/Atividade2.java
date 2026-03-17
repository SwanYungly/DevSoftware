import java.util.Scanner;

public class Atividade2 {
    public static void main (String[] args)throws Exception{
    
        Scanner input = new Scanner(System.in);
        int codAluno = 1;
        do{
        
        System.out.println("Digite o código do aluno");
        codAluno = input.nextInt();
        if(codAluno==0){
            break;
        }
       
        System.out.println("Digite a primeira nota: ");
        int nota1 = input.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = input.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = input.nextInt();

        int media = (nota1+nota2+nota3)/3;
        System.out.println("Media final: "+media);
        System.out.println("-------------------------------------");
        }while(codAluno>0);
       System.out.println("Codigo encerrado");


    }
}
