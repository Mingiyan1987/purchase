package ru.basanov.saleproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.saleproject.domain.Purchase;
import ru.basanov.saleproject.domain.User;

import java.util.List;

@Repository
public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {
    Purchase findPurchaseById(Long id);

    List<Purchase> findAllByUser(User user);

}
