import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        // variavel que recebe entrada do usuario

        Scanner entrada = new Scanner(System.in);

        int Np3, Npa;
        System.out.println( "Digite uma nota NpA: ");
        Npa = entrada . nextInt();

        if (Npa>= 60){
            System.out.println (" Parabens! Voce esta aprovado ");
        } else {
            System.out.println(" Ainda ha chance! Rumo a Np3");
            System.out.println(" Digite a nota da Np3 ");
            Np3 = entrada.nextInt();

            if ((Np3 + Npa) /2 >= 50 ){
                System.out.println (" Aeee. Aprovado! ");
            }else {
                System.out.println ( "Não deu! Nos vemos no proximo semestre! ");
            }
        }
        // Para fechar o Scanner, apos seu uso
        entrada.close ();
    }
}
