package com.test.calcEngine;

public class Flight
{
    private int passengers,seats;

    public Flight()
    {
        seats = 150;
        passengers = 0;
    }
    void add1Passengers()
    {
        if(passengers < seats)
        {
            passengers += 1;
        }
        else
        {
            handleTooMany();
        }
    }
    private void handleTooMany()
    {
        System.out.println("Too Many");
    }
    public boolean hasRoom(Flight f2)
    {
        int total = this.passengers = f2.passengers;
        return total <= seats;
    }
    public Flight createNewWithBoth(Flight f2)
    {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }

    public int getPassengers() {
        return passengers;
    }
    public int getSeats(){
        return seats;
    }
}
class Airport
{

    public static void main(String[] args)
    {
      Flight lax1 = new Flight();
      Flight lax2 = new Flight();

      Flight lax3 = null;
      if(lax1.hasRoom(lax2))
          lax3 = lax1.createNewWithBoth(lax2);

      System.out.println(lax3.getPassengers());
      System.out.println(lax3.getSeats());
    }

}