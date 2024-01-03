package com.bridgelabz;

public class AirportSecurity implements LotActors{
    @Override
    public boolean getFullStatus(boolean fullStatus) {
        System.out.println(fullStatus == true ? "Full" : "Not full");
        return fullStatus;
    }
}