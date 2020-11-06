public class Main {
    public static void main(String[] args) {
        Handler step1 = new Step1();
        step1.addNext(new Step2());
        step1.addNext(new Step3());

        step1.handle();
    }
}
