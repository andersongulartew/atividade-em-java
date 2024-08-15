package atividadesexception.leituraarquivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
    public String ler(String caminhoArquivo) throws Exception {
        String conteudo = "";
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();

            while (linha != null) { // laço de repetição para percorrer o arquivo inteiro
                conteudo += linha + "\n";
                linha = leitor.readLine();

//                if(linha != null){
//                    conteudo += "\n";
//                }

            }

        } catch (Exception erro) {
            //System.out.println("Ocorreu um erro ao ler o arquivo");
            throw erro;

        }
        return conteudo;


    }

}
