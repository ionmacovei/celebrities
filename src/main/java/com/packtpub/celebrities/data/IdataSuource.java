package com.packtpub.celebrities.data;

import com.packtpub.celebrities.model.Celebrity;

import java.util.List;

/**
 * Created by ion.macovei on 7/21/2017.
 */
public interface IdataSuource {
    public List<Celebrity> getAllCelebrities();
    public Celebrity getCelebrityById(long id);
    public void addCelebrity(Celebrity c);
}
