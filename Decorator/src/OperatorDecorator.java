public abstract class OperatorDecorator implements Number {
    protected Number number;
    OperatorDecorator(Number number) {
        this.number = number;
    }
}
