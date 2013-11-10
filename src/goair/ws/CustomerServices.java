package goair.wsdl;

import java.util.List;

import goair.booking.BookingBean;
import goair.customer.Customer;
import goair.flight.Flight;
import goair.payment.PaymentBean;

public class CustomerServices extends AirlineServices{
	
	public CustomerServices() {}
	
	/**
	 * Search flights - This method searches all the flights with a given criteria
	 * @return String[] - Return array of strings. Each string contains pipe separated flight details.
	 *  
	 */
	public List<Flight> searchFlights()
	{
		return null;
	}
	
	public int customerLogin(String userName,String Password){
		return 0;
	}
	
	public int customerSignUp(Customer customerBean){
		return 0;
	}
	
	public int editProfile(Customer customerBean){
		return 0;
	}
	
	public List<BookingBean> viewBookingDetails(long reservationId){
		return null;
	}
	
	public int makePayment(PaymentBean paymentBean){
		return 0;
	}
	
	
	
	
	
	
	
	
}
