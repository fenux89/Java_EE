package homework2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Candy {

    private String type;
    private String stuffing;
    private int weight;

    public Candy() {
    }

    public Candy(String type, String stuffing, int weight) {
        this.type = type;
        this.stuffing = stuffing;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public String getStuffing() {
        return stuffing;
    }

    @XmlElement
    public void setStuffing(String stuffing) {
        this.stuffing = stuffing;
    }

    public int getWeight() {
        return weight;
    }

    @XmlElement
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[" + type + ", " + stuffing + ", " + weight + "]";
    }
}
