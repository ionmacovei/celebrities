package com.packtpub.celebrities.data;

import com.packtpub.celebrities.model.Celebrity;
import com.packtpub.celebrities.model.Occupation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ion.macovei on 7/21/2017.
 */
public class MockDataSource {

    private List<Celebrity> celebrities =
            new ArrayList<Celebrity>();

    public MockDataSource() {
        try {
            addCelebrity(new Celebrity("Britney", "Spearce",
                    new SimpleDateFormat("dd/MM/yyyy").parse("12/02/1981"),
                    Occupation.SINGER));
            addCelebrity(new Celebrity("Bill", "Clinton",
                    new SimpleDateFormat("dd/MM/yyyy").parse("08/19/1946"),
                    Occupation.POLITICIAN));
            addCelebrity(new Celebrity("Placido", "Domingo",
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/21/1941"),
                    Occupation.SINGER));
            addCelebrity(new Celebrity("Albert", "Einstein",
                    new SimpleDateFormat("dd/MM/yyyy").parse("03/14/1879"),
                    Occupation.SCIENTIST));
            addCelebrity(new Celebrity("Ernest", "Hemingway",
                    new SimpleDateFormat("dd/MM/yyyy").parse("07/21/1899"),
                    Occupation.WRITER));
            addCelebrity(new Celebrity("Luciano", "Pavarotti",
                    new SimpleDateFormat("dd/MM/yyyy").parse("10/12/1935"),
                    Occupation.SINGER));
            addCelebrity(new Celebrity("Ronald", "Reagan",
                    new SimpleDateFormat("dd/MM/yyyy").parse("02/06/1911"),
                    Occupation.POLITICIAN));
            addCelebrity(new Celebrity("Pablo", "Picasso",
                    new SimpleDateFormat("dd/MM/yyyy").parse("10/25/1881"),
                    Occupation.ARTIST));
            addCelebrity(new Celebrity("Blaise", "Pascal",
                    new SimpleDateFormat("dd/MM/yyyy").parse("06/19/1623"),
                    Occupation.SCIENTIST));
            addCelebrity(new Celebrity("Isaac", "Newton",
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/04/1643"),
                    Occupation.SCIENTIST));
            addCelebrity(new Celebrity("Antonio", "Vivaldi",
                    new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1678"),
                    Occupation.COMPOSER));
            addCelebrity(new Celebrity("Niccolo", "Paganini",
                    new SimpleDateFormat("dd/MM/yyyy").parse("10/27/1782"),
                    Occupation.MUSICIAN));
            addCelebrity(new Celebrity("Johannes", "Kepler",
                    new SimpleDateFormat("dd/MM/yyyy").parse("12/27/1571"),
                    Occupation.SCIENTIST));
            addCelebrity(new Celebrity("Franz", "Kafka",
                    new SimpleDateFormat("dd/MM/yyyy").parse("07/03/1883"),
                    Occupation.WRITER));
            addCelebrity(new Celebrity("George", "Gershwin",
                    new SimpleDateFormat("dd/MM/yyyy").parse("09/26/1898"),
                    Occupation.COMPOSER));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public List<Celebrity> getAllCelebrities() {
        return celebrities;
    }

    public Celebrity getCelebrityById(long id) {
        for (Celebrity c : celebrities) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public void addCelebrity(Celebrity c) {
        long newId = celebrities.size();
        c.setId(newId);
        celebrities.add(c);
    }
}
