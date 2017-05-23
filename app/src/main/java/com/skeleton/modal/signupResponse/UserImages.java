package com.skeleton.modal.signupResponse;

import com.google.gson.annotations.SerializedName;

/**
 * Model class {@link UserImages}
 */
public class UserImages {
    @SerializedName("id")
    private String id;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("original")
    private String original;

    /**
     * Setter id
     *
     * @return : id
     */
    public String getId() {
        return id;
    }

    /**
     * setter
     *
     * @param id : id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * thumbnail
     *
     * @return : thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * thumbnail
     *
     * @param thumbnail : thumbnail
     */
    public void setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * original
     *
     * @return : original
     */
    public String getOriginal() {
        return original;
    }

    /**
     * original
     *
     * @param original : original
     */
    public void setOriginal(final String original) {
        this.original = original;
    }
}
