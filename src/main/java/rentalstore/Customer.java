package rentalstore;

import statement.Statement;
import statement.TextStatement;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    public static final int TXT = 0;
    public static final int HTML = 1;
    private Statement statement;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        statement = new TextStatement();
    }

    public Customer(String name, Statement statement) {
        this.name = name;
        this.statement = statement;
    }


    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return statement.buildStatement(this.statement,this.rentals, getName());
    }
}
