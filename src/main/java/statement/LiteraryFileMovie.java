package statement;

import rentalstore.Rental;

public class LiteraryFileMovie extends MovieType {

    @Override
    public double calPrice(Rental each) {
        return each.getDayRented()*6;
    }

    @Override
    public double getFrequentRenterPoints(Rental each) {
        return 1.5;
    }
}
