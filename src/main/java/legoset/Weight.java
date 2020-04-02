package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weight {

    @XmlValue
    private double quantity;

    @XmlAttribute
    private String unit;

    public Weight() {}

    public Weight(double quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }
}
