package controle;

import excessoes.CalculadoraExcessoes;

import java.util.InputMismatchException;

public class Calculadora {

    public Calculadora() {
    }

    public void calcularFuncoesBasicas(Double n1, String operacao ,Double n2) {

        try {

            if (operacao.equals("+")) {
                somar(n1,n2);

            } else if (operacao.equals("-")) {
               subtrair(n1, n2);

            } else if (operacao.equals("*")) {
                multiplicar(n1, n2);

            } else if (operacao.equals("/")) {
                dividir(n1,n2);

            } else {
                throw new CalculadoraExcessoes(" Erro! Digite um sinal de operação matemática válido ( +, -, *, / )");
            }


        } catch (NumberFormatException | InputMismatchException e) {
            throw new CalculadoraExcessoes(e.getMessage());

        }
    }

    public void somar(Double n1, Double n2) {

        System.out.println(String.format(n1 + " + " + n2 + " = %.2f", n1 + n2));
    }

    public void subtrair(Double n1, Double n2) {
        System.out.println(String.format(n1 + " - " + n2 + " = %.2f", n1 - n2));

    }

    public void multiplicar(Double n1, Double n2) {
        System.out.println(String.format(n1 + " * " + n2 + " = %.2f", n1 * n2));
    }

    public void dividir(Double n1, Double n2) {
        System.out.println(String.format(n1 + " / " + n2 + " = %.2f", n1 / n2));
    }

    public void raizQuadrada(Double n) {
        System.out.println(String.format("A raiz quadrada de " + n + " é %.2f", Math.sqrt(n)));
    }

    public void porcentagem(Double n, String operacao, int porcentagem) {
        //ajeitar o menos
        double resultado = 0.0;
        if (operacao.equals("+")) {
            resultado = (n / 100) * porcentagem + n;
            System.out.println(String.format("%.2f", n) + " + " + porcentagem + "% " + "= " + String.format("%.2f", resultado));

        } else if (operacao.equals("-")) {
            resultado = (n / 100) * porcentagem - n;
            System.out.println(String.format("%.2f", n) + " - " + porcentagem + "% " + "= " + String.format("%.2f", resultado));

        }


    }
}
