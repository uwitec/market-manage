package me.jiangcai.logstics.haier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 需要配置gateway URL，会读取以下系统参数作为URL
 * <ul>
 * <li>haier.gateway.URL 默认http://58.56.128.84:9001/EAI/service/VOM/CommonGetWayToVOM/CommonGetWayToVOM</li>
 * </ul>
 *
 * @author CJ
 */
@Configuration
@ComponentScan("me.jiangcai.logstics.haier.service")
public class HaierConfig {
}
