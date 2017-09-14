package cn.xyj.unconfigure.web;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Druid监控：URL监控
 * @Author: xuyangjian
 * @Date: 2017/9/14 10:09
 */
@WebFilter(filterName="druidFilter", urlPatterns="/*", initParams={
		@WebInitParam(name="exclusions", value="*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*")
})
public class DruidStatFilter extends WebStatFilter {


}
