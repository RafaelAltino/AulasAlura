public class TarefaNumero1 implements Runnable{

    private Banheiro banheiro;

    public TarefaNumero1(Banheiro banheiro){
        this.banheiro = banheiro;
    }

    public void run(){
        banheiro.mijar();
    }    
}