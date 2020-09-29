public class HotelSearchResult {
    private Hotel hotel;
    private Float totalPrice;

    public HotelSearchResult(Hotel hotel, Float totalPrice){
        this.hotel = hotel;
        this.totalPrice = totalPrice;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }
}
