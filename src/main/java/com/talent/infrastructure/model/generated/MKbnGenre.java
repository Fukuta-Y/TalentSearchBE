package com.talent.infrastructure.model.generated;

import java.util.Date;

public class MKbnGenre {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_KBN_GENRE.GENRE_ID
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    private Integer genreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_KBN_GENRE.JYUNJYO
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    private Integer jyunjyo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_KBN_GENRE.GENRE
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    private String genre;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_KBN_GENRE.DELETE_FLG
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    private Integer deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_KBN_GENRE.TOROKU_DAY
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    private Date torokuDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column M_KBN_GENRE.KOUSHIN_DAY
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    private Date koushinDay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_KBN_GENRE.GENRE_ID
     *
     * @return the value of M_KBN_GENRE.GENRE_ID
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public Integer getGenreId() {
        return genreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_KBN_GENRE.GENRE_ID
     *
     * @param genreId the value for M_KBN_GENRE.GENRE_ID
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_KBN_GENRE.JYUNJYO
     *
     * @return the value of M_KBN_GENRE.JYUNJYO
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public Integer getJyunjyo() {
        return jyunjyo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_KBN_GENRE.JYUNJYO
     *
     * @param jyunjyo the value for M_KBN_GENRE.JYUNJYO
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public void setJyunjyo(Integer jyunjyo) {
        this.jyunjyo = jyunjyo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_KBN_GENRE.GENRE
     *
     * @return the value of M_KBN_GENRE.GENRE
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public String getGenre() {
        return genre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_KBN_GENRE.GENRE
     *
     * @param genre the value for M_KBN_GENRE.GENRE
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public void setGenre(String genre) {
        this.genre = genre == null ? null : genre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_KBN_GENRE.DELETE_FLG
     *
     * @return the value of M_KBN_GENRE.DELETE_FLG
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public Integer getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_KBN_GENRE.DELETE_FLG
     *
     * @param deleteFlg the value for M_KBN_GENRE.DELETE_FLG
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public void setDeleteFlg(Integer deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_KBN_GENRE.TOROKU_DAY
     *
     * @return the value of M_KBN_GENRE.TOROKU_DAY
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public Date getTorokuDay() {
        return torokuDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_KBN_GENRE.TOROKU_DAY
     *
     * @param torokuDay the value for M_KBN_GENRE.TOROKU_DAY
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public void setTorokuDay(Date torokuDay) {
        this.torokuDay = torokuDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column M_KBN_GENRE.KOUSHIN_DAY
     *
     * @return the value of M_KBN_GENRE.KOUSHIN_DAY
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public Date getKoushinDay() {
        return koushinDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column M_KBN_GENRE.KOUSHIN_DAY
     *
     * @param koushinDay the value for M_KBN_GENRE.KOUSHIN_DAY
     *
     * @mbg.generated Sun May 21 22:36:17 JST 2023
     */
    public void setKoushinDay(Date koushinDay) {
        this.koushinDay = koushinDay;
    }
}