package statement;

import rentalstore.Rental;

public class Regular extends MovieType {

    @Override
    public double calPrice(Rental each) {
        double mount = 2;
        if (each.getDayRented() > 2) {
            mount += (each.getDayRented() - 2) * 1.5;
        }
        return mount;
    }

    @Override
    public double getFrequentRenterPoints(Rental each) {
        return 1;
    }
}
