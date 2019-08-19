package rentalstore;

import org.junit.Assert;
import org.junit.Test;
import statement.HtmlStatement;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_2_Amount_owed_is_2_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_0_call_statement(){
        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.REGULAR);
        Rental rental = new Rental(movie, 1);

        //when
        jayden.addRental(rental);
        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_2_Amount_owed_is_2_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_0_dayRented_is_2_call_statement(){
        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);

        //when
        jayden.addRental(rental);
        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_2_Amount_owed_is_2_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_0_dayRented_is_3_call_statement(){
        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);

        //when
        jayden.addRental(rental);
        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_1_5_Amount_owed_is_1_5_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_2_call_statement(){

        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 1);

        //when
        jayden.addRental(rental);

        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_1_5_Amount_owed_is_1_5_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_2_dayRented_is_3_call_statement(){

        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 3);

        //when
        jayden.addRental(rental);

        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_1_5_Amount_owed_is_1_5_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_2_dayRented_is_4_call_statement(){

        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);

        //when
        jayden.addRental(rental);

        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_3_Amount_owed_is_3_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_1_call_statement(){
        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 1);

        //when
        jayden.addRental(rental);

        //then
        String statement = jayden.statement();
        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_3_Amount_owed_is_3_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_1_and_day_is_2_call_statement(){

        //given
        Customer jayden = new Customer("jayden");
        Movie movie = new Movie("helloworld", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);

        //when
        jayden.addRental(rental);

        //then
        String statement = jayden.statement();

        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_3_Amount_owed_is_3_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_1_and_rental_priceCode_is_0_and_day_is_2_call_statement(){
        //given
        Customer jayden = new Customer("jayden");
        Movie helloMovie = new Movie("helloworld", Movie.NEW_RELEASE);
        Movie javaMovie = new Movie("java", 1);
        Rental rental1 = new Rental(helloMovie, 2);
        Rental rental2 = new Rental(javaMovie, 1);

        //when
        jayden.addRental(rental1);
        jayden.addRental(rental2);

        //then
        String statement = jayden.statement();


        Assert.assertEquals("Rental Record for jayden\n" +
                "\thelloworld\t6.0\n" +
                "\tjava\t3.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 3 frequent renter points", statement);
    }

    @Test
    public void should_return_Rental_Record_for_jayden_helloworld_2_Amount_owed_is_2_You_earned_1_frequent_renter_points_when_add_rental_priceCode_is_0_call_statement_and_statement_is_html(){
        //given
        Customer jayden = new Customer("jayden", new HtmlStatement());
        Movie movie = new Movie("helloworld", Movie.REGULAR);
        Rental rental = new Rental(movie, 1);

        //when
        jayden.addRental(rental);
        //then
        String statement = jayden.statement();
        Assert.assertEquals("<H1>Rentals for <EM>jayden</EM></H1><P>\n" +
                "helloworld: 2.0<BR>\n" +
                "<P>You owe<EM>2.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points</P>", statement);
    }


}