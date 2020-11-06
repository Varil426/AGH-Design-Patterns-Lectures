public class MultiplicationDecorator extends OperatorDecorator {

    private Number number2;

    MultiplicationDecorator(Number number, Number number2) {
        super(number);
        this.number2 = number2;
    }

    public Double getValue() {
        return number.getValue() * number2.getValue();
    }
}
