import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {


    public void geraJson(Endereco endereco) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter file = new FileWriter(endereco.cep() + ".json");
            file.write(String.valueOf(gson.toJson(endereco)));
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Não foi possível gerar o arquivo com os dados do endereço. " + e);
        }
        System.out.println("Os dados do CEP estão disponíveis do arquivo 'endereco.json'");
    }
}
