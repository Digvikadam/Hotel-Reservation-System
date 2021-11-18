package com.bridgelabz;

public class Hotel {
	private String nameOfHotel;
    private int regularWeekdayRate;
    private int regularWeekendRate;

    public Hotel(String nameOfHotel, int regularWeekdayRate, int regularWeekendRate) {
        this.nameOfHotel = nameOfHotel;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
    }
    public String getNameOfHotel() {
        return nameOfHotel;
    }
    
    public void setNameOfHotel(String nameOfHotel) {
        this.nameOfHotel = nameOfHotel;
    }

    public int getRegularWeekdayRate() {
        return regularWeekdayRate;
    }

    public void setRegularWeekdayRate(int regularWeekdayRate) {
        this.regularWeekdayRate = regularWeekdayRate;
    }

    public int getRegularWeekendRate() {
        return regularWeekendRate;
    }

    public void setRegularWeekendRate(int regularWeekendRate) {
        this.regularWeekendRate = regularWeekendRate;
    }
}
