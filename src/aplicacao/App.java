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
            System.out.print("Digite o primeiro número: ");
            Double num1 = ler.nextDouble();

            ler.nextLine();

            System.out.print("Digite a operação a ser realizada: ");
            String operacao = ler.nextLine();

            System.out.print("Digite o segundo número: ");
            Double num2 = ler.nextDouble();

            calculadora.calcular(num1, operacao, num2);

        } catch (CalculadoraExcessoes e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException | NumberFormatException e){
            throw new CalculadoraExcessoes(e.getMessage());

        } finally {
            ler.close();
        }


    }

}
