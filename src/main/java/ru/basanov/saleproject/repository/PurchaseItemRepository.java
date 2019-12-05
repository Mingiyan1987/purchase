package ru.basanov.saleproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.saleproject.domain.PurchaseItem;

@Repository
public interface PurchaseItemRepository extends PagingAndSortingRepository<PurchaseItem, Long> {
}
