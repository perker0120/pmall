package buildmall.infra;

import buildmall.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "productSearches",
    path = "productSearches"
)
public interface ProductSearchRepository
    extends PagingAndSortingRepository<ProductSearch, Long> {}
