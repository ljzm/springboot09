package cn.kgc.springboot09.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.kgc.springboot09.mapper")
public class MybatisConfig {
}
