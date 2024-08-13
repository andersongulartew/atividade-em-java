package finallyexemplo;



public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Inicio do Processo");
            int resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Erro : " + e.getMessage());
        } finally { // finalmente
            //SEMPRE VAI SER EXECUTADO
            System.out.println("Vou ser executado independente se deu erro ou não");
        }
        System.out.println("Fim do Processo");
    }

}
