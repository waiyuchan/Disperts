package com.dolphinfeed.disperts.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类 Created by will on 2022/05/25.
 */
@Configuration
@MapperScan({"com.dolphinfeed.disperts.mbg.mapper"})
public class MyBatisConfig {
}