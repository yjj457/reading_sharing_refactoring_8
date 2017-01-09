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
 * @ClassName: OrderOld
 * @Description:
 * @Date 2017/1/9
 */
public class OrderOld {

    private Integer customer;

    public OrderOld(Integer customer) {
        this.customer = customer;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
}