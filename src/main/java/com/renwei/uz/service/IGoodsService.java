package com.renwei.uz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.renwei.uz.dto.GoodsDetailDto;
import com.renwei.uz.entity.GoodsEntity;
import com.renwei.uz.vo.MGoodsDetailVo;


/**
 * 商品
 * @author pjf
 */
public interface IGoodsService extends IService<GoodsEntity> {

    MGoodsDetailVo getGoodsDetail(GoodsDetailDto dto);

    String getGoodsDetailTemp(GoodsDetailDto dto);

}
