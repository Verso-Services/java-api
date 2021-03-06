/**
 * Copyright 2009 Intelligent Sense.
 * 
 * All Rights Reserved.
 * This software is the proprietary information of
 * Intelligent Sense.
 * Use this subject to license terms.
 * 
 * Filename: ImportArticlesBatchInfo.java
 * ImportArticlesBatchInfo
 */
package javaversoclientexample;

import java.util.ArrayList;

/**
 * Class to handle the import articles batch json object
 */ 
public class ImportArticlesBatchInfo extends ApiUser{
    
    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    private ArrayList<ArticleInfo> Articles;
    
       
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    
    /**
     * Class constructor
     * @param pUserName: The Articles batch user to be authenticated
     * @param pPassword: The Articles batch user password
     */
    public ImportArticlesBatchInfo(String pUserName, String pPassword) {
        super(pUserName,pPassword);
        this.Articles = new ArrayList<>();
    }
    
    /**
     * Class constructor
     * @param pUserName: The Articles batch user to be authenticated
     * @param pPassword: The Articles batch user password
     * @param pArticles: The list of articles to be imported in Verso
     */
    public ImportArticlesBatchInfo(String pUserName, String pPassword, ArrayList<ArticleInfo> pArticles) {
        super(pUserName,pPassword);
        this.Articles = pArticles;
    }
    
    /**
     * Adds an article to the import articles batch list
     * @param pArticle: The article to be added
     */
    public void addArticle(ArticleInfo pArticle){
        
        if(this.Articles == null)
            this.Articles = new ArrayList<>();
        
        this.Articles.add(pArticle);
    }

    /**
     * Articles Getter
     * @return Articles
     */
    public ArrayList<ArticleInfo> getArticles() {
        return Articles;
    }

    /**
     * Articles setter
     * @param pArticles articles to be set
     */
    public void setArticles(ArrayList<ArticleInfo> pArticles) {
        this.Articles = pArticles;
    }
    
    // </editor-fold>
   
}
