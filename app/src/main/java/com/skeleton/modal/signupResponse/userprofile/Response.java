package com.skeleton.modal.signupResponse.userprofile;


import java.util.List;

/**
 * model for TheResponse input details
 */
public class Response {

    private Integer statusCode;
    private String message;
    private Data data;

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
     * @return message from server
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message message from server
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * @return data object from server
     */
    public Data getData() {
        return data;
    }

    /**
     * @param data user TheResponse input detail option
     */
    public void setData(final Data data) {
        this.data = data;
    }

    /**
     * data of user
     */
    public class Data {

        private List<String> orientation = null;
        private List<String> relationshipHistory = null;
        private List<String> ethnicity = null;
        private List<String> religion = null;
        private List<String> bodyType = null;
        private List<String> smoking = null;
        private List<String> drinking = null;
        private List<String> height = null;

        /**
         * @return orientation of user
         */
        public List<String> getOrientation() {
            return orientation;
        }

        /**
         * @param orientation orientation of user
         */
        public void setOrientation(final List<String> orientation) {
            this.orientation = orientation;
        }

        /**
         * @return relationship history of user
         */
        public List<String> getRelationshipHistory() {
            return relationshipHistory;
        }

        /**
         * @param relationshipHistory relation history of user
         */
        public void setRelationshipHistory(final List<String> relationshipHistory) {
            this.relationshipHistory = relationshipHistory;
        }

        /**
         * @return ethnicity of user
         */
        public List<String> getEthnicity() {
            return ethnicity;
        }

        /**
         * @param ethnicity of user
         */
        public void setEthnicity(final List<String> ethnicity) {
            this.ethnicity = ethnicity;
        }

        /**
         * @return religion of user
         */
        public List<String> getReligion() {
            return religion;
        }

        /**
         * @param religion of user
         */
        public void setReligion(final List<String> religion) {
            this.religion = religion;
        }

        /**
         * @return body Type
         */
        public List<String> getBodyType() {
            return bodyType;
        }

        /**
         * @param bodyType of user
         */
        public void setBodyType(final List<String> bodyType) {
            this.bodyType = bodyType;
        }

        /**
         * @return smoking
         */
        public List<String> getSmoking() {
            return smoking;
        }

        /**
         * @param smoking habits of user
         */
        public void setSmoking(final List<String> smoking) {
            this.smoking = smoking;
        }

        /**
         * @return drinking
         */
        public List<String> getDrinking() {
            return drinking;
        }

        /**
         * @param drinking of user
         */
        public void setDrinking(final List<String> drinking) {
            this.drinking = drinking;
        }

        /**
         * @return height of user
         */
        public List<String> getHeight() {
            return height;
        }

        /**
         * @param height of user
         */
        public void setHeight(final List<String> height) {
            this.height = height;
        }

    }
}

