package kz.zhelezyaka.gsws.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "kz.zhelezyaka.gsws.proxies",
        "kz.zhelezyaka.gsws.repositories",
        "kz.zhelezyaka.gsws.services"})
public class ProjectConfiguration {
}
