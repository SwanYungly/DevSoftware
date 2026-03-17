import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int vetor1[] = new int[10];
            int vetor2[] = new int[10];
            int vetor3[] = new int[10];
            int k =0;

            for(int i=0; i<10;i++){
                System.out.println("Digite o "+(i+1)+"° número do primeiro vetor: ");
                vetor1[i] = scan.nextInt();
            }
            for(int i=0; i<10;i++){
                System.out.println("Digite o "+i+"° número do segundo vetor: ");
                vetor2[i] = scan.nextInt();
            }
            for(int i=0; i<10; i++){
                for(int f=0; f<10; f++){
                    if(vetor1[i]==vetor2[f]){
                        
                        vetor3[k] = vetor1[i];
                        k++;
                        break;
                    }
                }
            }
            
            for(int i = 0; i<k;i++){
                System.out.println("Os valores da posição "+i+" do vetor 3 é: "+vetor3[i]);
            }
        }
    }
}
