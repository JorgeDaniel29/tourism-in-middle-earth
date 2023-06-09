package com.unlam.paradigms.tp;

import java.util.List;
import java.util.ArrayList;

public class Attraction extends TourismOption {
	private String name;
	private Double price;
	private Double hours;
	private Integer places;
	private TourismOptionType type;
	private List<String> reservations = new ArrayList<String>();

	public Attraction(String name, Double price, Double hours, Integer places, TourismOptionType type) {
		this.name = name;
		this.price = price;
		this.hours = hours;
		this.places = places;
		this.type = type;
	}

	public Integer getPlaces() {
		return places;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public TourismOptionType getType() {
		return type;
	}

	@Override
	public Double getDuration() {
		return hours;
	}

	@Override
	public Double getBaseAmount() {
		return price;
	}

	@Override
	public Double getAmountToPay() {
		return price;
	}

	@Override
	public void reserve(String userName) {
		reservations.add(userName);
	}

	@Override
	public Boolean isValid(User user) {
		return getPlaces() > 0 && user.getAvailableHours() >= getDuration() && user.getBudget() >= getAmountToPay();
	}
	
   @Override
    public Boolean isOffer() {
        return false;
    }
}
