package UberBackendDevApp.CabBookingAppBackend.services.impls;

import UberBackendDevApp.CabBookingAppBackend.dto.DriverDto;
import UberBackendDevApp.CabBookingAppBackend.dto.SignupDto;
import UberBackendDevApp.CabBookingAppBackend.dto.UserDto;
import UberBackendDevApp.CabBookingAppBackend.services.AuthService;

public class AuthServiceImpl implements AuthService {


    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
