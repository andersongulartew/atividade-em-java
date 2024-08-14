package atividadesexception.errosucesso;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[]{10, 20, 30};

        // COM ERRO
        try {  // try -> tentar
            // ele vai tentar executar
            System.out.println("Número:");
            System.out.println(numeros[5]); // não existe posição 5

        } catch (Exception erro) {
            // catch -> capturar
            // tratar os erros capturados no bloco try
            // podera imprimir no console

            System.out.println(erro.getMessage());
        }
        System.out.println("Processo Finalizado");

        System.out.println("------------------------------------");

        // SEM ERRO
        try {  // try -> tentar
            // ele vai tentar executar
            System.out.println("Número:");
            System.out.println(numeros[1]);

        } catch (Exception erro) {
            // catch -> capturar
            // tratar os erros capturados no bloco try
            // podera imprimir no console

            System.out.println(erro.getMessage());
        }
        System.out.println("Processo Finalizado");




    }
}
