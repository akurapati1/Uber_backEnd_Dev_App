package UberBackendDevApp.CabBookingAppBackend.controllers;


import UberBackendDevApp.CabBookingAppBackend.dto.SignupDto;
import UberBackendDevApp.CabBookingAppBackend.dto.UserDto;
import UberBackendDevApp.CabBookingAppBackend.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto signUp(@RequestBody SignupDto signupDto) {
        return authService.signup(signupDto);
    }

}
