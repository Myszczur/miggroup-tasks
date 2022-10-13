package pl.urbanik;

/**
 * Write a SQL query that:
 * I. Selects countries where a total number of inhabitants (population) in all the cities is greater than 400.
 * II. Selects names of countries that have no buildings at all.
 */

public class ExerciseThree {

    private static final String FIRST_QUERY = "SELECT * FROM Country co WHERE 400 < ALL " +
            "(SELECT ci.Population FROM City ci WHERE ci.CountryID = co.CountryID)";

    private static final String SECOND_QUERY = "Select Country.Name from Country Where Country.CountryID NOT IN" +
            "(Select DISTINCT Country.Name from Country AS P Join City AS M on (P.CountryID = M.CountryID)" +
            "join Buildings AS B on (M.CityID = B.CityID))";
}
