/**
 * Project Name:dataBI
 * File Name:BaseDto.java
 * Package Name:com.renwei.uz.dto
 * Date:2020年4月4日下午1:21:08
 * Copyright (c) 2020, 724847092@qq.com All Rights Reserved.
 */
package com.renwei.uz.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * エンティティ・クラスの基本クラスの要求
 * ClassName:BaseDto <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2020年4月4日 下午1:21:08 <br/>
 *
 * @author liuxianbin
 * @see
 * @since JDK 1.6
 */
@Data
public class BaseDto implements Serializable {

    private static final long serialVersionUID = 6522090228490409472L;

    private String sbpaymentId;

    private String sceretKey;

}
