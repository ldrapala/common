package byt.money.common.model;

import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author Lukasz
 */
public class Model {
    
    private final String category;
    private final String name;
    private final int amount;
    private final LocalDate date;
    private final String details;

    public Model(String category, String name, int amount, LocalDate date, String details) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.details = details;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public String getName() {
        return name;
    }
    
}
