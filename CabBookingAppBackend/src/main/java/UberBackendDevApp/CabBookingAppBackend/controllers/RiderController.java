package UberBackendDevApp.CabBookingAppBackend.controllers;

import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.services.RiderService;
import UberBackendDevApp.CabBookingAppBackend.services.impls.RiderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
public class RiderController {

    private final RiderService riderService;

    public RiderController(RiderServiceImpl riderService) {
        this.riderService = riderService;
    }

    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDto> requestRide(@RequestBody RideRequestDto rideRequestDto) {
        return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
    }

}
