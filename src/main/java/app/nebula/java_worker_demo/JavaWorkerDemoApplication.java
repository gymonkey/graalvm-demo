package app.nebula.java_worker_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@AutoConfiguration
public class JavaWorkerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWorkerDemoApplication.class, args);
	}

}
