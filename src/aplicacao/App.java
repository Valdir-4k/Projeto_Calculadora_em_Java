package aplicacao;

import controle.Calculadora;
import excessoes.CalculadoraExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try {

            Calculadora calculadora = new Calculadora();

            System.out.println("Programa Calculadora");
            System.out.print("Digite o número: ");
            Double num1 = ler.nextDouble();

            ler.nextLine();

            System.out.print("Digite a operação a ser realizada: ");
            String operacao = ler.nextLine();

            if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

                System.out.print("Digite o segundo número: ");
                Double num2 = ler.nextDouble();

                calculadora.calcularFuncoesBasicas(num1, operacao, num2);

            } else if (operacao.equals("v")) {
                calculadora.raizQuadrada(num1);

            } else if (operacao.equals("%")) {
                //ler.nextLine();

                System.out.println("Digite se vc quer aumentar ou diminuir esse valor (+ ou -)");
                String operador = ler.nextLine();

                System.out.println("Digite quantos porcento você quer que aumente: ");
                int porcentagem = ler.nextInt();

                calculadora.porcentagem(num1, operador, porcentagem);
            }


        } catch (CalculadoraExcessoes e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException | NumberFormatException e){
            throw new CalculadoraExcessoes(e.getMessage());

        } finally {
            ler.close();
        }


    }

}
