package com.skeleton.modal.signupResponse.userproftwo;

/**
 * Created by admin23 on 16/5/17.
 */

public class Categories {

    private Integer statusCode;
    private String message;
    private Dataa data;
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
     * @return get Message
     */
    public String getMessage() {
        return message;
    }
    /**
     * @param message setMessage
     */
    public void setMessage(final String message) {
        this.message = message;
    }
    /**
     * @return get data
     */
    public Dataa getData() {
        return data;
    }
    /**
     * @param data set data
     */
    public void setData(final Dataa data) {
        this.data = data;
    }

}


