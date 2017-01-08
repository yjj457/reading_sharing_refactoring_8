package r8_7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class Customer {
    private Set _orders = new HashSet();

    Set friendOrders(){
        return _orders;
    }

    // void addOrder(Order arg){
    //     arg.setCustomer(this);
    // }
}
