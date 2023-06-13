package com.unlam.paradigms.tp;

import java.util.ArrayList;
import java.util.List;

public class OfferAB extends Offer {

<<<<<<< HEAD
	public OfferAB(String name, TourismOptionType type, List<TourismOption> attractions) {
		super(name, type, attractions);
	}

	@Override
	public Double getBaseAmount() {
		// TODO Auto-generated method stub
		return null;
=======
	private List<String> freeOptions = new ArrayList<>();

	public OfferAB(String name, TourismOptionType type, List<TourismOption> options, final String parameter) {
		super(name, type, options);
		this.freeOptions = List.of(parameter.split("\\|"));
>>>>>>> master
	}
	
	private Double getLastBaseAmount() {
		return super.getAttractions().get(super.getAttractions().size() - 1).getBaseAmount();
	}

	@Override
	public Double getAmountToPay() {
<<<<<<< HEAD
		double totalPrice = 0;
		
		for (TourismOption attraction : super.getAttractions()) {
			totalPrice += attraction.getBaseAmount();
		}
		
		return totalPrice - getLastBaseAmount();
=======
		double amountToPay = 0;

		for (TourismOption option : options) {
			if (!freeOptions.contains(option.getName())) {
				amountToPay += option.getAmountToPay();
			}
		}
		return amountToPay;
>>>>>>> master
	}

}
