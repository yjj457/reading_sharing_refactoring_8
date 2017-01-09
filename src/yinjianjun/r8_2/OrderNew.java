/*
 * Copyright (c) 2017. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package r8_2;

/**
 * @author ZengQinggui
 * @version V1.0
 * @ClassName: OrderNew
 * @Description:
 * @Date 2017/1/9
 */
public class OrderNew {
    private Customer customer;

    public OrderNew(String customer) {
        this.customer = new Customer(customer);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customer) {
        this.customer =  new Customer(customer);
    }

    //采用Customer对象的构造函数
    public OrderNew(Customer customer) {
        this.customer = customer;
    }

    //采用Customer对象的设值函数
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}