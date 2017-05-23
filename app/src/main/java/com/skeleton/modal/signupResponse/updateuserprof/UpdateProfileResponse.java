package com.skeleton.modal.signupResponse.updateuserprof;

/**
 * Created by admin23 on 18/5/17.
 */

public class UpdateProfileResponse {
    private Integer statusCode;
    private String message;
    private Dataaa data;
    /**
     * @return status code
     */
    public Integer getStatusCode() {
        return statusCode;
    }
    /**
     * @param statusCode status code
     */
    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }
    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }
    /**
     * @param message message
     */
    public void setMessage(final String message) {
        this.message = message;
    }
    /**
     * @return data
     */
    public Dataaa getData() {
        return data;
    }
    /**
     * @param data data in set
     */
    public void setData(final Dataaa data) {
        this.data = data;
    }
}
