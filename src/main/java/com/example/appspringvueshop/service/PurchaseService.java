package com.example.appspringvueshop.service;

import com.example.appspringvueshop.model.Purchase;
import com.example.appspringvueshop.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
	Purchase savePurchase(Purchase purchase);

	List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
