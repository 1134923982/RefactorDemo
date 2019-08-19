package statement;

import rentalstore.Rental;

abstract public class MovieType {
    abstract public double calPrice(Rental each);
    abstract public double getFrequentRenterPoints(Rental each);
}
