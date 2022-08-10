package fouriting.flockproject.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class MemberLogInDto {
    private String loginId;
    private String passwd;
}
