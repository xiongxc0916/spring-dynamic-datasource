package com.xiong;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.oas.annotations.EnableOpenApi;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.xiong.**"})
@MapperScan(basePackages = {"com.xiong.**.mapper"})
@EnableAsync
@EnableOpenApi
@EnableScheduling
public class DemoApplication extends SpringBootServletInitializer {

    /**
     * 覆盖父类configure方法
     *
     * @param application
     * @return
     */
    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

    /**
     * run
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * RestTemplate 增加负载均衡注解
     *
     * @return restTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        // 防止rest请求乱码
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        List<HttpMessageConverter<?>> list = new ArrayList<HttpMessageConverter<?>>();
        list.add(stringHttpMessageConverter);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(list);

        return restTemplate;
    }

}