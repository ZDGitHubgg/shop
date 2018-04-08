package com.zd.shop.pojo.po;

import java.io.Serializable;

public class User implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated
     */
    private String user_name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbggenerated
     */
    private String user_password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_email
     *
     * @mbggenerated
     */
    private String user_email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_gender
     *
     * @mbggenerated
     */
    private String user_gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_phone
     *
     * @mbggenerated
     */
    private String user_phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_address
     *
     * @mbggenerated
     */
    private String user_address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param user_id the value for user.user_id
     *
     * @mbggenerated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param user_name the value for user.user_name
     *
     * @mbggenerated
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbggenerated
     */
    public String getUser_password() {
        return user_password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param user_password the value for user.user_password
     *
     * @mbggenerated
     */
    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_email
     *
     * @return the value of user.user_email
     *
     * @mbggenerated
     */
    public String getUser_email() {
        return user_email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_email
     *
     * @param user_email the value for user.user_email
     *
     * @mbggenerated
     */
    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_gender
     *
     * @return the value of user.user_gender
     *
     * @mbggenerated
     */
    public String getUser_gender() {
        return user_gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_gender
     *
     * @param user_gender the value for user.user_gender
     *
     * @mbggenerated
     */
    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender == null ? null : user_gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_phone
     *
     * @return the value of user.user_phone
     *
     * @mbggenerated
     */
    public String getUser_phone() {
        return user_phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_phone
     *
     * @param user_phone the value for user.user_phone
     *
     * @mbggenerated
     */
    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_address
     *
     * @return the value of user.user_address
     *
     * @mbggenerated
     */
    public String getUser_address() {
        return user_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_address
     *
     * @param user_address the value for user.user_address
     *
     * @mbggenerated
     */
    public void setUser_address(String user_address) {
        this.user_address = user_address == null ? null : user_address.trim();
    }
}