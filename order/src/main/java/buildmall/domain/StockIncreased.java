package buildmall.domain;

import buildmall.domain.*;
import buildmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long stockId;
    private Integer amount;
    private String productName;
}
