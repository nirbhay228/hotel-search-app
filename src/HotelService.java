import java.util.ArrayList;
import java.util.List;

public class HotelService {
    public List<HotelSearchResult> searchHotels(List<Hotel> hotelList, SearchParams searchParams){
        List<HotelSearchResult> searchResult = new ArrayList<>();
        int start, mid, end;
        boolean found;
        for(Hotel hotel: hotelList){
            start = 0;
            end = hotel.getAvailability().length-1;
            found = false;
            while(start<=end) {
                mid = (start + end)/2;
                if(hotel.getAvailability()[mid] == searchParams.getStartingDay()) {
                    if( (mid+searchParams.getTotalNights()-1 <= hotel.getAvailability().length-1)
                            && (hotel.getAvailability()[mid+searchParams.getTotalNights()-1] == searchParams.getStartingDay()+searchParams.getTotalNights()-1)) {
                        searchResult.add(new HotelSearchResult(hotel, hotel.getPrice()*searchParams.getTotalNights()));
                    }
                    break;
                } else if(hotel.getAvailability()[mid] > searchParams.getStartingDay()) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return searchResult;
    }
}
