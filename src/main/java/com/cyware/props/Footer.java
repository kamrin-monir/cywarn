package com.cyware.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by KamrinK on 20-08-2016.
 */
@ConfigurationProperties(prefix = "footer")
public class Footer {
    private String footer1;

    public String getFooter1() {
        return footer1;
    }

    public void setFooter1(String footer1) {
        this.footer1 = footer1;
    }
}

