package com.zongwu.redshop.coupon.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zongwu.redshop.coupon.entity.CouponEntity;
import com.zongwu.redshop.coupon.service.CouponService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.common.utils.R;



/**
 * 优惠券信息
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:04:34
 */
@RestController
@RefreshScope
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.name:1}")
    private String name;

    @Value("${coupon.user.age:1}")
    private String age;

    @RequestMapping("/member/list")
     public R memberList() {
         CouponEntity coupon = new CouponEntity();
         coupon.setCouponName("优惠券");
         coupon.setCouponType(1);
         return R.ok().put("coupon", Arrays.asList(coupon));
     }

     @RequestMapping("/config/test")
     public R configTest() {
            return R.ok().put("name", name).put("age", age);
     }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
