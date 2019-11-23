package cn.zz.comsumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration  // 声明这是一个配置类
public class RestTemplateConfig {

    @Bean       // 注入bean
    @LoadBalanced   // 加载负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
