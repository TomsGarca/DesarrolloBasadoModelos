import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelFacade {
    private FlightService flightService;
    private HotelService hotelService;

    public TravelFacade() {
        this.flightService = new FlightService();
        this.hotelService = new HotelService();
    }

    public List<Flight> searchFlights(Date startDate, Date endDate, String from, String to) {
        return flightService.getFlights(startDate, endDate, from, to);
    }

    public List<Hotel> searchHotels(Date startDate, Date endDate, String location) {
        return hotelService.getHotels(startDate, endDate, location);
    }
}