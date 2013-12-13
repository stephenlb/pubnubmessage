package com.pubnub.message.wrapper;

import com.pubnub.message.PubNubItemDetail;
import com.pubnub.message.PubNubMessage;
import com.pubnub.message.PubNubTicker;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class PubNubMessageWrapper {

    public PubNubMessage transformMessage(JSONObject data) {
        PubNubMessage pubNubMessage = new PubNubMessage();
        try {
            pubNubMessage.setChannelName(data.getString("channel_name"));
            pubNubMessage.setChannel(data.getString("channel"));
            pubNubMessage.setOp(data.getString("op"));
            pubNubMessage.setOrigin(data.getString("origin"));
            pubNubMessage.setPrivateValue(data.getString("private"));

            PubNubTicker ticker = new PubNubTicker();

            JSONObject tickerJson = data.getJSONObject("ticker");
            JSONObject vwapJson = tickerJson.getJSONObject("vwap");
            JSONObject lastJson = tickerJson.getJSONObject("last");
            JSONObject lastOrigJson = tickerJson.getJSONObject("last_orig");
            JSONObject buyJson = tickerJson.getJSONObject("buy");
            JSONObject lastLocalJson = tickerJson.getJSONObject("last_local");
            JSONObject volJson = tickerJson.getJSONObject("vol");
            JSONObject sellJson = tickerJson.getJSONObject("sell");
            JSONObject lastAllJson = tickerJson.getJSONObject("last_all");
            JSONObject highJson = tickerJson.getJSONObject("high");
            JSONObject avgJson = tickerJson.getJSONObject("avg");
            JSONObject lowJson = tickerJson.getJSONObject("low");

            PubNubItemDetail vwap = transformDetails(vwapJson);
            PubNubItemDetail last = transformDetails(lastJson);
            PubNubItemDetail lastOrig = transformDetails(lastOrigJson);
            PubNubItemDetail buy = transformDetails(buyJson);
            PubNubItemDetail latLocal = transformDetails(lastLocalJson);
            PubNubItemDetail vol = transformDetails(volJson);
            PubNubItemDetail sell = transformDetails(sellJson);
            PubNubItemDetail lastAll = transformDetails(lastAllJson);
            PubNubItemDetail high = transformDetails(highJson);
            PubNubItemDetail avg = transformDetails(avgJson);
            PubNubItemDetail low = transformDetails(lowJson);
            ticker.setAvg(avg);
            ticker.setBuy(buy);
            ticker.setHigh(high);
            ticker.setItem(tickerJson.getString("item"));
            ticker.setLast(last);
            ticker.setLastAll(lastAll);
            ticker.setLastLocal(latLocal);
            ticker.setLastOrig(lastOrig);
            ticker.setLow(low);
            ticker.setNow(tickerJson.getLong("now"));
            ticker.setSell(sell);
            ticker.setVol(vol);
            ticker.setVwap(vwap);

            pubNubMessage.setTicker(ticker);

        } catch (Exception ex) {
            Logger.getLogger(PubNubMessageWrapper.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return pubNubMessage;
        }
    }

    private PubNubItemDetail transformDetails(JSONObject jsonObject) {
        PubNubItemDetail pubNubItemDetail = new PubNubItemDetail();
        try {

            pubNubItemDetail.setCurrency(jsonObject.getString("currency"));
            pubNubItemDetail.setValueInteger(jsonObject.getLong("value_int"));
            pubNubItemDetail.setValue(jsonObject.getDouble("value"));
            pubNubItemDetail.setDisplay(jsonObject.getString("display"));
            pubNubItemDetail.setDisplayShort(jsonObject.getString("display_short"));

        } catch (JSONException ex) {
            Logger.getLogger(PubNubMessageWrapper.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return pubNubItemDetail;
        }

    }

}
