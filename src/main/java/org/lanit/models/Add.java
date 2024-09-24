package org.lanit.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Add {
    @JsonProperty("name")
    public String name;

    @JsonProperty("timeFrame")
    public int timeFrame;

    @JsonProperty("percent")
    public int percent;

    public Add() {
    }

    public Add(String name, int timeFrame, int percent) {
        this.name = name;
        this.timeFrame = timeFrame;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(int timeFrame) {
        this.timeFrame = timeFrame;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
