import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variaveis que recebem o numero de mortes dos Zumbis nas tres partidas

        int primeiraPartida = entrada.nextInt ();
        int segundaPartida =  entrada.nextInt ();
        int terceiraPartida = entrada.nextInt ();

        // Variavel que recebe total de Zumbis mortos

        int totalMortes = primeiraPartida + segundaPartida + terceiraPartida;

        // media de Zumbis mortos

        int media = totalMortes/3;

        System.out.println (" O numero de Zumbis mortos foi:  " + totalMortes);
        System.out.println (" A media de Zumbis mortos foi:  " + media %.2f);

       // Fechar o scanner apos o uso
        entrada.close();


    }


}
