package com.jhooq.demo.Jhooqdockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class articleController {
    @Autowired
    private IarticleService articleService;

    @CrossOrigin(origins = {"http://localhost:4200","http://localhost:4300"})
    @GetMapping(value = "/article")
    public List<article> getProduct()
    {

        List<article> articles = articleService.findAll();

        return articles;
    }
    @CrossOrigin(origins = {"http://localhost:4200","http://localhost:4300"})
    @GetMapping("/article/{title}")
    public List<article> getProductTitle(@PathVariable String title){
        List<article> arti = articleService.findAll();
        System.out.println(title);
        String[] strAr=title.split(",");

        List<article> art=articleService.findTitle(strAr,arti);
        return art;
    }
    @PutMapping("/change/{id}")

        // Method
    List<article> ange(@PathVariable int id) {

        List<article> puni=articleService.change(id);

        System.out.println(puni);
        return puni;
    }
}
