package com.pubnub.message;




public class PubNubMessage {

    String channelName;
    PubNubTicker ticker;
    String op;
    String origin;
    String channel;
    String privateValue;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public PubNubTicker getTicker() {
        return ticker;
    }

    public void setTicker(PubNubTicker ticker) {
        this.ticker = ticker;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPrivateValue() {
        return privateValue;
    }

    public void setPrivateValue(String privateValue) {
        this.privateValue = privateValue;
    }


    
}
