

public class App {
    public static void main(String[] args) throws Exception {

            Animal cavalo = new Animal("Pé de pano", 2);
            Ave papagaio = new Ave("Loro", 2);
            papagaio.setPeso(0.5f);
            papagaio.andar();
            System.out.println(papagaio.toString());
            System.out.println(cavalo.toString());
    }
}
