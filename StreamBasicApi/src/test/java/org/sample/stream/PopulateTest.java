package org.sample.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.sample.bean.Person;

public class PopulateTest {
	
	protected List<Integer> intStreamList;
	
	protected List<Double> doubleStreamList;
	
	protected List<Long> longStreamList;
	
	protected List<String> strStreamList;
	
	protected
	List<Person> objStreamList;

	@Before
	public void setup(){
		//objlist
		Person p1 = new Person();
		p1.setFirstName("Eric");
		p1.setLastName("Fan");
		p1.setAge(34);
		Person p2 = new Person();
		p2.setFirstName("Bacon");
		p2.setLastName("Wang");
		p2.setAge(35);
		Person p3 = new Person();
		p3.setFirstName("Richard");
		p3.setLastName("Li");
		p3.setAge(32);
		Person p4 = new Person();
		p4.setFirstName("Daniel");
		p4.setLastName("Wang");
		p4.setAge(28);
		objStreamList = new ArrayList<>(4);
		objStreamList.add(p1);
		objStreamList.add(p2);
		objStreamList.add(p3);
		objStreamList.add(p4);
		
		//intlist
		intStreamList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,100);
		longStreamList = Arrays.asList(1l,3l,5l,7l,9l,11l,13l);
		doubleStreamList = Arrays.asList(0.01,0.12,0.22,0.32,0.42);
		strStreamList = Arrays.asList("u","r","not","a","girl","without","story");
	}

}
