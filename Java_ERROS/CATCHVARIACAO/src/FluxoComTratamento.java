public class FluxoComTratamento {
    public static void main(String[] args)throws Exception{
        System.out.println("Inicio do main");
        try{
            metodo1();
        } catch(ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            ex.printStackTrace();
            System.out.println("Exception: " + msg);
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

        
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            int a = i / 0;
            System.out.println(a);
            // Conta c = null;
            // c.deposita();
        }

        System.out.println("Fim do método 2");
    }
}
