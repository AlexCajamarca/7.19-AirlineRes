/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airlineres;

import java.util.Scanner;

/**
 *
 * @author alexc
 */
public class AirlinePro {
    boolean[] flightSeats = new boolean[11];
Scanner input = new Scanner(System.in);

public void start()
{
while ( true )
{
bookSeat();
}
}

public void bookSeat()
{

System.out.println("Choose Your preference : type '1' for First Class or '2' for Economy Class:");
int pessangerClass = input.nextInt();
if ( pessangerClass == 1 )
{
firstClassBooking();
}
else
{
economyClassBooking();
}
}

public void firstClassBooking()
{
for ( int cnt = 1; cnt <= 5; cnt++ )
{

if ( flightSeats[cnt] == false )
{
//book seat
flightSeats[cnt] = true;
System.out.printf("First Class Seat Booking: Seat# %d\n", cnt);
break;
}
else if ( flightSeats[5] == true )
{
if ( flightSeats[10] == true)
{

System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
}
else
{

System.out.println("Sorry,First Class bookings are over. Would you like to opt for Economy class ? select '1' for Yes and '2' for No");
int selection = input.nextInt();
if ( selection == 1 )
{
economyClassBooking();
start();
}
else
{
System.out.println("Next flight is scheduled in '3' hours.");
System.exit(0);
}
}
}
}
}


public void economyClassBooking() 
{
for ( int cnt = 6; cnt <= 10; cnt++ )
{
if ( flightSeats[cnt] == false )
{
flightSeats[cnt] = true;
System.out.printf("economy class seat booking :# %d\n", cnt);
break;
}
else if ( flightSeats[10] == true )
{
if ( flightSeats[5] == true)
{
System.out.println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours.");
System.exit(0);
}
else
{
System.out.println("Sorry, Economy Class seat bookings are over. Would you like to opt for first Class seat? press '1' for Yes and '2' for No");
int selection = input.nextInt();
if ( selection == 1 )
{
firstClassBooking();
start();
}
else
{
System.out.println("Next flight is scheduled in 3 hours");
System.exit(0);
}
}
}
}
}

}
