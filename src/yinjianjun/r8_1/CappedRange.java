package r8_1;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class CappedRange extends IntRange {

    CappedRange(int low, int high, int cap){
        super(low, high);
        _cap = cap;
    }

    private int _cap;

    public int getCap(){
        return _cap;
    }

    public int getHigh(){
        return Math.min(super.getHigh(), getCap());
    }


}
