public class ImprimeString implements Runnable{
    private String msg;
    public ImprimeString(String msg){
        this.msg = msg;
    }
    public void run(){
        System.out.println(msg);
    }
}
