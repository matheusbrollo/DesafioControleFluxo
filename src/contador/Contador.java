package contador;

import Exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        int primeiroParametro, segundoParametro;

        do {
            System.out.println("Digite o primeiro parâmetro: ");
            primeiroParametro = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            segundoParametro = terminal.nextInt();

            try {
                contar(primeiroParametro, segundoParametro);
            }catch (ParametrosInvalidosException exception) {
            }

        } while (primeiroParametro >= segundoParametro); // Repete a interação caso o primeiro parametro for maior ou igual ao segundo
    }

    static void contar(int primeroParametro, int segundoParametro) throws ParametrosInvalidosException {
        // validar se primeiroParametro é maior que o segundoParametro e lançar uma exceção
        if (primeroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo parâmetro");
        } else {
            // imprimir os números
            for (int i = primeroParametro +1; i <= segundoParametro; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }

}
