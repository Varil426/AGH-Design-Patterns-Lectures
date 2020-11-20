import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new FirstVisitor();
        List<Element> elements = new ArrayList<>();
        elements.add(new Element1());
        elements.add(new Element2());
        elements.add(new Element1());
        elements.add(new Element2());
        for(Element e : elements) {
            e.accept(visitor);
        }
    }
}
