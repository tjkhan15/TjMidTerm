package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static databases.ConnectToSqlDB.*;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> name = new ArrayList<>();

		name.add("Tanjim");
		name.add("Aktaruz");
		name.add("Taher");
		name.add("HeroMama");
		name.add("Nancy");
		name.add("Tanjina");
		name.add("Rocksana");

		System.out.println();
		System.out.println("Retrieving data from ArrayList: " + name);
		System.out.println("Peek element: " + name.get(2));
		System.out.println("Remove element at index 4: " + name.remove(4));
		System.out.println("After doing all these, retrieving data from ArrayList: " + name);

		System.out.print("By using for Loop: ");
		for (String st : name) {
			System.out.print(" "+st);
		}
		System.out.println();

		System.out.print("By using while Loop with Iterator: ");
		Iterator it = name.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.print(" "+s);
		}
		System.out.println();

		Collections.sort(name);
		System.out.println("After sorting, the ArrayList: "+name);

		//Store to SqlDB
		ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.insertDataFromArrayListToSqlTable(name, "studentsArray", "stName");
		List<String> stName = connect.readDataBase("studentsArray","stName");
		System.out.println("This ArrayList from Database: " +stName);

	}

}