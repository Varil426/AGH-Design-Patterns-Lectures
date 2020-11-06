public class DobleDecorator implements Number {
    protected Double value;

    public DobleDecorator(Double value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }
}
