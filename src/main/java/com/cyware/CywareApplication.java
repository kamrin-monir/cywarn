package com.cyware;

import com.cyware.props.App;
import com.cyware.props.Footer;
import com.cyware.props.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({App.class, Footer.class, LatestNews.class, Menu.class})
public class CywareApplication {

	public static void main(String[] args) {
		SpringApplication.run(CywareApplication.class, args);
	}
}
