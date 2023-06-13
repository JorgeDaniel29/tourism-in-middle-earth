package com.unlam.paradigms.tp;

import java.util.List;

public class OfferPercentage extends Offer {
	
	private Integer discount;

<<<<<<< HEAD
	public OfferPercentage(String name, TourismOptionType type, List<TourismOption> attractions) {
		super(name, type, attractions);
	}

	@Override
	public Double getBaseAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getAmountToPay() {		
		double totalPrice = 0;
		
		for (TourismOption attraction : super.getAttractions()) {
			totalPrice += attraction.getBaseAmount();
		}
		
		return totalPrice * 0.8;
=======
	public OfferPercentage(final String name, final TourismOptionType type, final List<TourismOption> options, final String parameter) {
		super(name, type, options);
		this.discount = Integer.valueOf(parameter);
	}

	@Override
	public Double getAmountToPay() {
		double amountToPay = 0;
		
		for (TourismOption option : options) {
			amountToPay += option.getAmountToPay();
		}
		return (amountToPay * discount) / 100;
>>>>>>> master
	}

}
