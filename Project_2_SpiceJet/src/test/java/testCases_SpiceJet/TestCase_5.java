package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;

public class TestCase_5 extends Launch_Quit
{
	//Search for round trip
	@Test
	public void Round_Trip()
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.round_trip_radio_button();
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		//h1.date_dropdown();
		h1.date_select();
		h1.date_forward_button();
		h1.return_date();
		h1.flight_search_button();
	}

}
