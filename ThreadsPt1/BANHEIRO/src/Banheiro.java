public class Banheiro{

    private boolean ehSujo = true;



    public void mijar(){

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized(this){
            System.out.println(nome + " está entrando no banheiro");

            while(ehSujo){
                esperaLaFora(nome);
            }

            System.out.println(nome + " está fazendo xixi");
            dormir(8000);
            this.ehSujo = true;
            System.out.println(nome + ": Estou saindo do banheiro");
        }

        
    }

    public void cagar(){

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized(this){

            System.out.println(nome + " está entrando no banheiro");

            while(ehSujo){
                esperaLaFora(nome);
            }

            System.out.println(nome + " está fazendo cocô");
            dormir(10000);
            this.ehSujo = true;
            System.out.println(nome + ": Estou saindo do banheiro");
        }
    }

    public void esperaLaFora(String nome){
        System.out.printf("%s: Eca, banheiro sujo!\n", nome);
        dormir(1500);
        try{
            this.wait();
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public void limpa(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " batendo na porta");
        synchronized(this){
            System.out.println(nome + " está entrando no banheiro");

            if(!ehSujo){
                System.out.println(nome + ": Entrei atoa. Já tá limpo!");
            } else{
                System.out.println("Limpando...");
                dormir(8000);
                this.ehSujo = false;
                this.notifyAll();
                System.out.println("Limpei o banheiro :)");
                System.out.println(nome + ": Estou saindo do banheiro");
            }
            
        }
    }

    public void dormir(long tempo){
        try{
            Thread.sleep(tempo);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }       
    }
}