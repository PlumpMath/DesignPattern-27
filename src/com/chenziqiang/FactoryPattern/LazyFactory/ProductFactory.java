package com.chenziqiang.FactoryPattern.LazyFactory;

import com.chenziqiang.FactoryPattern.NativeFactory.ConcreteProduct1;
import com.chenziqiang.FactoryPattern.NativeFactory.ConcreteProduct2;
import com.chenziqiang.FactoryPattern.NativeFactory.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenziqiang on 2016/12/18.
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap();
    public static synchronized Product createProduct(String type) {
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        }else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
        }
        return product;
    }
}
