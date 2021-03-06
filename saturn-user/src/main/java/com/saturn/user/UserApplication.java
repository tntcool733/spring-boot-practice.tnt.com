package com.saturn.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ComponentScan({"com.saturn"})
@SpringBootApplication
public class UserApplication implements CommandLineRunner{

    @Autowired
    DruidDataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

    /* (non-Javadoc)
     * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
     */
    @Override
    public void run(String... args) throws Exception {
         log.info("[cmd=run dataSource maxActive={}]", dataSource.getMaxActive());
    }

}
