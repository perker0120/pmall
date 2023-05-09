package buildmall.domain;

import buildmall.domain.*;
import buildmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long deliveryId;
    private Long orderId;
    private Long productId;
    private String productName;
    private Integer amount;
    private String status;
}
