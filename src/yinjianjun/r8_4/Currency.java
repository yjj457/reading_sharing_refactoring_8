/*
 * Copyright (c) 2017. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package r8_4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZengQinggui
 * @version V1.0
 * @ClassName: Currency
 * @Description:
 * @Date 2017/1/9
 */
public class Currency {

    private String code;

    private static Map<String, Currency> currencyMap = new HashMap<String, Currency>();

    private Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Currency get(String code) {
        return Currency.currencyMap.get(code);
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Currency)) return false;
        Currency other = (Currency) o;
        return (code.equals(other.code));

    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}