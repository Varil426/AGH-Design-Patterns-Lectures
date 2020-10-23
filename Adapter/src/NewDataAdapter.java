public class NewDataAdapter implements NewData {
    private OldData oldData;

    NewDataAdapter(OldData _od) {
        this.oldData = _od;
    }


    @Override
    public double getNewData() {
        return Math.sqrt(this.oldData.getData());
    }
}
