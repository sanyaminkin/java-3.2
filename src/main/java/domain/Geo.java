package domain;

public class Geo {
    private String type;
    private String coordinatesInfo;
    private Place place;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinatesInfo() {
        return coordinatesInfo;
    }

    public void setCoordinatesInfo(String coordinatesInfo) {
        this.coordinatesInfo = coordinatesInfo;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
