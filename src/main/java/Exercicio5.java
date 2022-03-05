import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Objeto tipo Scanner
            Scanner entrada = new Scanner(System.in);
        //Randon para gerar numero aleatorio
            Random rand = new Random();
            int numGerado, numAdivinhado;
        //Numero aleatorios de 1 a 10
        numGerado = rand . nextInt(1) +1;

        do {
            System.out.println("Qual o numero que estou pensando? ");
            numAdivinhado = entrada.nextInt();
            if (numAdivinhado != numGerado);
            System.out.println("Errrouu");
            


        }while (numGerado !=numAdivinhado!);
        System.out.println("Parabens. Voce acertou meu numero!");

        // Para fechar o scanner, apos o uso
        entrada.close();
    }

}
