package org.lanit.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TickersItem {

    @JsonProperty("alerts")
    private List<Notification> alerts;

    @JsonProperty("ticker")
    private String ticker;

    public TickersItem() {
    }

    public TickersItem(List<Notification> alerts, String ticker) {
        this.alerts = alerts;
        this.ticker = ticker;
    }

    public void setAlerts(List<Notification> alerts) {
        this.alerts = alerts;
    }

    public List<Notification> getAlerts() {
        return alerts;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTicker() {
        return ticker;
    }
}
