package com.jhooq.demo.Jhooqdockerdemo;

public class article {
    private int id;
    private String title; /*pname*/
    private String body;/*batchno*/

    //default constructor
    public article()
    {

    }
    //constructor using fields
    public article(int id, String title, String body)
    {
        super();
        this.id = id;
        this.title = title;
        this.body = body;

    }
    //getters and setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getBody()
    {
        return body;
    }
    public void setBody(String body)
    {
        this.body = body;
    }
}
