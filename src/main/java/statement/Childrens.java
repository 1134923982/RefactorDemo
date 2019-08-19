package statement;

import rentalstore.Rental;

public class Childrens extends MovieType {

    @Override
    public double calPrice(Rental each) {
        double amount = 1.5;
        if (each.getDayRented() > 3) {
            amount += (each.getDayRented() - 3) * 1.5;
        }
        return amount;
    }

    @Override
    public double getFrequentRenterPoints(Rental each) {
        return 1;
    }
}
