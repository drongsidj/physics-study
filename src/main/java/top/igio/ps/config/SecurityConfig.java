package top.igio.ps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import top.igio.ps.utils.PasswordUtils;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/10/28 14:30
 * @description
 */
@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public PasswordUtils passwordUtils() {
        return new PasswordUtils(passwordEncoder());
    }

}
