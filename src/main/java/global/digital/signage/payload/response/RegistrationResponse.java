package global.digital.signage.payload.response;

import global.digital.signage.model.role.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RegistrationResponse {
    private  Long userId;
    private String username;
    private Role roles;
    private Long companyId;
}
