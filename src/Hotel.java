import java.util.Arrays;
import java.util.List;

public class Hotel {
    private Integer id;
    private String name;
    private Float price;
    private int[] availability;

    public Hotel(Integer id, String name, Float price, int[] availability){
        this.id = id;
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public int[] getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(this.name).append("(").append(this.id).append(")").toString();
    }
}
