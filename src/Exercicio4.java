import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercicio4 {
    public static class EstadoValor {
        private String estado;
        private double valor;

        public EstadoValor(String estado, double valor) {
            this.estado = estado;
            this.valor = valor;
        }


        public String getEstado() {
            return estado;
        }


        public void setEstado(String estado) {
            this.estado = estado;
        }


        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        @Override
        public String toString() {
            return estado + ": R$" + String.format("%.2f", valor);
        }
    }
    public static void main(String[] args) {
        //4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
        //• SP – R$67.836,43
        //• RJ – R$36.678,66
        //• MG – R$29.229,88
        //• ES – R$27.165,48
        //• Outros – R$19.849,53
        //Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado
        // teve dentro do valor total mensal da distribuidora


        ArrayList<EstadoValor> estados = new ArrayList<>();
        Double valorTotal = 0.0;


        EstadoValor sp = new EstadoValor("(SP)", 67836.43);
        EstadoValor rj = new EstadoValor("(RJ)", 36678.66);
        EstadoValor mg = new EstadoValor("(MG)", 29229.88);
        EstadoValor es = new EstadoValor("(ES)", 27165.48);
        EstadoValor outros = new EstadoValor("Outros", 19849.53);

        estados.add(sp);
        estados.add(rj);
        estados.add(mg);
        estados.add(es);
        estados.add(outros);

        for (int posicao = 0; posicao < estados.size(); posicao++) {
            valorTotal += estados.get(posicao).getValor();
        }
        System.out.println(valorTotal);

        for (int posicao = 0; posicao < estados.size(); posicao++) {
            Double percentual = valorTotal / estados.get(posicao).getValor();
            System.out.println(estados.get(posicao).getEstado() + ": " + percentual);
        }
    }
}
