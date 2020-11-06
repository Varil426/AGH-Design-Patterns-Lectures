public class AdditionDecorator extends OperatorDecorator {

    private Number number2;

    AdditionDecorator(Number number, Number number2) {
        super(number);
        this.number2 = number2;
    }

    public Double getValue() {
        return number.getValue() + number2.getValue();
    }
}
