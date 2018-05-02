package android.adnetplus.com.lap4a;

/**
 * Created by Adminis on 4/20/2018.
 */

public class Order {
    int id;
    String name;
    String phone_number;
    String departure;
    String arrival;
    int ticket_type;
    String departure_date;
    String arrival_date;
    int man;
    int children;

    public Order(String name, String phone_number, String departure, String arrival, int ticket_type, String departure_date, String arrival_date, int man, int children) {
        this.name = name;
        this.phone_number = phone_number;
        this.departure = departure;
        this.arrival = arrival;
        this.ticket_type = ticket_type;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.man = man;
        this.children = children;
    }

    public Order(int id, String name, String phone_number, String departure, String arrival, int ticket_type, String departure_date, String arrival_date, int man, int children) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.departure = departure;
        this.arrival = arrival;
        this.ticket_type = ticket_type;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.man = man;
        this.children = children;
    }
}
