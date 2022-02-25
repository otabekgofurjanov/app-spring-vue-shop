package com.example.appspringvueshop.repository.projection;

import com.example.appspringvueshop.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {
	String getName();
	DeviceType getType();
	Double getPrice();
	String getColor();
	LocalDateTime getPurchaseTime();
}
