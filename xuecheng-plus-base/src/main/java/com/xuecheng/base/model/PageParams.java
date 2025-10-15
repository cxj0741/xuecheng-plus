package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description 分页查询分页参数
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {

    // 当前页码
    private Integer pageNo = 1;

    // 每页记录数
    private Integer pageSize = 20;

}
