package com.unlam.paradigms.tp;

public class Ticket {
    private User user;
    private TourismOption tourOption;
    
    public Ticket(User user, TourismOption tourOption) {
        this.user = user;
        this.tourOption = tourOption;
    }
    
    public User getUser() {
        return user;
    }
    
    public TourismOption getOffer() {
        return tourOption;
    }
    
    public void printDetail() {
        System.out.println("Usuario: "+user.getUserName());
        System.out.println("Compro: "+tourOption.getName());
        System.out.println("Al precio de: "+tourOption.getAmountToPay());
        System.out.println("Debera tener disponible: "+tourOption.getDuration()+" horas.");
    }
}
