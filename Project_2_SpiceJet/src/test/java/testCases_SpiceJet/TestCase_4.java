package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;

public class TestCase_4 extends Launch_Quit
{
	//test the search functionality for one way flight
	@Test
	public void one_way_flight() throws InterruptedException
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		//h1.date_dropdown(); (Not require since after selecting destination automatically it gets open)
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
	}

}
