package Exceptions;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        System.out.println("O primeiro parâmetro deve ser menor que o segundo. Tente novamente.");
        System.out.println();
    }
}
