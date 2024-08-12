package multiplicacaoentrevetores;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Iniciado");
//        int[] num = new int[]{10, 20, 30, 100};
//        int[] num2 = new int[]{2, 3, 4, 5};

        // DIVDIR O VETOR DE (num) PELO DE (num2)
        // SEM ERRO
/*        try {  // try -> tentar
            // ele vai tentar executar
            for (int i = 0; i < 4; i++) {
                *//*10 / 2 -  20 / 3 - 30 / 4 - 100 / 5 *//*
                int resultado = num[i] / num2[i];
                System.out.printf("%d / %d = %d \n", num[i], num2[i], resultado);
                // usei o formato ("%d / %d = %d \n", num[i], num2[i],resultado)
                // para imprimi na forma de "10 /2 = resultado"
            }
            //System.out.println("Números:");
            //System.out.println(num[5]);
        } catch (Exception erro) {
            // catch -> capturar
            // tratar os erros capturados no bloco try
            // podera imprimir no console
            System.out.println(erro.getMessage());
        }
        System.out.println("Processo Finalizado");*/

        System.out.println("--------------------------------------------");
        // COM ERRO - VAI DISPARA A EXCEÇÃO
        int[] num3 = new int[]{10, 20, 30, 100};
        int[] num4 = new int[]{2, 3, 4}; // faltando a posição "3"

        try {  // try -> tentar
            // ele vai tentar executar
            for (int i = 0; i < 4; i++) {
                /* 10 / 2 -  20 / 3 - 30 / 4 - 100 / 5 */
                int resultado = num3[i] / num4[i];
                System.out.printf("%d / %d = %d \n", num3[i], num4[i], resultado);
                // usei o formato ("%d / %d = %d \n", num[i], num2[i],resultado)
                // para imprimi na forma de "10 /2 = resultado"
            }

        } catch (Exception erro) {
            // catch -> capturar
            // tratar os erros capturados no bloco try
            // podera imprimir no console
            System.out.println("Erro da Exceção : " + erro.getMessage());
        }
        System.out.println("Processo Finalizado");


    }
}
