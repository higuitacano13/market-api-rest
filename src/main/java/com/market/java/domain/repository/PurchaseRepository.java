package com.market.java.domain.repository;

import com.market.java.domain.Purchase;
import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClientId(String clientId);
    Purchase save(Purchase purchase);
}
