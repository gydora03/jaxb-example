package legoset;

import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    @XmlAttribute
    private int number;

    private String name;
    private String theme;
    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifits")
    @XmlElement(name = "minifit")
    private List<Minifit> minifits;

    @XmlElement(name = "weight")
    private List<Weight> weights;

    private URL url;
}
