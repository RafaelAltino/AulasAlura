public class Brincando {
    public static void main(String[] args) throws Exception {
        new Thread( () -> System.out.println("Policial disfarçado!"))
        .start();
    }
}
