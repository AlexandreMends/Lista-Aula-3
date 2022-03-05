import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        // iniciando Scanner do objeto

        Scanner entrada = new Scanner(System.in);

        int numAlunosMatriculado;

        System.out.println(" Digite o numero de alunos matriculados em C125: ");
        numAlunosMatriculado = entrada . nextInt();

        switch (numAlunosMatriculado){
            case 10:
                System.out.println(" A sala sera utilizada em I-15 ");
            case 20:
                System.out.println(" A sala sera utilizada em I-15" );
            case 30:
                System.out.println(" A sala sera utilizada no I-22" );
            default:
                System.out.println( " Numero invalido de alunos. Favos tentar novamente! ");
            break;
        }
       // Fechar scanner para nenhum valor ser lido
        entrada.close();

    }
}
