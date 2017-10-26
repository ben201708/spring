package com.spring.springBoot.controller;

import com.spring.springBoot.domain.Product;
import com.spring.springBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes;

/** 
 * 产品文本介绍控制器
 *
 * @author Benhuang
 * @date 2017年10月21日 下午4:22:59
 * @version 2.0.0
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService product;

    private final static String INTRO_PATH = "/intro";
   
    @RequestMapping("/product")
    public String product() {
        return "I am a product!!!";
    }

    //商品介绍
    @RequestMapping(value = INTRO_PATH, produces = "text/html")
    public ModelAndView intro() {
        return new ModelAndView("intro", getProduct());
    }

    //获取商品
    private Map<String, Object> getProduct() {
        product.setId("P20172323000123");
        product.setName("苹果X10");
        product.setSize(10);
        product.setPrice(new BigDecimal(6000));

        Map<String,Object> map = new HashMap<>();

        map.put("name", product.getName());
        map.put("id", product.getId());
        map.put("price", product.getPrice());
        map.put("size", product.getSize());

        return map;
    }
}
