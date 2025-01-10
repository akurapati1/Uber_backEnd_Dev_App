package UberBackendDevApp.CabBookingAppBackend.services.impls;

import UberBackendDevApp.CabBookingAppBackend.dto.DriverDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RideDto;
import UberBackendDevApp.CabBookingAppBackend.dto.RideRequestDto;
import UberBackendDevApp.CabBookingAppBackend.entities.RideRequest;
import UberBackendDevApp.CabBookingAppBackend.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private ModelMapper modelMapper;

    private static final Logger log = LoggerFactory.getLogger(RiderServiceImpl.class);

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        System.out.println("Dta received: "+ rideRequestDto);
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        log.info(rideRequest.toString());
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
