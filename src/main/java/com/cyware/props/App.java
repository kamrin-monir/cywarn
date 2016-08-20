package com.cyware.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by KamrinK on 19-08-2016.
 */
@ConfigurationProperties(prefix = "homepage")
public class App {
    private String url;
    private String menuElement;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuElement() {
        return menuElement;
    }

    public void setMenuElement(String menuElement) {
        this.menuElement = menuElement;
    }
}
