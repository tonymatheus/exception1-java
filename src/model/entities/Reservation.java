package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//Solução muito  Ruim  de  Tratamento de Exceções
public class Reservation {

	private int roomnumber;
	private Date checkin;
	private Date checkout;

	
	private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(int roonumber, Date checkin, Date checkout) {

		this.roomnumber = roonumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getRoonumber() {
		return roomnumber;
	}

	public void setRoonumber(int roonumber) {
		this.roomnumber = roonumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		
	}
	public  void UpdateDates(Date checkin, Date checkout) {
		this.checkin= checkin;
		this.checkout=checkout;
	}
	@Override
	public String toString() {
		return "Room"
			+roomnumber
			+",  Checkin: "
			+ sdf.format(checkin)
			+"  Checkout "
			+sdf.format(checkout)
			+","
			+ duration()
			+" Nights";
		
	}

}
