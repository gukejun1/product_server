package net.xm.product_server.service.impl;

import net.xm.product_server.domain.Product;
import net.xm.product_server.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer,Product> daoMap = new HashMap<>();

    static {
        Product p1 = new Product( 1, "iphonex", 9999, 10);
        Product p2 = new Product( 2, "手机", 1999, 101);
        Product p3 = new Product( 3, "电脑", 5999, 10);
        Product p4 = new Product( 4, "冰箱", 3999, 10);
        Product p5 = new Product( 5, "水果", 19, 10);
        Product p6 = new Product( 6, "空调", 8888, 10);
        Product p7 = new Product( 7, "书包", 89, 10);
        Product p8 = new Product( 8, "铅笔", 9, 10);

        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);
        daoMap.put(p7.getId(),p7);
    }
    @Override
    public List<Product> listProduct() {
        return null;
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
