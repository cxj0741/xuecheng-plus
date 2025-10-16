package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {


    // 版本身份证号
    private static final long serialversionUID = 1L;

    private List<T> items;

    private long counts;

    private long page;

    private long pageSize;

}
