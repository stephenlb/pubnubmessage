# PubNub Java Message Objects

Java Objects for PubNub Messages changing JSON to Java Getter Methods.

##### Usage

```java
PubNubMessageWrapper pubNubMessageWrapper = new PubNubMessageWrapper();
PubNubMessage pubNubMessage = pubNubMessageWrapper.transformMessage(data);

Printing Channel Name an Average Price once object is constructed:
System.out.println(pubNubMessage.getChannelName() + " : " + pubNubMessage.getTicker().getAvg().getValue());
```
