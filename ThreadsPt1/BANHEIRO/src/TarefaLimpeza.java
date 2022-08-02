public class TarefaLimpeza implements Runnable{

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro){
        this.banheiro = banheiro;
    }

    public void run(){
        while(true){
            banheiro.limpa();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
        }
        
    }    
}