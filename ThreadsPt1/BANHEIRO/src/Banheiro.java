public class Banheiro{



    public void mijar(){

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized(this){
            System.out.println(nome + " está entrando no banheiro");
            System.out.println(nome + " está mijando");
            try{
                Thread.sleep(5000);
            } catch(InterruptedException ex){
                System.out.println("Sei lá: " + ex);
            }
            System.out.println(nome + " está balançando");
            System.out.println(nome + " está dando descarga");
            System.out.println(nome + " está lavando as mãos");
        }

        
    }

    public void cagar(){

        String nome = Thread.currentThread().getName();

                System.out.println(nome + " batendo na porta");

        synchronized(this){

            System.out.println(nome + " está entrando no banheiro");
            System.out.println(nome + " está cagando");
            try{
                Thread.sleep(10000);
            } catch(InterruptedException ex){
                System.out.println("Sei lá: " + ex);
            }
            
            System.out.println(nome + " está limpando a bunda");
            System.out.println(nome + " está dando descarga");
            System.out.println(nome + " está lavando as mãos");
        }
    }
}