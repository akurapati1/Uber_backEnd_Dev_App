package UberBackendDevApp.CabBookingAppBackend.dto;

import UberBackendDevApp.CabBookingAppBackend.entities.enums.Role;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private Set<Role> roles;

}
