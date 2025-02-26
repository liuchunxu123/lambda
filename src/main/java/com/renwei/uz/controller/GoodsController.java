package com.renwei.uz.controller;


import com.renwei.uz.dto.GoodsDetailDto;
import com.renwei.uz.service.IGoodsService;
import com.renwei.uz.vo.MGoodsDetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pjf
 */
@Slf4j
@RestController
@RequestMapping("/gateway_test")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;


    @PostMapping("/getGoodsDetail")
    public MGoodsDetailVo getGoodsDetail(@RequestBody GoodsDetailDto dto) {
        return goodsService.getGoodsDetail(dto);
    }

    @PostMapping("/getGoodsDetailTemp")
    public String getGoodsDetailTemp(@RequestBody GoodsDetailDto dto) {
        return goodsService.getGoodsDetailTemp(dto);
    }

}
