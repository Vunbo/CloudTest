package cn.zz.feign.controller;

import cn.zz.feign.service.TestFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FeignController {

    @Resource
    private TestFeignService testFeignService;

    @RequestMapping("/getAll")
    public List<String> getAll(){
        List<String> all = testFeignService.getAll();
        return all;
    }
}
