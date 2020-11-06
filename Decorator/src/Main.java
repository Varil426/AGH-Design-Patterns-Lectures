public class Main {
    public static void main(String[] args) {
        Number result = new sqrtDecorator(
                new MultiplicationDecorator(
                        new DobleDecorator(4.0),new AdditionDecorator(
                                new DobleDecorator(7.0), new DobleDecorator(4.0)
                )
                )
        );
        System.out.println(result.getValue());
    }
}
