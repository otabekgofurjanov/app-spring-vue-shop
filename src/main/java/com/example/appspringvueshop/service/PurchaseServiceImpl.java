package com.example.appspringvueshop.service;

import com.example.appspringvueshop.model.Purchase;
import com.example.appspringvueshop.repository.PurchaseRepository;
import com.example.appspringvueshop.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;

	@Override
	public Purchase savePurchase(Purchase purchase) {

		purchase.setPurchaseTime(LocalDateTime.now());

		return purchaseRepository.save(purchase);
	}

	@Override
	public List<PurchaseItem> findPurchaseItemOfUser(Long userId) {

		return purchaseRepository.findAllPurchasesOfUser(userId);
	}
}
