package UberBackendDevApp.CabBookingAppBackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
@Data
@NoArgsConstructor
public class PointDto {

    private double[] coordinates;
    private String type = "Point";

    public PointDto(double[] coordinates) {
        this.coordinates = coordinates;
    }
}