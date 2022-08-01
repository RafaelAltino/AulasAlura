public class Conexao extends RuntimeException{
    public void leDados(){
        System.out.println("Lendo dados...");
        throw new IllegalStateException("má conexão");

    }

    public void fecha(){
        System.out.println("Fechando conexao...");
    }
}
