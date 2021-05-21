package com.cosmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cosmin.logs.StaticLogs;

import brave.sampler.Sampler;
import lombok.extern.slf4j.Slf4j;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class NetflixZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApplication.class, args);
		String message = "is started";
		StaticLogs.staticLogs(log, message);
	}
	
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
