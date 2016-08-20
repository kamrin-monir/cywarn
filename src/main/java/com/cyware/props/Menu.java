package com.cyware.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by KamrinK on 20-08-2016.
 */

@ConfigurationProperties(prefix = "menu")
public class Menu {

    private String menu1Id;
    private String menu2Id;
    private String menu3Id;
    private String menu4Xpath;
    private String containerId;
    private String menu1Title;
    private String menu2Title;
    private String menu3Title;
    private String menu4Title;
    private String menu1contentXpath;
    private String menu1BlockClassName;
    private String postTitleClassName;
    private String metaClassName;
    private String descriptionClasName;
    private String metaDownClassName;
    private String menu4ContainerId;

    public String getMenu1Id() {
        return menu1Id;
    }

    public void setMenu1Id(String menu1Id) {
        this.menu1Id = menu1Id;
    }

    public String getMenu2Id() {
        return menu2Id;
    }

    public void setMenu2Id(String menu2Id) {
        this.menu2Id = menu2Id;
    }

    public String getMenu3Id() {
        return menu3Id;
    }

    public void setMenu3Id(String menu3Id) {
        this.menu3Id = menu3Id;
    }

    public String getMenu4Xpath() {
        return menu4Xpath;
    }

    public void setMenu4Xpath(String menu4Xpath) {
        this.menu4Xpath = menu4Xpath;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getMenu1Title() {
        return menu1Title;
    }

    public void setMenu1Title(String menu1Title) {
        this.menu1Title = menu1Title;
    }

    public String getMenu1contentXpath() {
        return menu1contentXpath;
    }

    public void setMenu1contentXpath(String menu1contentXpath) {
        this.menu1contentXpath = menu1contentXpath;
    }

    public String getMenu1BlockClassName() {
        return menu1BlockClassName;
    }

    public void setMenu1BlockClassName(String menu1BlockClassName) {
        this.menu1BlockClassName = menu1BlockClassName;
    }

    public String getPostTitleClassName() {
        return postTitleClassName;
    }

    public void setPostTitleClassName(String postTitleClassName) {
        this.postTitleClassName = postTitleClassName;
    }

    public String getMetaClassName() {
        return metaClassName;
    }

    public void setMetaClassName(String metaClassName) {
        this.metaClassName = metaClassName;
    }

    public String getDescriptionClasName() {
        return descriptionClasName;
    }

    public void setDescriptionClasName(String descriptionClasName) {
        this.descriptionClasName = descriptionClasName;
    }

    public String getMetaDownClassName() {
        return metaDownClassName;
    }

    public void setMetaDownClassName(String metaDownClassName) {
        this.metaDownClassName = metaDownClassName;
    }

    public String getMenu2Title() {
        return menu2Title;
    }

    public void setMenu2Title(String menu2Title) {
        this.menu2Title = menu2Title;
    }

    public String getMenu3Title() {
        return menu3Title;
    }

    public void setMenu3Title(String menu3Title) {
        this.menu3Title = menu3Title;
    }

    public String getMenu4Title() {
        return menu4Title;
    }

    public void setMenu4Title(String menu4Title) {
        this.menu4Title = menu4Title;
    }

    public String getMenu4ContainerId() {
        return menu4ContainerId;
    }

    public void setMenu4ContainerId(String menu4ContainerId) {
        this.menu4ContainerId = menu4ContainerId;
    }
}
