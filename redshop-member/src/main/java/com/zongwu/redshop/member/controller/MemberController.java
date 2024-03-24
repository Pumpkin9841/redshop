package com.zongwu.redshop.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.zongwu.redshop.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zongwu.redshop.member.entity.MemberEntity;
import com.zongwu.redshop.member.service.MemberService;
import com.zongwu.redshop.common.utils.PageUtils;
import com.zongwu.redshop.common.utils.R;



/**
 * 会员
 *
 * @author zongwu
 * @email 
 * @date 2024-03-23 14:06:14
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupon")
    public R memberCoupon() {
        MemberEntity member = new MemberEntity();
        member.setNickname("会员");
        member.setMobile("123456");
        return R.ok().put("member", Arrays.asList(member)).put("coupon",couponFeignService.memberList().get("coupon"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
