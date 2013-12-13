pubnubmessage
=============

Java Message Objects for PubNub Message

Usage:
PubNubMessageWrapper pubNubMessageWrapper = new PubNubMessageWrapper();
PubNubMessage pubNubMessage = pubNubMessageWrapper.transformMessage(data);

Printing Channel Name an Average Price once object is constructed:
System.out.println(pubNubMessage.getChannelName() + " : " + pubNubMessage.getTicker().getAvg().getValue());

