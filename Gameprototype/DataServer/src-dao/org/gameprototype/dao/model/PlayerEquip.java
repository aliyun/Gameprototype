package org.gameprototype.dao.model;

import java.io.Serializable;

public class PlayerEquip implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_equip.id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_equip.player_id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    private Integer playerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_equip.equip_id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    private Integer equipId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column player_equip.status
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    private Integer status;
    private Integer itemType;
    private String itemName;
    private Integer itemValue;
    private String itemUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_equip.id
     *
     * @return the value of player_equip.id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_equip.id
     *
     * @param id the value for player_equip.id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_equip.player_id
     *
     * @return the value of player_equip.player_id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_equip.player_id
     *
     * @param playerId the value for player_equip.player_id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_equip.equip_id
     *
     * @return the value of player_equip.equip_id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public Integer getEquipId() {
        return equipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_equip.equip_id
     *
     * @param equipId the value for player_equip.equip_id
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column player_equip.status
     *
     * @return the value of player_equip.status
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column player_equip.status
     *
     * @param status the value for player_equip.status
     *
     * @mbggenerated Wed Sep 16 15:06:45 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemValue() {
        return itemValue;
    }

    public void setItemValue(Integer itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public boolean equals(PlayerEquip tmp) {
        return this.getId().equals(tmp.getId()) &&
                this.getEquipId().equals(tmp.getEquipId()) &&
                this.getPlayerId().equals(tmp.getPlayerId()) &&
                this.getStatus().equals(tmp.getStatus());
    }
}