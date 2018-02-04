/**
 * 
 */
package com.java.workshop.carworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author Thirumurugan P
 *
 */
public class CarWorkshopTestCase {

private App carWorkShop;
private AppDataInitialiser carWorkShopData;
List<MechanicVO> mechanicList = null;
	
	@BeforeClass
	public static void beforeClass_method(){
		//System.out.println("BeforeClass Method.");
	}
	
	@AfterClass
	public static void afterClass_method(){
		//System.out.println("AfterClass Method.");
	}
	
	@Before
	public void setUp(){
		//System.out.println("SetUp Before Method.");
		carWorkShop = new App();
		carWorkShopData = new AppDataInitialiser();
		mechanicList = carWorkShopData.createMechanicList();
	}
	
	@After
	public void tearDown(){
	//	System.out.println("TearDown After Method.");
		
	}
	
	@Test
	public void test_createMechanicList() {
		
		
		System.out.println("Mechanic List 1 >>>"+mechanicList.size());
		List<MechanicVO> appmechanicList = carWorkShop.mechanicList;
		System.out.println("Mechanic List 2 >>>"+appmechanicList.size());
		Assert.assertEquals(mechanicList.size(), appmechanicList.size());
		
		
	}
	
	@Test
	public void test_maruticarreapir() {
		CarVO car = new CarVO();
        car.setCarMake("Maruti Suzuki");
        car.setCarMakeYear("2015");
        car.setCarNumber("PY 01 BF 7450");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("OilChanging");
        carissues.add("TimingBelt");
        carissues.add("CarburetorCleaning");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback Swift");
        
        Set<MechanicVO> mechOptfortheCar = carWorkShop.getSkillAvailableMechanicMap(car, mechanicList);
        Assert.assertEquals(3, mechOptfortheCar.size());
	}
	
	@Test
	public void test_HyundaiCarRepair() {
		CarVO car = new CarVO();
        car.setCarMake("Hyundai");
        car.setCarMakeYear("2011");
        car.setCarNumber("PY 01 BQ 4102");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("EngineCleaning");
        carissues.add("SparkPlug");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback");
        
        Set<MechanicVO> mechOptfortheCar = carWorkShop.getSkillAvailableMechanicMap(car, mechanicList);
        Assert.assertEquals(2, mechOptfortheCar.size());
	}
	
	@Test
	public void test_noMechanicavailable() {
		CarVO car = new CarVO();
        car.setCarMake("Hyundai");
        car.setCarMakeYear("2011");
        car.setCarNumber("PY 01 BQ 4102");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("EngineCleaning");
        carissues.add("SparkPlug");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback");
        List<MechanicVO> mechanicDummy = new LinkedList<MechanicVO>();
        for(MechanicVO mechanic : mechanicList) {
        	mechanic.setAvailable(Boolean.FALSE);
        	mechanicDummy.add(mechanic);
        }
        
        
        System.out.println(Arrays.toString(mechanicList.toArray()));
        Set<MechanicVO> mechOptfortheCar = carWorkShop.getSkillAvailableMechanicMap(car,mechanicDummy);
        Assert.assertEquals(0, mechOptfortheCar.size());

        
	}
	
	@Test
	public void test_noMarutiMechanicAvailable() {
		CarVO car = new CarVO();
        car.setCarMake("Maruti Suzuki");
        car.setCarMakeYear("2011");
        car.setCarNumber("PY 01 BQ 4102");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("EngineCleaning");
        carissues.add("SparkPlug");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback");
        List<MechanicVO> mechanicDummy = new LinkedList<MechanicVO>();
        for(MechanicVO mechanic : mechanicList) {
        	if(null != mechanic && mechanic.getMechanicWorksFor().equalsIgnoreCase(car.getCarMake())) {
        	mechanic.setAvailable(Boolean.FALSE);
        	mechanicDummy.add(mechanic);
        	}
        }
        System.out.println(Arrays.toString(mechanicList.toArray()));
        Set<MechanicVO> mechOptfortheCar = carWorkShop.getSkillAvailableMechanicMap(car,mechanicDummy);
        Assert.assertEquals(0, mechOptfortheCar.size());
	}
	
	@Test
	public void test_noHyundaiMechanicAvailable() {
		CarVO car = new CarVO();
        car.setCarMake("Hyundai");
        car.setCarMakeYear("2011");
        car.setCarNumber("PY 01 BQ 4102");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("EngineCleaning");
        carissues.add("SparkPlug");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback");
        List<MechanicVO> mechanicDummy = new LinkedList<MechanicVO>();
        for(MechanicVO mechanic : mechanicList) {
        	if(null != mechanic && mechanic.getMechanicWorksFor().equalsIgnoreCase(car.getCarMake())) {
        	mechanic.setAvailable(Boolean.FALSE);
        	mechanicDummy.add(mechanic);
        	}
        }
        System.out.println(Arrays.toString(mechanicList.toArray()));
        Set<MechanicVO> mechOptfortheCar = carWorkShop.getSkillAvailableMechanicMap(car,mechanicDummy);
        Assert.assertEquals(0, mechOptfortheCar.size());
	}
	
	@Test
	public void test_noMechanicAvailableForTheSkill() {
		CarVO car = new CarVO();
        car.setCarMake("Hyundai");
        car.setCarMakeYear("2011");
        car.setCarNumber("PY 01 BQ 4102");
        car.setFuelType("Diesel");
        List<String> carissues =  new ArrayList<String>();
        carissues.add("Speedometer");
        carissues.add("GearBall");
        car.setIssues(carissues);
        car.setVehicleType("Hatchback");
        List<MechanicVO> mechanicDummy = new LinkedList<MechanicVO>();
        for(MechanicVO mechanic : mechanicList) {
        	if(null != mechanic && mechanic.getMechanicWorksFor().equalsIgnoreCase(car.getCarMake())) {
        	mechanic.setAvailable(Boolean.FALSE);
        	mechanicDummy.add(mechanic);
        	}
        }
        System.out.println(Arrays.toString(mechanicList.toArray()));
        Set<MechanicVO> mechOptfortheCar = carWorkShop.getSkillAvailableMechanicMap(car,mechanicDummy);
        Assert.assertEquals(0, mechOptfortheCar.size());
	}
	
	
}
