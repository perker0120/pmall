package buildmall.domain;

import buildmall.domain.*;
import buildmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private String productName;
    private Long productId;
    private Long userId;
    private Integer amount;
    private String status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
