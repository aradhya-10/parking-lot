package com.bridgelabz;

public class AirportSecurity extends LotActors{
    @Override
    public boolean getFullStatus(boolean fullStatus) {
        System.out.println(fullStatus ? "Full" : "Not full");
        return fullStatus;
    }
}