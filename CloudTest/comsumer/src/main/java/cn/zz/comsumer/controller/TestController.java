package cn.zz.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getAll")
    public List<String> getAll(){
        return restTemplate.getForObject("http://EUREKA-PROVIDER/find",List.class);
    }

}
