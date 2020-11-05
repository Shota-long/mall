package com.dev.mall.product;

import com.dev.mall.product.entity.AttrEntity;
import com.dev.mall.product.entity.BrandEntity;
import com.dev.mall.product.service.AttrService;
import com.dev.mall.product.service.BrandService;
import com.dev.mall.product.service.impl.BrandServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Resource
    private AttrService attrService;

    @Resource
    private BrandService brandService;

    @Test
    public void contextLoads() {
            AttrEntity attrEntity = new AttrEntity();
            attrEntity.setAttrName("attr");
            attrService.save(attrEntity);
            System.out.println("success");
    }
    @Test
    public void update(){
        BrandEntity brand = new BrandEntity();
        brand.setBrandId((long) 2);
        brand.setName(null);
        brand.setLogo("hahaha");
        brand.setDescript("大品牌");
        brand.setFirstLetter(null);
        brand.setShowStatus(1);
        brand.setSort(null);
        System.out.println(brand);
        brandService.updateById(brand);
    }

}
