package r8_3;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class Order {
    public Order(String customerName){
        _customer = new Customer(customerName);
    }
    public void setCustomer(String customerName){
        _customer = new Customer(customerName);
    }
    public String getCustomerName(){
        return _customer.getName();
    }

    private Customer _customer;

    // 调用工厂函数
//    public Order(String customer){
//        _customer = Customer.create(customer);
//    }
}
