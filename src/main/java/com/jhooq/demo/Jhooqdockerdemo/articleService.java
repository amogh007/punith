package com.jhooq.demo.Jhooqdockerdemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class articleService implements IarticleService{
    ArrayList<article> articles = new ArrayList<article>();

    articleService(){
        articles.add(new article(100, "Mobile", "CLK98123"));
        articles.add(new article(101, "Smart TV", "LGST09167"));
        articles.add(new article(102, "Washing Machine", "38753BK9"));
        articles.add(new article(103, "Laptop", "LHP29OCP"));
        articles.add(new article(104, "Air Conditioner", "ACLG66721"));
        articles.add(new article(105, "Refrigerator ", "12WP9087"));

    }
    @Override
    public List<article> findTitle(String[] title, List<article> ar){
        List<article> ra=new ArrayList<article>();
        String robo;
        for(int j=0;j< title.length;j++) {
            for (int i = 0; i < ar.size(); i++) {
                robo = ar.get(i).getTitle();
                System.out.println(robo);
                System.out.println(title);
                System.out.println("--------");
                if (robo.equalsIgnoreCase(title[j])) {
                    ra.add(ar.get(i));
                }

            }
        }
        System.out.println(ra);
        System.out.println("after printig ra");
        return ra;
    }

    @Override
    public List<article> change(Integer id) {
        System.out.println("entering to change method");


        for(int i=0;i<articles.size();i++){
            if(id==articles.get(i).getId()){
                articles.remove(i);
                articles.add(new article(id,"blah","blah"));
            }
        }
        return articles;
    }

    @Override
    public List<article> findAll()
    {
//creating an object of ArrayList

//adding article to the List

//returns a list of article
        return articles;
    }


}
