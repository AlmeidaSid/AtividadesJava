import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
// 5) Escreva um programa que inverta os caracteres de um string.
//
//        IMPORTANTE:
//        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//        b) Evite usar funções prontas, como, por exemplo, reverse;

        //Banana
        //ananaB

        String palavraInvertida = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine();

        for(int posicaoDaLetra = palavra.length() - 1; posicaoDaLetra >= 0; posicaoDaLetra--) {
            palavraInvertida += palavra.charAt(posicaoDaLetra);
        }
        System.out.println(palavraInvertida);
    }

}
