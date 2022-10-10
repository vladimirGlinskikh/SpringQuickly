package kz.zhelezyaka.restExample;

import kz.zhelezyaka.restExample.model.Country;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Main.class, args);

        while (true){
            Thread.sleep(10);
            Logger logger = LogManager.getLogger(Main.class);
            logger.info("Logger speaking here!");
            new Country().doIt();
        }
    }
}
