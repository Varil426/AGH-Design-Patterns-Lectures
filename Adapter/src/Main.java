public class Main {
    public static void main(String[] args) {
        OldData oldData = new OldData();
        NewData adapter = new NewDataAdapter(oldData);
        System.out.println("Wartosc po adaptacji: " + adapter.getNewData());
    }
}
