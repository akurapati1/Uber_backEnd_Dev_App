package UberBackendDevApp.CabBookingAppBackend.services.impls;

import UberBackendDevApp.CabBookingAppBackend.dto.DriverDto;
import UberBackendDevApp.CabBookingAppBackend.dto.SignupDto;
import UberBackendDevApp.CabBookingAppBackend.dto.UserDto;
import UberBackendDevApp.CabBookingAppBackend.entities.User;
import UberBackendDevApp.CabBookingAppBackend.entities.enums.Role;
import UberBackendDevApp.CabBookingAppBackend.exceptions.RuntimeConflictException;
import UberBackendDevApp.CabBookingAppBackend.repositories.UserRepo;
import UberBackendDevApp.CabBookingAppBackend.services.AuthService;
import UberBackendDevApp.CabBookingAppBackend.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepo userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null)
            throw new RuntimeConflictException("Cannot signup, User already exists with email "+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

//        create user related entities
        riderService.createNewRider(savedUser);
//        TODO add wallet related service here

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
