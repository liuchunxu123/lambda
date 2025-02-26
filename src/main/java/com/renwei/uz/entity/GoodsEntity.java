package com.renwei.uz.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author pjf
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("m_goods")
public class GoodsEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * PK
     */
    @TableId("goods_id")
    private String goodsId;

    /**
     * 品牌编码
     */
    @TableField("brand_code")
    private String brandCode;

    /**
     * 商品分类ID
     */
    @TableField("goods_category_id")
    private String goodsCategoryId;

    /**
     * 商品编码
     */
    @TableField("goods_code")
    private String goodsCode;

    /**
     * 商品名称
     */
    @TableField("goods_name")
    private String goodsName;

    /**
     * 商品图片路径
     */
    @TableField("goods_img")
    private String goodsImg;

    /**
     * 商品价格
     */
    @TableField("goods_price")
    private Long goodsPrice;

    /**
     * 税率
     */
    @TableField("tax")
    private BigDecimal tax;

    /**
     * 含税价格
     */
    @TableField("goods_price_tax_in")
    private Long goodsPriceTaxIn;

    /**
     * 商品描述
     */
    @TableField("goods_desc")
    private String goodsDesc;

    /**
     * キャプション
     */
    @TableField("goods_caption")
    private String goodsCaption;

    /**
     * 販売開始日時
     */
    @TableField("sale_start_time")
    private LocalDateTime saleStartTime;

    /**
     * 販売终了日時
     */
    @TableField("sale_end_time")
    private LocalDateTime saleEndTime;

    /**
     * 一時停止FLAG
     */
    @TableField("stop_flag")
    private Boolean stopFlag;

    /**
     * 排序
     */
    @TableField("display_order")
    private Long displayOrder;

    /**
     * 启用标志(0: 启用、1: 禁用)
     */
    @TableField("disable_flag")
    private Boolean disableFlag;

    /**
     * 字幕コメント
     */
    @TableField("goods_subtitle_comment")
    private String goodsSubtitleComment;

}
