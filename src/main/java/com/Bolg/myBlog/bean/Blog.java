package com.Bolg.myBlog.bean;

public class Blog {
    private String title;
    private String author;
    private String content;
    private String date;
    private String Id;

    public Blog(String content, String title, String author, String date, String id) {
        this.content = content;
        this.title = title;
        this.author = author;
        this.date = date;
        Id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return Id;
    }
}
