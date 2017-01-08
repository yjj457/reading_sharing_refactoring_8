package r8_1;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class IntRange {

    public IntRange(){

    }

    public IntRange(int low, int high){
        initialize(low, high);
    }

    private void initialize(int low, int high){
        _low = low;
        _high = high;
    }

    boolean includes(int arg){
        return arg >= getLow() && arg <= getHigh();
    }

    private int _low;
    private int _high;

    public int getHigh() {
        return _high;
    }

    public void setHigh(int _high) {
        this._high = _high;
    }

    public int getLow() {
        return _low;
    }

    public void setLow(int _low) {
        this._low = _low;
    }


}