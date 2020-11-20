public class Element2 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void action2() {
        System.out.println("Action 2");
    }
}
