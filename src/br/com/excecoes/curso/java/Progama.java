package br.com.excecoes.curso.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Progama {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room Numer:");
		int number = sc.nextInt();
		System.out.print("Check-in Date (dd/MM/yyyy) : ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out Date (dd/MM/yyyy) : ");
		Date checkout = sdf.parse(sc.next());

		if (!checkout.after(checkin)) {
			System.out.println("Err in reservation: check-out must be after check-in date ");
		} else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation : " + reservation);

			System.out.println();
			System.out.println("Enter date  Update Reservation: ");

			number = sc.nextInt();
			System.out.print("Check-in Date (dd/MM/yyyy) : ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out Date (dd/MM/yyyy) : ");
			checkout = sdf.parse(sc.next());

		

				String error= reservation.UpdateDates(checkin, checkout);
				if(error != null) {
					System.out.println("Error : in  reservation"+error);
				}else {
					System.out.println("Reservation :" + reservation);
				}
				
			}
			
			
		}

		

}


