package goair.wsdl;

public class CustomerServices {
	
	public CustomerServices() {}
	
	/**
	 * Search flights - This method searches all the flights with a given criteria
	 * @return String[] - Return array of strings. Each string contains pipe separated flight details.
	 *  
	 */
	public String[] searchFlights()
	{
		return null;
	}
	
	
	/**
	 * Create Reservation - This method creates a new airline reservation
	 * @return int - 1 for success, 0 for failure
	 *  
	 */
	public int createReservation()
	{
		return 1;
	}

	
	/**
	 * Delete Reservation - This method deletes an existing reservation
	 * @return int - Returns 1 for success, 0 for failure
	 *  
	 */
	public int cancelReservation()
	{
		return 1;
	}
	
	

}
