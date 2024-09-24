package org.lanit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {

            @JsonProperty("timeframe")
        private int timeframe;

        @JsonProperty("percent")
        private int percent;

        public Notification() {
        }

        public Notification(int timeframe, int percent) {
            this.timeframe = timeframe;
            this.percent = percent;
        }

        public void setTimeframe(int timeframe) {
            this.timeframe = timeframe;
        }

        public int getTimeframe() {
            return timeframe;
        }

        public void setPercent(int percent) {
            this.percent = percent;
        }

        public int getPercent() {
            return percent;
        }
    }