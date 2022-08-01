public class Fluxo {
    public static void main(String[] args)throws Exception{
        System.out.println("Inicio do main");
        try{
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex){
            String msg = ex.getMessage();           
            System.out.println("Exception: " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");

        
    }
    private static void metodo1(){
        System.out.println("Inicio do método 1");

        metodo2();

        System.out.println("Fim do método 2");
    }


    private static void metodo2(){

        System.out.println("Início do método 2");

        throw new MinhaExcecao("Deu muito errado cara");

        // System.out.println("Fim do método 2");
    }
}
