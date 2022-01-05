package com.com.pehenmo.springbootcommysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootComMysqlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootComMysqlApplication.class, args);

	}

}
