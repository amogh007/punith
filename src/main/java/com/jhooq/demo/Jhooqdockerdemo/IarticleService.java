package com.jhooq.demo.Jhooqdockerdemo;

import java.util.List;

public interface IarticleService {
    List<article> findAll();

    List<article> findTitle(String[] title,List<article> ar);
    List<article> change(Integer id);
}
