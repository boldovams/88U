package org.lanit.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;


@Component
public class Add {
    private String name;
    private int timeFrame;
    private int percent;

    public Add() {
        // Конструктор по умолчанию
    }

    public Add(String name, int timeFrame, int percent) {
        this.name = name;
        this.timeFrame = timeFrame;
        this.percent = percent;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("timeFrame")
    public int getTimeFrame() {
        return timeFrame;
    }

    @JsonProperty("timeFrame")
    public void setTimeFrame(int timeFrame) {
        this.timeFrame = timeFrame;
    }

    @JsonProperty("percent")
    public int getPercent() {
        return percent;
    }

    @JsonProperty("percent")
    public void setPercent(int percent) {
        this.percent = percent;
    }
}
