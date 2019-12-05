package ru.basanov.saleproject.service;

import org.springframework.data.domain.Page;
import ru.basanov.saleproject.domain.Purchase;
import ru.basanov.saleproject.domain.User;

import java.util.List;

public interface PurchaseService {
    Purchase findPurchaseById(Long id);

    Purchase buildPurchase(String name, String userId);

    Page<Purchase> getPurchaseWithPaging(int pageNumber, int pageSize);

    Iterable<Purchase> findAll();

    List<Purchase> findAllPurchasesByUser(User user);

    Purchase saveOrUpdate(Purchase purchase);

    void delete(Long purchaseId);
}
