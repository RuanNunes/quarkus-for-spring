package ruan.nunes.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello")
public class HelloProperties {

    public String text;
    public String name;
}
