public class Atividade1 {
    public static void main (String[] args){
        float joao = (float) 1.5;
        float ze = (float) 1.1;
        int ano = 0;
        do{
            joao += 0.02;
            ze += 0.03;
            ano++;
        }while(ze<=joao);
        System.out.println("Zé sera maior que joão em "+ano+" anos");

    }
    
}
