package com.example.controller;

import com.example.mapper.DeptMapper;
import com.example.pojo.Dept;
import com.example.pojo.Result;

import com.example.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/depts")
public class DeptController {

    //定义一个专业的日志输出对象，可通过注解@Slf4j达到相同效果
    //private static Logger log = LoggerFactory.getLogger(DeptMapper.class);


    @Autowired
    private DeptService deptService;

    /*
    * 查询部门数据
    * */
    //@RequestMapping(value ="/depts",method = RequestMethod.GET)
    //使用get方式请求数据，相当于@RequestMapping(value ="/depts",method = RequestMethod.GET)
    @GetMapping
    public Result list(){
//        查询全部部门数据
//        System.out.println("查询全部部门数据");
        log.info("查询全部部门数据");

        //调用service查询部门数据
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    /**
     * 根据id删除部门数据
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}",id);
        //调用service中的方法删除部门
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 根据id添加部门数据
     * @param dept
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("根据id添加部门{}",dept);
        deptService.add(dept);
        return Result.success();
    }
}
