import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Sample departmentMap
        Map<String, List<BookingModel>> departmentMap = new HashMap<>();

        // Populate departmentMap with sample data
        List<BookingModel> bookings1 = new ArrayList<>();
        bookings1.add(new BookingModel("101", "Booking 1", "Department A"));
        bookings1.add(new BookingModel("102", "Booking 2", "Department A"));
        departmentMap.put("Department A", bookings1);

        List<BookingModel> bookings2 = new ArrayList<>();
        bookings2.add(new BookingModel("201", "Booking 3", "Department B"));
        bookings2.add(new BookingModel("202", "Booking 4", "Department B"));
        departmentMap.put("Department B", bookings2);

        String department = "Department A";
        System.out.println("departmentMap "+departmentMap);
        // Get list of booking IDs with the given department
        List<String> bookingIds = departmentMap.entrySet().stream()
                .filter(entry -> entry.getKey().equals(department))
                .flatMap(entry -> entry.getValue().stream())
                .map(BookingModel::getBookingId)
                .collect(Collectors.toList());

        System.out.println("Booking IDs with department " + department + ":");
        System.out.println(bookingIds);
    }
}

