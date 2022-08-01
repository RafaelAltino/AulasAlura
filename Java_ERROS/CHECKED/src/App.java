public class App {

    public static void main(String[] args)throws Exception {
        System.out.println("Ini do main");
        try{
            metodo1();
        } catch(Exception e){
            System.out.println("ArithmeticException: " + e);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2(){
        System.out.println("Ini do metodo2");
        try{
            throw new MinhaExcecao("deu ruim");
        } catch(MinhaExcecao ex){}
        
        
        //System.out.println("Fim do metodo2");
    }
}