package com.example.demo.repository.model.generated;

import java.util.Date;

public class MTalent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_TALENT.TALENT_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private String talentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_TALENT.TALENT_NAME
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private String talentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_TALENT.GENRE_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Integer genreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_TALENT.DELETE_FLG
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Integer deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_TALENT.TOROKU_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Date torokuDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_TALENT.KOUSHIN_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    private Date koushinDay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_TALENT.TALENT_ID
     *
     * @return the value of M_TALENT.TALENT_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public String getTalentId() {
        return talentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_TALENT.TALENT_ID
     *
     * @param talentId the value for M_TALENT.TALENT_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setTalentId(String talentId) {
        this.talentId = talentId == null ? null : talentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_TALENT.TALENT_NAME
     *
     * @return the value of M_TALENT.TALENT_NAME
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public String getTalentName() {
        return talentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_TALENT.TALENT_NAME
     *
     * @param talentName the value for M_TALENT.TALENT_NAME
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setTalentName(String talentName) {
        this.talentName = talentName == null ? null : talentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_TALENT.GENRE_ID
     *
     * @return the value of M_TALENT.GENRE_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Integer getGenreId() {
        return genreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_TALENT.GENRE_ID
     *
     * @param genreId the value for M_TALENT.GENRE_ID
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_TALENT.DELETE_FLG
     *
     * @return the value of M_TALENT.DELETE_FLG
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Integer getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_TALENT.DELETE_FLG
     *
     * @param deleteFlg the value for M_TALENT.DELETE_FLG
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setDeleteFlg(Integer deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_TALENT.TOROKU_DAY
     *
     * @return the value of M_TALENT.TOROKU_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Date getTorokuDay() {
        return torokuDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_TALENT.TOROKU_DAY
     *
     * @param torokuDay the value for M_TALENT.TOROKU_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setTorokuDay(Date torokuDay) {
        this.torokuDay = torokuDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_TALENT.KOUSHIN_DAY
     *
     * @return the value of M_TALENT.KOUSHIN_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public Date getKoushinDay() {
        return koushinDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_TALENT.KOUSHIN_DAY
     *
     * @param koushinDay the value for M_TALENT.KOUSHIN_DAY
     *
     * @mbg.generated Sun Jun 04 21:45:58 JST 2023
     */
    public void setKoushinDay(Date koushinDay) {
        this.koushinDay = koushinDay;
    }
}