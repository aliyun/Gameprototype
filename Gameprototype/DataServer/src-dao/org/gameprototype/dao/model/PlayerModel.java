package org.gameprototype.dao.model;

import java.io.Serializable;

public class PlayerModel implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_model.id
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_model.name
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_model.img
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_model.hitpoints
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    private Integer hitpoints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_model.damage
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    private Integer damage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_model.info
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    private String info;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_model.id
     *
     * @return the value of player_model.id
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_model.id
     *
     * @param id the value for player_model.id
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_model.name
     *
     * @return the value of player_model.name
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_model.name
     *
     * @param name the value for player_model.name
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_model.img
     *
     * @return the value of player_model.img
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_model.img
     *
     * @param img the value for player_model.img
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_model.hitpoints
     *
     * @return the value of player_model.hitpoints
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public Integer getHitpoints() {
        return hitpoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_model.hitpoints
     *
     * @param hitpoints the value for player_model.hitpoints
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public void setHitpoints(Integer hitpoints) {
        this.hitpoints = hitpoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_model.damage
     *
     * @return the value of player_model.damage
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public Integer getDamage() {
        return damage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_model.damage
     *
     * @param damage the value for player_model.damage
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_model.info
     *
     * @return the value of player_model.info
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_model.info
     *
     * @param info the value for player_model.info
     *
     * @mbggenerated Wed Sep 16 12:05:17 CST 2015
     */
    public void setInfo(String info) {
        this.info = info;
    }

    public boolean equals(PlayerModel model) {
        return this.getDamage().equals(model.getDamage()) &&
                this.getHitpoints().equals(model.getHitpoints()) &&
                this.getInfo().equals(model.getInfo()) &&
                this.getImg().equals(model.getImg()) &&
                this.getName().equals(model.getName()) &&
                this.getId().equals(model.getId());
    }
}