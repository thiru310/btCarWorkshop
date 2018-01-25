/**
 * 
 */
package com.java.workshop.carworkshop;

import java.util.Arrays;

/**
 * @author tpurusot
 *
 */
public class Mechanic {

	public void repair(CarVO car) {
		System.out.println("List of Mechanics"+Arrays.toString(App.mechanicList.toArray()));
	}
	
}
