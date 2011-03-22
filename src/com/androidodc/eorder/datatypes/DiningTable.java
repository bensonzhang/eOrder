package com.androidodc.eorder.datatypes;

public class DiningTable {
    private int mId;
    private int mDiningTableId;
    private String mName;
    private int mMaxPeople;
    private boolean mIsFree;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getDiningTableId() {
        return mDiningTableId;
    }

    public void setDiningTableId(int diningTableId) {
        mDiningTableId = diningTableId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getMaxPeople() {
        return mMaxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        mMaxPeople = maxPeople;
    }

    public boolean isFree() {
        return mIsFree;
    }

    public void setFree(boolean isFree) {
        mIsFree = isFree;
    }
}
