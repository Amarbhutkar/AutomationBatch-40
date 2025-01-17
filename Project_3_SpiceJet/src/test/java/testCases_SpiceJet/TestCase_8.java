package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Boooking_Page;
import source_SpiceJet.Homepage_SpiceJet;
import source_SpiceJet.Search_Page;

public class TestCase_8 extends Launch_Quit
{
	/* Verify that the user is presented with additional options like luggage
	extra legroom, foods/beverages, etc and selecting the same results in additional cost with the booking amount */
	@Test
	public void additional_Details() throws InterruptedException
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_select();
		h1.flight_search_button();
		
		Search_Page s1=new Search_Page(driver);
		s1.search_continue_button();
		
		Boooking_Page b1=new Boooking_Page(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		//b1.county_selection();
		//b1.county_selection_dd(driver);
		b1.town_name();
		Thread.sleep(2000);
		b1.passenger_info_checkbox();
		b1.payment_page_continue_button();
		b1.first_add_button();
		b1.seat_selection();
		b1.select_meals_option();
		
	}

}
