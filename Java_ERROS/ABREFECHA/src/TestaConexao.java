public class TestaConexao {
    public static void main(String[] args) throws Exception {
        try(Conexao con = new Conexao()){
            con.lerDados();
        } catch(Exception ex){
            System.out.println("Peguei...");
        }

    }
}
