package goair.wsdl;

import goair.model.flight.Flight;
import goair.util.SearchParametersForFlights;

import java.util.List;

public class AdminServices {
	
	//When you login as admin you see following hyper links
	// 1. Search flight - when you get a searched flight you get option to edit / delete it.
	// 2. View all flights - when you view a flight you get option to edit / delete it.
	// 3. Add a flight
	
	// 4. Search customer - when you get a searched customer you get option to edit / delete it.
	// 5. View all customers - when you view a customer you get option to edit / delete it.
	// 6. Add a customer 
	
	// 7. Search employee - when you get a searched employee you get option to edit / delete it.
	// 8. View all employee - when you view a employee you get option to edit / delete it.
	// 9. Add a employee 
	
	// 10. View all the bookings.
	// 11. Search bookings(optional)
	
	// View flight page which will have flight details with availability.
	// View customer page which will have customer details with booking history and all.
	// View employee page which will have employee details with profile and what all the flights
			// he/she is serving with histories.
	

	/**
	 * Search flights - This method searches all the flights with a given criteria
	 * @return List<Flight> - Return array of strings. Each string contains pipe separated flight details.
	 *  
	 */
	public List<Flight> searchFlights(SearchParametersForFlights searchParameters)
	{
		return null;
	}
	
	/**
	 * Get all the flights in the system
	 * @return List<Flight> - Return list of all the flights
	 */
	public List<Flight> getFlights()
	{
		return null;
	}
	
	/**
	 * Add a new flight to the system
	 * @param flight
	 * @return int status of the operation this maps to the list of error codes defined 
	 * for the system.
	 */
	public int addFlight(Flight flight)
	{
		return -1;
	}
}
