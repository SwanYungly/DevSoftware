import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        // Animal animais[] = new Animal[10];
        //Animal doguinho = new Animal("Doguinho", 3, 5.5, 0); // Instanciando 1 obj da classe Aniaml
        
        //animais[0] = doguinho;
        //animais[0].mover();
        // animais[1] = new Peixe("Nemo",1, 0.2, 0, 0);
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Animal>animaisList = new ArrayList<>();

        String menu =   "1 - Cadastrar Animais\n"+
                        "2 - Listar Animais\n"+
                        "3 - Mover Animal \n"+
                        "4 - Editar Animal\n"+
                        "0 - Sair";
        
        int option = 0;
        do{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println(menu);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Cadastro Animais");
                    System.out.println("Escolha qual animal deseja cadastrar \n"+
                        "1 - Animal Genérico\n"+
                        "2 - Peixe\n"+
                        "3 - Ave\n");
                        int tipoAnimal = sc.nextInt();
                        System.out.println("Digite o nome do animal");
                        String nome = sc.next();
                        System.out.println("Digite a quantidade de patas do animal");
                        int patas = sc.nextInt();
                        System.out.println("Digite a velocidade do animal");
                        double velocidade = sc.nextDouble();
                        System.out.println("Digite um valor inteiro de localização");
                        int localizacao = sc.nextInt();
                        //especificidades
                        switch (tipoAnimal) {
                            case 1:
                                Animal a= new Animal(nome,patas,velocidade,localizacao);
                                animaisList.add(a);
                               
                                break;
                            case 2:
                                System.out.println("Digite em qual tipo de agua este peixe vive:\n" +
                                    "0 - Água doce\n1 - Água salgada");
                                    int agua = sc.nextInt();
                                    Peixe p = new Peixe(nome, patas, velocidade, localizacao, agua);
                                    animaisList.add(p);
                                    
                            case 3:
                                Ave ave = new Ave(nome, patas,velocidade,localizacao);
                                animaisList.add(ave);
                                
                                break;
                            default:
                                break;
                        }
                        System.out.println("Temos "+animaisList.size()+ " animais cadastrados"); //Exibe quantos animais tem cadastrados
                    break;
                case 2:
                    System.out.println("Listar Animais");
                    for(Animal animalItem : animaisList){
                        System.out.println(animalItem.toString());
                        sc.nextLine();
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Mover Animal");
                    for(Animal a : animaisList){
                        a.mover();
                    }
                    break;
                case 4:
                    System.out.println("Editar Animal");
                    break;
                case 0:
                    System.out.println("Encerrando o sistema");
                    break;
            
                default:
                    break;
            }
        }while(option !=0);


        

        // Associar objeto a posição do array
       // animais[0] = doguinho;
        // Utilizando objeto do um array
        //animais[0].mover();

       // animais[1] = new Peixe("Nemo", 1, 0.2, 3, 1);
        // animais[1].mover();
        // FOR EACH
        //for(Animal a: animais){
         //   if(a != null){
         //       a.mover();
            
      //  }
        // Versão clássica do FOR
        /*
        for(int i = 0; i< animais.length;i++){
            if(animais[i] != null){
                animais[i].mover();
            }
        }
        */
        // IMPLEMENTE A CLASSE AVE - ATRIBUTOS IDEM ANIMAL
        // MOVER DIFERENTE

   // }
    sc.close();
}
}
