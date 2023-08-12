package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页查询结果的封装类
 */
@Data  //提供get、set方法
@NoArgsConstructor  //无参构造类
@AllArgsConstructor  //有参构造类
public class PageBean {

    private Long total;//总记录数
    private List rows;//数据列表

}
