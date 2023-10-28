package top.igio.ps.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/8/27 21:48
 * @description
 */
@Configuration
@EnableWebMvc
@ComponentScan("top.igio.ps.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

}
