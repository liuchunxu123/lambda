package com.renwei.uz.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.renwei.uz.dto.GoodsDetailDto;
import com.renwei.uz.entity.GoodsEntity;
import com.renwei.uz.vo.MGoodsDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author pjf
 */
@Mapper
public interface GoodsMapper extends BaseMapper<GoodsEntity> {

    @Select(value=" SELECT a.goods_id,a.goods_name,a.goods_img,a.goods_code FROM m_goods a WHERE a.goods_id = #{dto.goodsId} AND a.disable_flag =0 GROUP BY a.goods_id")
    MGoodsDetailVo selectByGoodsId(@Param("dto") GoodsDetailDto dto);
}
