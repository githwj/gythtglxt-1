package com.gythtglxt.dataobject;

import java.util.Date;

public class RegisterRefDO extends RegisterRefDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.REGISTER_NUM
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Integer registerNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.SOURCE_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String sourceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.USER_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.PATIENT_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String patientCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.REGISTER_STATUS
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String registerStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.SOURCE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Double source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.CREATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.itemCreateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Date itemcreateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.UPDATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_register_ref.itemUpdateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Date itemupdateat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.REGISTER_NUM
     *
     * @return the value of tb_natmeha_register_ref.REGISTER_NUM
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Integer getRegisterNum() {
        return registerNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.REGISTER_NUM
     *
     * @param registerNum the value for tb_natmeha_register_ref.REGISTER_NUM
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setRegisterNum(Integer registerNum) {
        this.registerNum = registerNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.SOURCE_CODE
     *
     * @return the value of tb_natmeha_register_ref.SOURCE_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.SOURCE_CODE
     *
     * @param sourceCode the value for tb_natmeha_register_ref.SOURCE_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode == null ? null : sourceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.USER_CODE
     *
     * @return the value of tb_natmeha_register_ref.USER_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.USER_CODE
     *
     * @param userCode the value for tb_natmeha_register_ref.USER_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.PATIENT_CODE
     *
     * @return the value of tb_natmeha_register_ref.PATIENT_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getPatientCode() {
        return patientCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.PATIENT_CODE
     *
     * @param patientCode the value for tb_natmeha_register_ref.PATIENT_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode == null ? null : patientCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.REGISTER_STATUS
     *
     * @return the value of tb_natmeha_register_ref.REGISTER_STATUS
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getRegisterStatus() {
        return registerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.REGISTER_STATUS
     *
     * @param registerStatus the value for tb_natmeha_register_ref.REGISTER_STATUS
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus == null ? null : registerStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.SOURCE
     *
     * @return the value of tb_natmeha_register_ref.SOURCE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Double getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.SOURCE
     *
     * @param source the value for tb_natmeha_register_ref.SOURCE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setSource(Double source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.CREATER
     *
     * @return the value of tb_natmeha_register_ref.CREATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.CREATER
     *
     * @param creater the value for tb_natmeha_register_ref.CREATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.itemCreateAt
     *
     * @return the value of tb_natmeha_register_ref.itemCreateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.itemCreateAt
     *
     * @param itemcreateat the value for tb_natmeha_register_ref.itemCreateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.UPDATER
     *
     * @return the value of tb_natmeha_register_ref.UPDATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.UPDATER
     *
     * @param updater the value for tb_natmeha_register_ref.UPDATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_register_ref.itemUpdateAt
     *
     * @return the value of tb_natmeha_register_ref.itemUpdateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_register_ref.itemUpdateAt
     *
     * @param itemupdateat the value for tb_natmeha_register_ref.itemUpdateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }
}