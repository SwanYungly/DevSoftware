import java.util.Scanner;

public class Atividade5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos funcionários a empresa possui? ");
        int quantidadeFuncionarios = scan.nextInt();

        double[] salarios = new double[quantidadeFuncionarios];
        double somaSalarios = 0.0;

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
            salarios[i] = scan.nextDouble();
            somaSalarios = somaSalarios + salarios[i]; 
        }

        double mediaSalarial = somaSalarios / quantidadeFuncionarios;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("A média salarial da empresa é: R$ " + mediaSalarial);

        int contadorAcimaDaMedia = 0;
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (salarios[i] > mediaSalarial) {
                contadorAcimaDaMedia++; 
            }
        }

        System.out.println("Quantidade de funcionários que ganham acima da média: " + contadorAcimaDaMedia);

        scan.close();
    }
}