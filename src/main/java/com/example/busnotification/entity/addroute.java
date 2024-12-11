package com.example.busnotification.entity;


import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class addroute {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="route_number")
	private int routeNumber;
	private String sourceLocation;
	private String destinationLocation;
	private String intermediateStops;
	
	private LocalTime departureTime;
	
	private LocalTime arrivalTime;
	
	 

	
	public addroute() {}
	public addroute(int routeNumber, String sourceLocation, String destinationLocation, String intermediateStops,
			LocalTime departureTime, LocalTime arrivalTime) {
		super();
		this.routeNumber = routeNumber;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
		this.intermediateStops = intermediateStops;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	public int getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public String getIntermediateStops() {
		return intermediateStops;
	}
	public void setIntermediateStops(String intermediateStops) {
		this.intermediateStops = intermediateStops;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = LocalTime.parse(departureTime);
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = LocalTime.parse(arrivalTime);
	}
	@Override
	public String toString() {
		return "addroute [routeNumber=" + routeNumber + ", sourceLocation=" + sourceLocation + ", destinationLocation="
				+ destinationLocation + ", intermediateStops=" + intermediateStops + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}
	
	
}
