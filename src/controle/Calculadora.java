package controle;

import excessoes.CalculadoraExcessoes;

import java.util.InputMismatchException;

public class Calculadora {

    public Calculadora() {
    }

    public void calcular(Double n1, String operacao ,Double n2) {
        double resultado = 0.0;
        try {

            if (operacao.equals("+")) {
                resultado = n1 + n2;

            } else if (operacao.equals("-")) {
                if (n1 >= n2) {
                    resultado = n1 - n2;

                } else {
                    resultado = n2 - n1;
                }

            } else if (operacao.equals("*")) {
                resultado = n1 * n2;

            } else if (operacao.equals("/")) {
                resultado = n1 / n2;

            } else {
                throw new CalculadoraExcessoes(" Erro! Digite um sinal de operação matemática válido ( +, -, *, / )");
            }


        } catch (NumberFormatException | InputMismatchException e) {
            throw new CalculadoraExcessoes(e.getMessage());

        } finally {
            System.out.format("%.2f", resultado);
        }
    }
}
