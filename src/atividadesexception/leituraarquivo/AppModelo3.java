package atividadesexception.leituraarquivo;

import javax.swing.*;

public class AppModelo3 {
    // Aqui usaremos uma classe chamada "ARQUIVO" para melhorar o código.

    public static void main(String[] args) {
        String caminhoArquivo = "E:\\Repositorio GitHub\\estudos-em-java\\src\\atividadesexception\\leituraarquivo\\usuarios.txt";

        Arquivo arquivo = new Arquivo();
        try{
             String resultado = arquivo.ler(caminhoArquivo);
        System.out.println(resultado);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo");
        }



    }

}
