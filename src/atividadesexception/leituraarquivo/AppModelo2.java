package atividadesexception.leituraarquivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class AppModelo2 {
    // USANDO O TRY WITH RESOURSE (otimiza o código)
     public static void main(String[] args) throws Exception {
        String caminhoArquivo = "E:\\Repositorio GitHub\\estudos-em-java\\src\\atividadesexception\\leituraarquivo\\usuarios.txt";
        //String caminhoArquivo = "E:\\Repositorio GitHub\\estudos-em-java\\src\\atividadesexception\\leituraarquivo\\usuariosgnfhgh.txt";


        try(BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha = leitor.readLine();

            while (linha != null) { // laço de repetição para percorrer o arquivo inteiro
                System.out.println(linha);
                linha = leitor.readLine();
            }

        }catch (Exception e){
            System.out.println("Ocorreu um erro ao ler o arquivo");

        }




    }

}
