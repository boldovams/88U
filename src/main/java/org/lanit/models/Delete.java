package org.lanit.models;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Delete{

    @JsonProperty("tickerName")
    public String tickerName;

    @JsonProperty("alertIndex")
    public int alertIndex;

    public void setTickerName(String tickerName){
        this.tickerName = tickerName;
    }

    public String getTickerName(){
        return tickerName;
    }

    public void setAlertIndex(int alertIndex){
        this.alertIndex = alertIndex;
    }

    public int getAlertIndex(){
        return alertIndex;
    }
}

