package v0;

public class Rental
{
	private Movie	_movie;
	private int		_daysRented;

	public Rental(Movie movie, int daysRented)
	{
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented()
	{
		return _daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}


	private static int getFrequentRenterPoints(Rental each, int frequentRenterPoints) {
		frequentRenterPoints++;

		// add bonus for a two day new release rental
		if ((each.getMovie().getPriceCode() == Movie.Code.NEW_RELEASE) && each.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

}




