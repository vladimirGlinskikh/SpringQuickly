package kz.zhelezyaka.areasOfVisibilityBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "kz.zhelezyaka.areasOfVisibilityBean.services",
        "kz.zhelezyaka.areasOfVisibilityBean.repositories"})
public class ProjectConfig {
}
