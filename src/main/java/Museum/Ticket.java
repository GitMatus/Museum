package src.Museum;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {

    static double price;
    String type;
    LocalDate date;

    public Ticket(String type, double price, LocalDate date) {
        this.type = type;
        this.price = mapPrice(type);
        this.date = date;
    }

    public static double mapPrice(String type) {
        switch (type) {
            case "regular":
                price = 10.00d;
            case "child":
                price = 5.50d;
            case "disabled":
                price = 2.50d;

        } return price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
