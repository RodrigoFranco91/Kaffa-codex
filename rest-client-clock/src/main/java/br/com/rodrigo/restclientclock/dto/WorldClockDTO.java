package br.com.rodrigo.restclientclock.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class WorldClockDTO {

    @JsonProperty("$id")
    private Long id;
    private String currentDateTime;
    private String utcOffset;
    private Boolean isDayLightSavingsTime;
    private String dayOfTheWeek;
    private String timeZoneName;
    private String currentFileTime;
    private String ordinalDate;
    private String serviceResponse;

    public WorldClockDTO(Long id, String currentDateTime, String utcOffset, Boolean isDayLightSavingsTime, String dayOfTheWeek, String timeZoneName, String currentFileTime, String ordinalDate, String serviceResponse) {
        this.id = id;
        this.currentDateTime = currentDateTime;
        this.utcOffset = utcOffset;
        this.isDayLightSavingsTime = isDayLightSavingsTime;
        this.dayOfTheWeek = dayOfTheWeek;
        this.timeZoneName = timeZoneName;
        this.currentFileTime = currentFileTime;
        this.ordinalDate = ordinalDate;
        this.serviceResponse = serviceResponse;
    }

    public Long getId() {
        return id;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public Boolean getDayLightSavingsTime() {
        return isDayLightSavingsTime;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public String getCurrentFileTime() {
        return currentFileTime;
    }

    public String getOrdinalDate() {
        return ordinalDate;
    }

    public String getServiceResponse() {
        return serviceResponse;
    }

    @Override
    public String toString() {
        return  "id=" + id + "\n" +
                "currentDateTime=" + currentDateTime + "\n" +
                "utcOffset=" + utcOffset + "\n" +
                "isDayLightSavingsTime=" + isDayLightSavingsTime + "\n" +
                "dayOfTheWeek=" + dayOfTheWeek + "\n" +
                "timeZoneName=" + timeZoneName + "\n" +
                "currentFileTime=" + currentFileTime + "\n" +
                "ordinalDate=" + ordinalDate + "\n" +
                "serviceResponse=" + serviceResponse + "\n";
    }
}
