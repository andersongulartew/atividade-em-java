package atividadesexception.leituraarquivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        //String caminhoArquivo = "E:\\Repositorio GitHub\\estudos-em-java\\src\\atividadesexception\\leituraarquivo\\usuarios.txt";
        String caminhoArquivo = "E:\\Repositorio GitHub\\estudos-em-java\\src\\atividadesexception\\leituraarquivo\\usuariosgnfhgh.txt";
        BufferedReader leitor = null;
        try {
            // Responsável por ler o arquivo
            FileReader leitorArquivo = new FileReader(caminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);

            String linha = leitor.readLine();//vai ler linha por linha, precisa fazer isso para ler cada linha

         /* linha = leitor.readLine();// vai retornar maria
            System.out.println(linha);
            linha = leitor.readLine();// vai retornar romário
            System.out.println(linha);
            linha = leitor.readLine();// sempre que retornar NULL, significar que acabou o arquivo
            System.out.println(linha); */

            while (linha != null) { // laço de repetição para percorrer o arquivo inteiro
                System.out.println(linha);
                linha = leitor.readLine();
            }

        } catch (Exception e) {
            // Vai tratar o erro
            System.out.println("Ocorreu um erro ao ler o arquivo");
            System.out.println(e.getMessage());
        } finally {
            if (leitor != null) {
                leitor.close();
            }

        }


    }
}
