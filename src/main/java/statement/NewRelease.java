package statement;

import rentalstore.Rental;

public class NewRelease extends MovieType {

    @Override
    public double calPrice(Rental each) {
        return each.getDayRented() * 3;
    }

    @Override
    public double getFrequentRenterPoints(Rental each) {
        return each.getDayRented() > 1 ? 2 : 1;
    }
}
