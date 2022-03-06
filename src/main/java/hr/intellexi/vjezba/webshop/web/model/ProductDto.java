package hr.intellexi.vjezba.webshop.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    private long id;
    private String code;
    private String name;
    private BigDecimal priceHrk;
    private String description;
    private Boolean isAvailable;

}
