package atividadesexception.leituraarquivo;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AppModelo4 {
        public static void main(String[] args) throws Exception{
        String caminhoArquivo = "E:\\Repositorio GitHub\\estudos-em-java\\src\\atividadesexception\\leituraarquivo\\usuarios.txt";

        try{
            Path caminho = Paths.get(caminhoArquivo);
            List<String>resultado = Files.readAllLines(caminho);// ler todas as linhas

            String conteudo = String.join(";\n", resultado);
            System.out.println(conteudo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo");
        }



    }
}
