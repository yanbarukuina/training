package com.example.umatsu.trainingCRUD.model;

import java.util.Date;

public class TbMember {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_MEMBER.ID
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_MEMBER.NAME
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_MEMBER.BIRTHDAY
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_MEMBER.DELETE_FLAG
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    private Integer deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_MEMBER.ID
     *
     * @return the value of TB_MEMBER.ID
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_MEMBER.ID
     *
     * @param id the value for TB_MEMBER.ID
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_MEMBER.NAME
     *
     * @return the value of TB_MEMBER.NAME
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_MEMBER.NAME
     *
     * @param name the value for TB_MEMBER.NAME
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_MEMBER.BIRTHDAY
     *
     * @return the value of TB_MEMBER.BIRTHDAY
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_MEMBER.BIRTHDAY
     *
     * @param birthday the value for TB_MEMBER.BIRTHDAY
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_MEMBER.DELETE_FLAG
     *
     * @return the value of TB_MEMBER.DELETE_FLAG
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_MEMBER.DELETE_FLAG
     *
     * @param deleteFlag the value for TB_MEMBER.DELETE_FLAG
     *
     * @mbggenerated Sun May 14 18:27:59 GMT+09:00 2017
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}