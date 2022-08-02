public class Conexao implements AutoCloseable{

    public Conexao(){
        System.out.println("Abrindo a conexão...");
    }

    public void lerDados(){
        System.out.println("Lendo os dados...");
        throw new MinhaExcecao("Xablau");
    }

    public void fechar(){
        System.out.println("Fechando a conexão...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("O close more");
        
    }
}
