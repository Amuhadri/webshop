package hr.intellexi.vjezba.webshop.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    private long id;
    private long orderId;
    private long productId;
    private Integer quantity;
}
