
package com.pubnub.message;


public class PubNubTicker {

    PubNubItemDetail vwap;
    PubNubItemDetail last;
    PubNubItemDetail lastOrig;
    PubNubItemDetail buy;
    PubNubItemDetail lastLocal;
    PubNubItemDetail vol;
    PubNubItemDetail sell;
    PubNubItemDetail lastAll;
    PubNubItemDetail high;
    PubNubItemDetail avg;
    PubNubItemDetail low;
    long now;
    String item;

    public PubNubItemDetail getVwap() {
        return vwap;
    }

    public void setVwap(PubNubItemDetail vwap) {
        this.vwap = vwap;
    }

    public PubNubItemDetail getLast() {
        return last;
    }

    public void setLast(PubNubItemDetail last) {
        this.last = last;
    }

    public PubNubItemDetail getLastOrig() {
        return lastOrig;
    }

    public void setLastOrig(PubNubItemDetail lastOrig) {
        this.lastOrig = lastOrig;
    }

    public PubNubItemDetail getBuy() {
        return buy;
    }

    public void setBuy(PubNubItemDetail buy) {
        this.buy = buy;
    }

    public PubNubItemDetail getLastLocal() {
        return lastLocal;
    }

    public void setLastLocal(PubNubItemDetail lastLocal) {
        this.lastLocal = lastLocal;
    }

    public PubNubItemDetail getVol() {
        return vol;
    }

    public void setVol(PubNubItemDetail vol) {
        this.vol = vol;
    }

    public PubNubItemDetail getSell() {
        return sell;
    }

    public void setSell(PubNubItemDetail sell) {
        this.sell = sell;
    }

    public PubNubItemDetail getLastAll() {
        return lastAll;
    }

    public void setLastAll(PubNubItemDetail lastAll) {
        this.lastAll = lastAll;
    }

    public PubNubItemDetail getHigh() {
        return high;
    }

    public void setHigh(PubNubItemDetail high) {
        this.high = high;
    }

    public PubNubItemDetail getAvg() {
        return avg;
    }

    public void setAvg(PubNubItemDetail avg) {
        this.avg = avg;
    }

    public PubNubItemDetail getLow() {
        return low;
    }

    public void setLow(PubNubItemDetail low) {
        this.low = low;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


    
    
    
    
}
