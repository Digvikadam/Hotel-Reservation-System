package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
public class HotelReservation {
	private List<Hotel> hotels = new ArrayList<Hotel>();

	    public static void main(String[] args) {
	        System.out.println("Welcome to Hotel Reservation Program");
	    }
	    /* method to add the hotel
	     * @return
	     */
	    public void add(Hotel hotel) {
	        this.hotels.add(hotel);
	    }

	    public List<Hotel> getHotelList() {
	        return this.hotels;
	    }
}
