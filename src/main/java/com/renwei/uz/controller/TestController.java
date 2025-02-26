package com.renwei.uz.controller;


import com.renwei.uz.dto.GoodsDetailDto;
import com.renwei.uz.service.IGoodsService;
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
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IGoodsService goodsService;


    @PostMapping("/demo1")
    public String demo1(@RequestBody GoodsDetailDto dto) {
        return "demo1";
    }

    @PostMapping("/demo2")
    public String getGoodsDetailTemp(@RequestBody GoodsDetailDto dto) {
        return "demo2";
    }

}
