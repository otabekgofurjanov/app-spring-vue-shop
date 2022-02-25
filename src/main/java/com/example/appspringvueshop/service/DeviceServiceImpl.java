package com.example.appspringvueshop.service;

import com.example.appspringvueshop.model.Device;
import com.example.appspringvueshop.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceRepository deviceRepository;

	@Override
	public Device saveDevice(Device device) {

		device.setCreateTime(LocalDateTime.now());

		return deviceRepository.save(device);
	}

	@Override
	public void deleteDevice(Long id){

		deviceRepository.deleteById(id);
	}

	@Override
	public List<Device> deviceList (){

		return deviceRepository.findAll();
	}

}
