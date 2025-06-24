package com.renwei.uz.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.renwei.uz.dto.GoodsDetailDto;
import com.renwei.uz.entity.GoodsEntity;
import com.renwei.uz.repository.GoodsMapper;
import com.renwei.uz.service.IGoodsService;
import com.renwei.uz.vo.MGoodsDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pjf
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, GoodsEntity> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public MGoodsDetailVo getGoodsDetail(GoodsDetailDto dto) {
        MGoodsDetailVo goodsDetailVo = goodsMapper.selectByGoodsId(dto);
        return goodsDetailVo;
    }

    @Override
    public String getGoodsDetailTemp(GoodsDetailDto dto) {
        return "1023562545666";
    }
}
