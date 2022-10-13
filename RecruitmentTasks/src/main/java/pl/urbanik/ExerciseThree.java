package pl.urbanik;

/**
 * Write a SQL query that:
 * I. Selects countries where a total number of inhabitants (population) in all the cities is greater than 400.
 * II. Selects names of countries that have no buildings at all.
 */

public class ExerciseThree {

    private static final String FIRST_QUERY = "select * from Country co where 400 < all " +
            "(select ci.Population from City ci where ci.CountryID = co.CountryID)";

    private static final String SECOND_QUERY = "select name from Country co where 0 = " +
            "(select COUNT(1) from City ci JOIN Building b ON B.CityID = CI.CityID WHERE ci.CountryID = co.CountryID)";
}
