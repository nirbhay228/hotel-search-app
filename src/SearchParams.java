public class SearchParams {
    private int startingDay;
    private int totalNights;

    public SearchParams(int startingDay, int totalNights){
        this.startingDay = startingDay;
        this.totalNights = totalNights;
    }

    public int getStartingDay() {
        return startingDay;
    }

    public int getTotalNights() {
        return totalNights;
    }
}
