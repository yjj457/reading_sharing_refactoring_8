package r8_7;

/**
 * Created by yinjianjun   on 17-1-8.
 */
public class Order {
    Customer getCustomer(){
        return _customer;
    }
    void setCustomer(Customer arg){
        // _customer = arg;

        if(_customer != null){
            _customer.friendOrders().remove(this);
            _customer = arg;
            if(_customer != null)
                _customer.friendOrders().add(this);
        }

    }

    Customer _customer;
}
