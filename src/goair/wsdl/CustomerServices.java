package goair.wsdl;

import java.util.List;

import goair.Exception.AirlineException;
import goair.model.booking.Booking;
import goair.model.customer.Customer;
import goair.model.flight.Flight;
import goair.model.payment.PaymentBean;

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
        
        public int customerLogin(String userName,String Password) throws AirlineException{
                return 0;
        }
        
        public int customerRegistration(Customer customerBean){
                return 0;
        }
        
        public int editProfile(Customer customerBean){
                return 0;
        }
        
        public List<Booking> viewBookingDetails(long reservationId){
                return null;
        }
        
        public int makePayment(PaymentBean paymentBean){
                return 0;
        }
        
        public List<Booking> viewBookingHistory(long customerId){
                return null;
        }
        
}