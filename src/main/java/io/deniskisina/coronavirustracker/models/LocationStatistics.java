package io.deniskisina.coronavirustracker.models;

public class LocationStatistics {

    private String state;
    private String country;
    private int latestTotalReport;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalReport() {
        return latestTotalReport;
    }

    public void setLatestTotalReport(int latestTotalReport) {
        this.latestTotalReport = latestTotalReport;
    }

    @Override
    public String toString() {
        return "LocationStatistics{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalReport=" + latestTotalReport +
                '}';
    }
}
