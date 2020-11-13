public class RoundRobinStrategy extends RoundRobinTemplate {

    int lastIndex = 0;

    @Override
    public int getLastIndex() {
        return lastIndex;
    }

    @Override
    public int incrementLastIndex(int lastIndex) {
        this.lastIndex = lastIndex + 1;
        return this.lastIndex;
    }
}
