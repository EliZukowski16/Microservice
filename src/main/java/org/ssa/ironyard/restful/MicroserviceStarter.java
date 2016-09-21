package org.ssa.ironyard.restful;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceStarter
{
    static Logger LOGGER = LogManager.getLogger(MicroserviceStarter.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(MicroserviceStarter.class, args);
        LOGGER.info("Starting Spring-Boot App");
    }
}
