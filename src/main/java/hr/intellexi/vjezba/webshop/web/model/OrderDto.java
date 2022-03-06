package hr.intellexi.vjezba.webshop.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private long id;
    private long customerId;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private BigDecimal totalPriceHrk;
    private BigDecimal totalPriceEur;


}
