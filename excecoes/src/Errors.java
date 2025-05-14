import java.io.*;

public class Errors {
    public static void main(String[] args) {
        //1 - try catch (erro de divisão por zero)
        try {
            int a = 0;
            int b = 10;

            int resultado = b / a;

        }catch (ArithmeticException e){
            System.out.println("Divisão por zero não é possível");
            System.out.println("Msg: " + e.getMessage());
        }

        //erro de índice não existente
        try {
            int[] numeros = {1,2,3};
            System.out.println("Acessando número existente: " + numeros[2]);
            //System.out.println(numeros[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Msg: " + e.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }

        // verificadas e não verificadas

        // verificada (compilação)
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            System.out.println("Error ao ler arquivo: " + e.getMessage());
        }

        //não verificada (tempo de execução)
        // (erro, pois o texto é null)
        String texto = null;
        System.out.println(texto.length());
    }
}
