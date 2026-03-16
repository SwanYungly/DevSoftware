import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Digite o tempo em segundos: ");
        int tempoTotalSegundos = scan.nextInt();

        // pega o numero no scan e divide por quantos segundos tem uma hora
        int horas = tempoTotalSegundos / 3600;

      
        int restoHoras = tempoTotalSegundos % 3600;

        
        int minutos = restoHoras / 60;

      
        int segundos = restoHoras % 60;

        // 6. Exibindo o resultado final formatado
        System.out.println("\nResultado:");
        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");

        scan.close();
    }
}