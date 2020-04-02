package legoset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

import jaxb.JAXBHelper;
import movie.Movie;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber(75211);
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo" ));

        ArrayList<Minifit> minifits = new ArrayList<>();
        minifits.add(new Minifit("Imperial Mudtrooper", 2));
        minifits.add(new Minifit("Imperial Pilot", 1));
        minifits.add(new Minifit("Mimban Stormtrooper", 1));
        legoSet.setMinifits(minifits);

        ArrayList<Weight> weights = new ArrayList<>();
        weights.add(new Weight(0.89, "kg"));
        legoSet.setWeights(weights);

        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoSet.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoSet.xml")));
    }
}
