import java.util.Scanner;

public class Menu {

    private String cep;
    public void geraMenu(){
        System.out.println("Bem vindo ao buscaCEP, digite o CEP que deseja consultar:");
        Scanner scanner = new Scanner(System.in);
        this.cep = scanner.nextLine();
    }

    public String getCep() {
        return cep;
    }
}
