public class InvalidParamsException extends Exception {

    InvalidParamsException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
