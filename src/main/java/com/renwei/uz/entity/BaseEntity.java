/**
 * Project Name:dataBI
 * File Name:BaseEntity.java
 * Package Name:com.renwei.uz.entity
 * Date:2020年3月31日下午2:50:57
 * Copyright (c) 2020, 724847092@qq.com All Rights Reserved.
 */
package com.renwei.uz.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * ClassName:BaseEntity <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2020年3月31日 下午2:50:57 <br/>
 *
 * @author liuxianbin
 * @see
 * @since JDK 1.6
 */

@Data
public class BaseEntity implements Serializable {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 7730742841788874830L;

    @TableField(value = "delete_flag", fill = FieldFill.INSERT)
    private Integer deleteFlag;

    @TableField("create_by")
    private String createBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField("modify_by")
    private String modifyBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "modify_time", fill = FieldFill.UPDATE)
    private LocalDateTime modifyTime;

    @Version
    @TableField(value = "modify_count", fill = FieldFill.INSERT)
    private Integer modifyCount;
//
//    @TableField("merchant_user_id")
//    private String merchantUserId;


}
