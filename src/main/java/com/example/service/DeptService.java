package com.example.service;

import com.example.mapper.DeptMapper;
import com.example.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    //查询全部部门数据
    List<Dept> list();

    //删除部门
    void delete(Integer id);

    void add(Dept dept);
}
