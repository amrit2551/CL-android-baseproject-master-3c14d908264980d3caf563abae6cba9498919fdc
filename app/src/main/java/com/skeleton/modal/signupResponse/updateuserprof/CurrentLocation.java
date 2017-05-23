package com.skeleton.modal.signupResponse.updateuserprof;

import java.util.List;

/**
 * Created by admin23 on 18/5/17.
 */

public class CurrentLocation {
    private List<Integer> coordinates = null;
    private String type;
    /**
     * @return return coordinates
     */
    public List<Integer> getCoordinates() {
        return coordinates;
    }
    /**
     * @param coordinates set coordinates
     */
    public void setCoordinates(final List<Integer> coordinates) {
        this.coordinates = coordinates;
    }
    /**
     * @return get Type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type type
     */
    public void setType(final String type) {
        this.type = type;
    }
}
