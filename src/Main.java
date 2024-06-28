public class Main {
    public static void main(String[] args){

        Menu menu = new Menu();
        menu.geraMenu();
        String cep = menu.getCep();

        try {
            ConsultaCep consultaCep = new ConsultaCep();
            Endereco endereco = consultaCep.buscaEndereco(cep);

            GeradorArquivo geraArquivo = new GeradorArquivo();
            geraArquivo.geraJson(endereco);

        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
            System.out.println("Programa finalizado.");
        }

    }
}