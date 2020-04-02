package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifit {

    @XmlValue
    private String title;

    @XmlAttribute
    private int count;

    public Minifit() {}

    public Minifit(String title, int count) {
        this.title = title;
        this.count = count;
    }
}
