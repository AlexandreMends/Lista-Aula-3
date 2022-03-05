import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        //Objeto tipo Scanner
        Scanner entrada = new Scanner(System.in);
        //Randon para gerar numero aleatorio
        Random rand = new Random();
        int numGerado, numAdivinhado;
        //Numero aleatorios de 1 a 10
        numGerado = rand . nextInt(10) +1;

        do {
            System.out.println("Qual o numero que estou pensando? ");
            numAdivinhado = entrada.nextInt();
            if (numAdivinhado > numGerado) {
                System.out.println("O numero adivinhado e maior que o seu");
            }else if (numAdivinhado < numGerado) {
                System.out.println("O numero adivinhado e menor que o seu");
            }

        }while (numGerado !=numAdivinhado);
        System.out.println("Parabens. Voce acertou meu numero!");

        // Para fechar o scanner, apos o uso
        entrada.close();
    }

}


