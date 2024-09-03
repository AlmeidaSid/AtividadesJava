//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1 {
    public static void main(String[] args) {

        //  1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
        //            Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
        //            Imprimir(SOMA);
        //            Ao final do processamento, qual será o valor da variável SOMA?

        int soma = 0;
        int indice = 13;

        for (int k = 0; k < indice; k++) {
            soma = soma + k;
        }
        System.out.println(soma);
    }


}