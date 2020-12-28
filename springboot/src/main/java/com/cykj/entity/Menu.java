package com.cykj.entity;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menuid
     *
     * @mbggenerated
     */
    private Integer menuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menuName
     *
     * @mbggenerated
     */
    private String menuname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.role
     *
     * @mbggenerated
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.pid
     *
     * @mbggenerated
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menuid
     *
     * @return the value of menu.menuid
     *
     * @mbggenerated
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menuid
     *
     * @param menuid the value for menu.menuid
     *
     * @mbggenerated
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menuName
     *
     * @return the value of menu.menuName
     *
     * @mbggenerated
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menuName
     *
     * @param menuname the value for menu.menuName
     *
     * @mbggenerated
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.role
     *
     * @return the value of menu.role
     *
     * @mbggenerated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.role
     *
     * @param role the value for menu.role
     *
     * @mbggenerated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.pid
     *
     * @return the value of menu.pid
     *
     * @mbggenerated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.pid
     *
     * @param pid the value for menu.pid
     *
     * @mbggenerated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}