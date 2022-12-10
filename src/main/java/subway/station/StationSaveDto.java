package subway.station;

public class StationSaveDto {
    private final String stationName;

    public StationSaveDto(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }
}
