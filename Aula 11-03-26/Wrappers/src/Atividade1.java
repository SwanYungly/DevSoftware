import java.util.Scanner;

public class Atividade1 {
    public static void main (String[] args){
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int max, min;

        for(int i = 0; i<10;i++){
            System.out.println("Digite o "+cont+"° valor");
            num[i] = sc.nextInt();
            cont++;
        }
        System.out.println("Digite o valor minimo:");
        min = sc.nextInt();
        System.out.println("DIgite o valor máximo");
        max = sc.nextInt();
        System.out.println("Os números entre "+min+" e "+max+" são:");
        for(int i =0;i<10;i++){
            if(num[i]>=min && num[i]<=max){
                System.out.println(num[i]);
            }
        } 
        sc.close();       
    }
}
