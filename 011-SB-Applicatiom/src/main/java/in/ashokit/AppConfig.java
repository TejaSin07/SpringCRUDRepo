package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.util.AppSecurity;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:: constructor");// TODO Auto-generated constructor stub
	}
    @Bean
    AppSecurity createOb() {
    	System.out.println("bean method called");
		AppSecurity security = new AppSecurity();
		return security;
		}

}
