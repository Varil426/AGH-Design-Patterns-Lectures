public class FirstVisitor implements Visitor {
    @Override
    public void visit(Element1 element1) {
        System.out.println("Odwiedzam element typu Element1");
        element1.action1();
    }

    @Override
    public void visit(Element2 element2) {
        System.out.println("Odwiedzam element typu Element2");
        element2.action2();
    }
}
