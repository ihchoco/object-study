package com.mms.chapter01.object;

public class Bag {
    private Invitation invitation;
    private Long amount;

    private Ticket ticket;

    public Bag(Long amount){
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation(){
        return this.invitation != null;
    }

    public boolean hasTicket(){
        return this.ticket != null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void plusAmount(long amount){
        this.amount += amount;
    }

    public void minusAmount(long amount){
        this.amount -= amount;
    }
}
