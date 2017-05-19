package org.lucien.apigateway.models;

/**
 * Created by lucien on 2017/5/16.
 */
public class NewInfo {
    private int nid;
    private String title;
    private String content;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
