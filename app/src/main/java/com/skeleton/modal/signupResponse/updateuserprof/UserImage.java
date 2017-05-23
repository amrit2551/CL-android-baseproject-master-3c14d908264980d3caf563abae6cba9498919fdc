package com.skeleton.modal.signupResponse.updateuserprof;

/**
 * Created by admin23 on 18/5/17.
 */

public class UserImage {
    private String id;
    private String thumbnail;
    private String original;

    /**
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id id of user
     */
    public void setId(final String id) {
        this.id = id;
    }
    /**
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }
    /**
     * @param thumbnail set thumb nail
     */
    public void setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
    }
    /**
     * @return get original
     */
    public String getOriginal() {
        return original;
    }
    /**
     * @param original set original
     */
    public void setOriginal(final String original) {
        this.original = original;
    }
}
