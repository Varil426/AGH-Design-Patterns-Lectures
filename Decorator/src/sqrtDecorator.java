public class sqrtDecorator extends OperatorDecorator {

    sqrtDecorator(Number number) {
        super(number);
    }

    public Double getValue() {
        return Math.sqrt(number.getValue());
    }
}
