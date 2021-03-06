/**
 * 
 */
package com.java.workshop.carworkshop;

import java.io.Serializable;
import java.util.List;

/**
 * @author tpurusot
 *
 */
public class CarVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1816223694429816848L;
	private String carNumber;
	private String carMake;
	private String fuelType;
	private String vehicleType;
	private String repairComplaints;
	private String carMakeYear;
	private List<String> issues;
	/**
	 * @return the carNumber
	 */
	public String getCarNumber() {
		return carNumber;
	}
	/**
	 * @param carNumber the carNumber to set
	 */
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	/**
	 * @return the carMake
	 */
	public String getCarMake() {
		return carMake;
	}
	/**
	 * @param carMake the carMake to set
	 */
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}
	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	/**
	 * @return the repairComplaints
	 */
	public String getRepairComplaints() {
		return repairComplaints;
	}
	/**
	 * @param repairComplaints the repairComplaints to set
	 */
	public void setRepairComplaints(String repairComplaints) {
		this.repairComplaints = repairComplaints;
	}
	/**
	 * @return the carMakeYear
	 */
	public String getCarMakeYear() {
		return carMakeYear;
	}
	/**
	 * @param carMakeYear the carMakeYear to set
	 */
	public void setCarMakeYear(String carMakeYear) {
		this.carMakeYear = carMakeYear;
	}
	
	/**
	 * @return the issues
	 */
	public List<String> getIssues() {
		return issues;
	}
	/**
	 * @param issues the issues to set
	 */
	public void setIssues(List<String> issues) {
		this.issues = issues;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarVO [carNumber=" + carNumber + ", carMake=" + carMake + ", fuelType=" + fuelType + ", vehicleType="
				+ vehicleType + ", repairComplaints=" + repairComplaints + ", carMakeYear=" + carMakeYear + ", issues="
				+ issues + "]";
	}
	/**
	 * @param carNumber
	 * @param carMake
	 * @param fuelType
	 * @param vehicleType
	 * @param repairComplaints
	 * @param carMakeYear
	 * @param issues
	 */
	public CarVO(String carNumber, String carMake, String fuelType, String vehicleType, String repairComplaints,
			String carMakeYear, List<String> issues) {
		super();
		this.carNumber = carNumber;
		this.carMake = carMake;
		this.fuelType = fuelType;
		this.vehicleType = vehicleType;
		this.repairComplaints = repairComplaints;
		this.carMakeYear = carMakeYear;
		this.issues = issues;
	}
	/**
	 * 
	 */
	public CarVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
