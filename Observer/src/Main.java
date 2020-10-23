public class Main {
    public static void main(String[] args) {
        Subject sub = new Subject();
        Obs1 ob1 = new Obs1();
        Obs2 ob2 = new Obs2();
        sub.addObserver(ob1);
        sub.addObserver(ob2);
        sub.updateAll();
    }
}
