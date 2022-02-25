package com.example.appspringvueshop.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "devices")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description", nullable = false, length = 100)
	private String description;

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "createTime", nullable = false)
	private LocalDateTime createTime;

	@Enumerated(EnumType.STRING)
	@Column(name = "device_type", nullable = false)
	private DeviceType deviceType;

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "device")
	//private Set<Purchase> purchaseList;
}
