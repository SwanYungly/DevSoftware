public class App {
    public static void main(String[] args) throws Exception {
        // Utilizando construtor cheio
        Carro car = new Carro("Gol", "Preto", "AAA3E34", 2);
        System.out.println(car.toString());
        Carro car2 = new Carro(); // utilizando o construtor vazio
    }
}
