package cn.zz.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// @FeignClient("EUREKA-PROVIDER") // 跳转到EUREKA-PROVIDER寻找请求
// 相较于添加hystrix之前，多了一个fallback属性，并指定类
@FeignClient(value = "EUREKA-PROVIDER", fallback = TestHystrixService.class)
public interface TestFeignService {

    @RequestMapping("/find")    // 此处的值要与provider中接口一致
    public List<String> getAll();

}
