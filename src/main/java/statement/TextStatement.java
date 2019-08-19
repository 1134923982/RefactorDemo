package statement;

import rentalstore.Rental;

public class TextStatement extends Statement{
    @Override
    public String getResultTitle(String name) {
        return "Rental Record for " + name + "\n";
    }

    @Override
    public String getResultEachContent(String result, Rental each, double thisAmount) {
        result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
        return result;
    }

    @Override
    public String getResultFooter(double totalAmount, int frequentRenterPoints, String result) {
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
