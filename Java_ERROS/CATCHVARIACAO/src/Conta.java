public class Conta {
    void deposita(){}

    public static boolean saca(double valor){
        if(valor <= 100){
            System.out.println("Valor sacado");
            return true;
        }
        System.out.println("Valor muito alto");
        return false;
    }
}
