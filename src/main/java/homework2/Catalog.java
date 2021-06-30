package homework2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "factory")
public class Catalog {

    @XmlElement
    private List<Candy> candys = new ArrayList<>();

    public void add(Candy candy) {
        candys.add(candy);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(candys.toArray());
    }
}
