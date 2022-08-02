public class Contador implements Runnable{
    public void run(){
        for(int i = 0; i < 300; i++){
            
            Thread atual = Thread.currentThread();
            long id = atual.getId();
            System.out.println("ID da thread: " + id + " - " + i);
        }
    }
    
}
