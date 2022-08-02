public class TestaThread {
    public static void main(String[] args) throws Exception {
        System.out.println("Comecei o main");
        ImprimeString runavel = new ImprimeString("Você aprimorou o bagulho cara!");
        Thread td = new Thread(runavel);
        td.start();

        System.out.println("comecei a dormir");
        Thread.sleep(5000);
        System.out.println("acordei");

        System.out.println("Finalizando o main");



    }
}
