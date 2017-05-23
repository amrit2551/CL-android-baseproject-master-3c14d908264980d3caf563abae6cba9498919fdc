package com.skeleton.modal.signupResponse;

import com.google.gson.annotations.SerializedName;

/**
 * {@link ProfilePicURL}
 */
public class ProfilePicURL {
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("original")
    private String original;

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
