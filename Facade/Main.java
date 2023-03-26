import java.util.*;
import java.text.*;
import java.util.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        TravelFacade travelFacade = new TravelFacade();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Buscar vuelos
        Date startDate = dateFormat.parse("2023-04-01");
        Date endDate = dateFormat.parse("2023-04-10");
        String from = "New York";
        String to = "Los Angeles";
        List<Flight> flights = travelFacade.searchFlights(startDate, endDate, from, to);
        System.out.println("Vuelos disponibles de " + from + " a " + to + " del " + dateFormat.format(startDate) + " al " + dateFormat.format(endDate) + ": " + flights);

        // Buscar hoteles
        startDate = dateFormat.parse("2023-04-05");
        endDate = dateFormat.parse("2023-04-08");
        String location = "New York";
        List<Hotel> hotels = travelFacade.searchHotels(startDate, endDate, location);
        System.out.println("Hoteles disponibles en " + location + " del " + dateFormat.format(startDate) + " al " + dateFormat.format(endDate) + ": " + hotels);
    }
}