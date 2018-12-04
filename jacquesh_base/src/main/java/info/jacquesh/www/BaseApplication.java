package info.jacquesh.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/*********************************************************************************
 **                      Created by IDEA.  
 **                      Author: JacquesH
 **                      Date: 2018/12/4
 **                     Time: 16:48 
 **********************************************************************************/
@SpringBootApplication

public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
