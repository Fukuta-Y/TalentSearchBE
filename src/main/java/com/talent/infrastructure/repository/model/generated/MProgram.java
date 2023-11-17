package com.talent.infrastructure.repository.model.generated;

import java.util.Date;

public class MProgram {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.PROGRAM_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private String programId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.PROGRAM_NAME
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private String programName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.CHANEL_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Integer channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.GENRE_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Integer genreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.DELETE_FLG
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Integer deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.TOROKU_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Date torokuDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_PROGRAM.KOUSHIN_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Date koushinDay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.PROGRAM_ID
     *
     * @return the value of M_PROGRAM.PROGRAM_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.PROGRAM_ID
     *
     * @param programId the value for M_PROGRAM.PROGRAM_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setProgramId(String programId) {
        this.programId = programId == null ? null : programId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.PROGRAM_NAME
     *
     * @return the value of M_PROGRAM.PROGRAM_NAME
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.PROGRAM_NAME
     *
     * @param programName the value for M_PROGRAM.PROGRAM_NAME
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.CHANEL_ID
     *
     * @return the value of M_PROGRAM.CHANEL_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.CHANEL_ID
     *
     * @param channelId the value for M_PROGRAM.CHANEL_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.GENRE_ID
     *
     * @return the value of M_PROGRAM.GENRE_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Integer getGenreId() {
        return genreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.GENRE_ID
     *
     * @param genreId the value for M_PROGRAM.GENRE_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.DELETE_FLG
     *
     * @return the value of M_PROGRAM.DELETE_FLG
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Integer getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.DELETE_FLG
     *
     * @param deleteFlg the value for M_PROGRAM.DELETE_FLG
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setDeleteFlg(Integer deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.TOROKU_DAY
     *
     * @return the value of M_PROGRAM.TOROKU_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Date getTorokuDay() {
        return torokuDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.TOROKU_DAY
     *
     * @param torokuDay the value for M_PROGRAM.TOROKU_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setTorokuDay(Date torokuDay) {
        this.torokuDay = torokuDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_PROGRAM.KOUSHIN_DAY
     *
     * @return the value of M_PROGRAM.KOUSHIN_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Date getKoushinDay() {
        return koushinDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_PROGRAM.KOUSHIN_DAY
     *
     * @param koushinDay the value for M_PROGRAM.KOUSHIN_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setKoushinDay(Date koushinDay) {
        this.koushinDay = koushinDay;
    }
}