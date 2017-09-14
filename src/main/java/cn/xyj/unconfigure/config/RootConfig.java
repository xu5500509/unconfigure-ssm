package cn.xyj.unconfigure.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 用于管理ContextLoadListener创建的上下文的bean
 * @EnableTransactionManagement扫描事务
 * @Author: xuyangjian
 * @Date: 2017/9/14 10:04
 */
@Configuration
@ComponentScan(basePackages={ "cn.xyj.unconfigure.config", "cn.xyj.unconfigure.dao", "cn.xyj.unconfigure.service" })
@Import(DruidDataSourceConfig.class)
@EnableTransactionManagement
public class RootConfig {
	

	
}
