package hr.intellexi.vjezba.webshop.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;

}
