import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      Calculadora op = new Calculadora();

      System.out.print("Digite o primeiro número: ");
      op.setNum1(sc.nextInt());
      System.out.print("Digite o segundo número: ");
      op.setNum2(sc.nextInt());

      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      System.out.println("Soma: "+op.getNum1()+" + "+op.getNum2()+" = "+ op.soma()+"\n");
      System.out.println("Subtração: "+op.getNum1()+" - "+op.getNum2()+" = "+ op.subtracao()+"\n");
      System.out.println("Multiplicação: "+op.getNum1()+" x "+op.getNum2()+" = "+ op.multiplicacao()+"\n");
      System.out.println("Divisão: "+op.getNum1()+" ÷ "+op.getNum2()+" = "+ op.divisao()+"\n");
    }
}
