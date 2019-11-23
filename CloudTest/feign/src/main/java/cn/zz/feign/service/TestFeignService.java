package cn.zz.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("EUREKA-PROVIDER") // 跳转到EUREKA-PROVIDER寻找请求
public interface TestFeignService {
    @RequestMapping("/findAll")
    public List<String> getAll();

}
