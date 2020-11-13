import java.util.List;

public abstract class PerformanceTemplate implements Strategy {

    public abstract List getPerformance();

    @Override
    public int selectNode() {
        List<Integer> list = getPerformance();
        int newNode = 0;
        for(Integer index : list) {
            if(index == 2){
                newNode = 2;
            }
        }
        return newNode;
    }
}
