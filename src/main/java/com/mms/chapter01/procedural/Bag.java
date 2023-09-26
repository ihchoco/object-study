package com.mms.chapter01.procedural;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount){
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount += amount;
    }
    public boolean hasinvitation(){
        return invitation != null;
    }
    public boolean hasTicket(){
        return ticket != null;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    public void minusAmount(Long amount){
        this.amount += amount;
    }

    public void plusAmount(Long amount){
        this.amount -= amount;
    }
}
