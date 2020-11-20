public class Element1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void action1() {
        System.out.println("Action 1");
    }
}
