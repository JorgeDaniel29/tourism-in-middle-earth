package com.unlam.paradigms.tp;

import java.util.List;

public class OfferAbsolute extends Offer {
	
	final Double amountToPay;

<<<<<<< HEAD
	public OfferAbsolute(String name, TourismOptionType type, List<TourismOption> attractions) {
		super(name, type, attractions);
	}

	@Override
	public Double getBaseAmount() {
		// TODO Auto-generated method stub
		return null;
=======
	public OfferAbsolute(String name, TourismOptionType type, List<TourismOption> options, final String parameter) {
		super(name, type, options);
		this.amountToPay = Double.valueOf(parameter);
>>>>>>> master
	}

	@Override
	public Double getAmountToPay() {
<<<<<<< HEAD
		double totalPrice = 0;
		
		for (TourismOption attraction : super.getAttractions()) {
			totalPrice += attraction.getBaseAmount();
		}	
		
		if(totalPrice >= 200 && totalPrice <= 500) {
			totalPrice -= 100;
		} else if(totalPrice > 500 && totalPrice <= 750) {
			totalPrice -= 200;
		} else if(totalPrice > 750){
			totalPrice -= 300;
		}
		
		return totalPrice;
=======
		return amountToPay;
>>>>>>> master
	}

}
