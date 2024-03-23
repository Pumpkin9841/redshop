package com.zongwu.redshop.product;

import com.zongwu.redshop.product.entity.BrandEntity;
import com.zongwu.redshop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedshopProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity entity = new BrandEntity();
        entity.setName("华为");
        entity.setDescript("华为手机");
        brandService.save(entity);
        System.out.println("-----------保存成功-----------");
    }

}
