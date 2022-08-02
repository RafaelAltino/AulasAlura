public class ImprimindoId {
    public static void main(String[] args) throws Exception{

        Contador ct = new Contador();
        Thread td1 = new Thread(ct);
        Thread td2 = new Thread(ct);

        td1.start();
        td2.start();



        





    }
}
