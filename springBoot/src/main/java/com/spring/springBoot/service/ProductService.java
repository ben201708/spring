package com.spring.springBoot.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 产品服务
 *
 * @author Benhuang
 * @date 2017年10月23日 下午4:23:09
 * @version 2.0.0
 */
@Service("productService")
public class ProductService {
    private String id;
    private String name;
    private Integer size;
    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
