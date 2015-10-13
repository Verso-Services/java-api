/**
 * Copyright 2009 Intelligent Sense.
 * 
 * All Rights Reserved.
 * This software is the proprietary information of
 * Intelligent Sense.
 * Use this subject to license terms.
 * 
 * Filename: ApiUser.java
 * ApiUser
 */
package javaversoclientexample;

/**
 * 
 * Class to handle the Verso API authentication user 
 */
public class ApiUser {
    
    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    private String UserName;
    private String Password;    
       
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    
    /**
     * Class constructor
     * @param pUserName: The Articles batch user to be authenticated
     * @param pPassword: The Articles batch user password
     */
    public ApiUser(String pUserName, String pPassword) {
        this.UserName = pUserName;
        this.Password = pPassword;
    }
    
    /**
     * UserName Getter
     * @return UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * Password Getter
     * @return Password
     */
    public String getPassword() {
        return Password;
    }
    
    /**
     * UserName setter 
     * @param pUserName UserName to be set
     */
    public void setUserName(String pUserName) {
        this.UserName = pUserName;
    }

    /**
     * Password setter
     * @param pPassword Password to be set
     */
    public void setPassword(String pPassword) {
        this.Password = pPassword;
    }
    
    // </editor-fold>
}
