package statement;

import rentalstore.Rental;

public class HtmlStatement extends Statement{
    @Override
    public String getResultTitle(String name) {
        return "<H1>Rentals for <EM>"+name+"</EM></H1><P>\n";
    }

    @Override
    public String getResultEachContent(String result, Rental each, double thisAmount) {
        result += each.getMovie().getTitle() +": "+String.valueOf(thisAmount)+"<BR>\n";
        return result;
    }

    @Override
    public String getResultFooter(double totalAmount, int frequentRenterPoints, String result) {
        result+="<P>You owe<EM>"+String.valueOf(totalAmount)+"</EM><P>\n" +
                "On this rental you earned <EM>"+String.valueOf(frequentRenterPoints)+"</EM>" +
                " frequent renter points</P>";
        return result;
    }
}
