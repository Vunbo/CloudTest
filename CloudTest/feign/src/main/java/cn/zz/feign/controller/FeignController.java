package cn.zz.feign.controller;

import cn.zz.feign.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {
    @Autowired
    private TestFeignService testFeignService;

    @RequestMapping("/getAll")
    public List<String> getAll(){
        List<String> all = testFeignService.getAll();
        return all;
    }
}
