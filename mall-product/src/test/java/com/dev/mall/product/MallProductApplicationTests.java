package com.dev.mall.product;

import com.dev.mall.product.entity.AttrEntity;
import com.dev.mall.product.service.AttrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Resource
    AttrService attrService;

    @Test
    public void contextLoads() {
            AttrEntity attrEntity = new AttrEntity();
            attrEntity.setAttrName("attr");
            attrService.save(attrEntity);
            System.out.println("success");
    }

}
