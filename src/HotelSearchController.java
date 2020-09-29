import java.util.ArrayList;
import java.util.List;

public class HotelSearchController {

    public static void main(String[] args) {
        //Data input
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel(Integer.valueOf(0),"Awesome Hotel", Float.valueOf(95f), new int[]{0, 1}));
        hotelList.add(new Hotel(Integer.valueOf(1),"Another Awesome Hotel", Float.valueOf(52.50f), new int[]{1, 2}));
        hotelList.add(new Hotel(Integer.valueOf(2),"One more Awesome Hotel", Float.valueOf(63.50f), new int[]{0, 1, 2}));
        hotelList.add(new Hotel(Integer.valueOf(3),"Awesome Hotel D", Float.valueOf(22.10f), new int[]{0, 2}));
        SearchParams searchParams = new SearchParams(1,2);

        //Search call and fetch results
        HotelService hotelService = new HotelService();
        List<HotelSearchResult> results = hotelService.searchHotels(hotelList, searchParams);

        //Print results
        for(HotelSearchResult hotelSearchResult: results) {
            System.out.println(new StringBuilder().append("hotel: ").append(hotelSearchResult.getHotel().toString())
                    .append(", price: ").append(hotelSearchResult.getTotalPrice()));
        }
    }
}
