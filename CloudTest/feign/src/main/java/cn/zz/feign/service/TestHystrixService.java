package cn.zz.feign.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建的熔断类，并实现之前的正常时的Service接口类
 */
@Component  //注入到容器中
public class TestHystrixService implements TestFeignService{
    @Override
    public List<String> getAll() {
        List<String> msg = new ArrayList<>();
        msg.add("对不起,服务器异常");
        return msg;
    }

    @Override
    public List<String> getByName(String name) {
        List<String> msg = new ArrayList<>();
        msg.add("对不起,服务器异常");
        return msg;
    }
}
