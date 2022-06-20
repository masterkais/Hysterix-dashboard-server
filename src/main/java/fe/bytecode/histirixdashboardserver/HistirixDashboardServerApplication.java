package fe.bytecode.histirixdashboardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@RefreshScope
@EnableDiscoveryClient
public class HistirixDashboardServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HistirixDashboardServerApplication.class, args);
    }

}
