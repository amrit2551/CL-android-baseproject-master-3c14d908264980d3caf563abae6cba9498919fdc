package com.skeleton.modal.signupResponse.userproftwo;

/**
 * Created by admin23 on 16/5/17.
 */

public class Category {
    private String id;
    private String categoryType;
    private String updatedAt;
    private String createdAt;
    private Boolean isDeleted;
    private PicURL picURL;
    private String name;
    private Boolean isChecked;
    /**
     * @return if category is checked or not
     */
    public Boolean getChecked() {
        return isChecked;
    }

    /**
     * @param checked sets if Category is checked or not
     */
    public void setChecked(final Boolean checked) {
        isChecked = checked;
    }
    /**
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id set id
     */

    public void setId(final String id) {
        this.id = id;
    }
    /**
     * @return Category type
     */
    public String getCategoryType() {
        return categoryType;
    }
    /**
     * @param categoryType set category tyepe
     */

    public void setCategoryType(final String categoryType) {
        this.categoryType = categoryType;
    }
    /**
     * @return get update
     */

    public String getUpdatedAt() {
        return updatedAt;
    }
    /**
     * @param updatedAt set update
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }
    /**
     * @return get created at
     */
    public String getCreatedAt() {
        return createdAt;
    }
    /**
     * @param createdAt set create at
     */

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * @return is Deleted
     */

    public Boolean getIsDeleted() {
        return isDeleted;
    }
    /**
     * @param isDeleted set Deleted
     */

    public void setIsDeleted(final Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    /**
     * @return get Pic URL
     */
    public PicURL getPicURL() {
        return picURL;
    }
    /**
     * @param picURL set Pic URL
     */
    public void setPicURL(final PicURL picURL) {
        this.picURL = picURL;
    }
    /**
     * @return get name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name set name
     */
    public void setName(final String name) {
        this.name = name;
    }
}
