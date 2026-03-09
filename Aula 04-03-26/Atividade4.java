public class Atividade4{
    public static void main(String args[]){
        int  a= 30;
        int  b= 30;
        int  c= 59;
        boolean t=false;

        if (a+b>c && b+c>a && c+a>b){
            t = true;
        }
        else{
            System.out.println("Não é um triangulo");
            t = false;
        }
        if(a==b && b==c && t==true){
            System.out.println("É um triangulo Equilátero ");
        }
        else if((a==b || b==c) && t==true){
            System.out.println("É um triangulo Isosceles ");
        }
        else if(t==true){
            System.out.println("É um triangulo Escaleno ");
        }
    }
}