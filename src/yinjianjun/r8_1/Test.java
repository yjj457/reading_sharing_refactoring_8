package r8_1;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class Test {

    public static void main(String[] args){
        CappedRange cappedRange = new CappedRange(1,3,2);
        int high = cappedRange.getHigh();
        System.out.println(high);

    }
}
