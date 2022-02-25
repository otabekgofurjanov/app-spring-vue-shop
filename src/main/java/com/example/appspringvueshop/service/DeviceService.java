package com.example.appspringvueshop.service;

import com.example.appspringvueshop.model.Device;

import java.util.List;

public interface DeviceService {
	Device saveDevice(Device device);

	void deleteDevice(Long id);

	List<Device> deviceList();
}
