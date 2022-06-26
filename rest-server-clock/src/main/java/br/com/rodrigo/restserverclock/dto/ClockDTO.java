package br.com.rodrigo.restserverclock.dto;

public class ClockDTO {

    private String currentDateTime;

    public ClockDTO() {
    }

    public ClockDTO(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }
}
