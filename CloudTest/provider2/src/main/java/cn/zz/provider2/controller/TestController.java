package cn.zz.provider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TestController {

    //获取当前端口的方法
    @Value("${server.port}")
    private String port;

    // 做一个业务测试
    @RequestMapping("/find")
    public List<String> findAll(){
        List<String> name = new ArrayList<>();
        name.add("王璐");
        name.add("当前端口为："+port);
        return name;
    }

    @RequestMapping("/findByName")
    public List<String> findAllByName(@RequestParam String name){
        List<String> names = new ArrayList<>();
        names.add("你好"+name);
        names.add("当前端口为："+port);
        return names;
    }

}
