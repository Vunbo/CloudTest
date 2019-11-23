package cn.zz.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
