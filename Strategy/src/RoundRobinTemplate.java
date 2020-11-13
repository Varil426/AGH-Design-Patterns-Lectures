public abstract class RoundRobinTemplate implements Strategy {

    public abstract int getLastIndex();
    public abstract int incrementLastIndex(int lastIndex);

    @Override
    public int selectNode() {
        int lastIndex = getLastIndex();
        int newIndex = incrementLastIndex(lastIndex);
        return newIndex;
    }
}
