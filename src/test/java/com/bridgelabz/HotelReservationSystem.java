package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HotelReservationSystem {
	HotelReservation hotelReservation = new HotelReservation();
	@Test
	 public void CheckIfHotelAddedProperly() {
        Hotel hotel1 = new Hotel("Lakewood", 110, 90);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
        Hotel[] hotelList = {hotel1, hotel2, hotel3};
        List<Hotel> hotels = Arrays.asList(hotelList);
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        List<Hotel> result = hotelReservation.getHotelList();
        assertEquals(hotels, result);
	}
}
