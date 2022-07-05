public class Ticket {
	private String TicketNo;
	public String getTicketNo() {
		return TicketNo;
	}
	public void setTicketNo(String theTicketNo) {
		TicketNo = theTicketNo;
	}
	private String StartingLocation;
	public String getStartingLocation() {
		return StartingLocation;
	}
	public void setStartingLocation(String theStartingLocation) {
		StartingLocation = theStartingLocation;
	}
	private String DestinationLocation;

	public String getDestinationLocation() {
		return DestinationLocation;
	}
	public void setDestinationLocation(String theDestinationLocation) {
		DestinationLocation = theDestinationLocation;
	}
	private String PassengerNo;
	public String getPassengerNo() {
		return PassengerNo;
	}
              public void setPassengerNo(String thePassengerNo) {
		PassengerNo = thePassengerNo;
	}
 	private Passenger passenger;
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger thePassenger) {
		passenger = thePassenger;
	}
	public void PaymentAmount() {
	}
	public void CancelTicket() {
	}
}

