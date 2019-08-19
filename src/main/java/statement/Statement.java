package statement;

import rentalstore.Movie;
import rentalstore.Rental;

import java.util.List;

abstract public class Statement {
    public String buildStatement(Statement statement, List<Rental> rentals, String name) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = statement.getResultTitle(name);
        for (Rental each : rentals) {
            double thisAmount = 0;

            thisAmount = calculateThisAmount(each, thisAmount);

            //add frequent renter points
            frequentRenterPoints++;
            //add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }

            //show figures for this rental
            result = statement.getResultEachContent(result, each, thisAmount);
            totalAmount += thisAmount;
        }

        //add footer lines
        result = statement.getResultFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }

    private double calculateThisAmount(Rental each, double thisAmount) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDayRented() > 2) {
                    thisAmount += (each.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDayRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDayRented() > 3) {
                    thisAmount += (each.getDayRented() - 3) * 1.5;
                }
                break;
        }
        return thisAmount;
    }

    abstract public String getResultTitle(String name);
    abstract public String getResultEachContent(String result, Rental each, double thisAmount);
    abstract public String getResultFooter(double totalAmount, int frequentRenterPoints, String result);
}
