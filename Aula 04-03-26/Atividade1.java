public class Atividade1 {
    public static void main(String args[]){
        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        j++;
        System.out.println("j: "+j);
        ++i;
        System.out.println("i: "+i);
        x = (i++) +j;
        System.out.println("x: "+x);
        y = (++j) + (++i);
        System.out.println("y: "+y);
    }
}