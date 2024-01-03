package com.bridgelabz;

public class LotOwner extends LotActors{
    private boolean hasSpace;

    public void setHasSpace(boolean fullStatus){
        hasSpace = !fullStatus;
    }

    @Override
    public boolean updateFullStatus(boolean fullStatus) {
        setHasSpace(fullStatus);
        return fullStatus;
    }
}
