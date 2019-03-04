package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;

import java.util.*;

public class UseMap {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> tvs = new ArrayList();
		tvs.add("Game of Thrones");
		tvs.add("Breaking Bad");
		tvs.add("Supernatural");

		List<String> mov = new ArrayList();
		mov.add("Black Panther");
		mov.add("A Star Is Born");
		mov.add("Green Book");

		List<String> alb = new ArrayList();
		alb.add("Ariana Grande");
		alb.add("Hauschka");
		alb.add("Julia Jacklin");

		Map<String, List<String>> map = new HashMap<String,List<String>>();
		map.put("TvSeries", tvs);
		map.put("Movies", mov);
		map.put("Album", alb);

		//for each loop
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|\tPrinting HashMap by using For Each Loop :");
		System.out.println("+-----------------------------------------------------------+");
		for(Map.Entry key: map.entrySet()) {
			System.out.println("| " +key.getKey()+" "+key.getValue());
		}

		System.out.println("+-----------------------------------------------------------+");

		//Iterator with for loop
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|\tPrinting HashMap by using Iterator :");
		System.out.println("+-----------------------------------------------------------+");
		Iterator it = map.entrySet().iterator();

		while(it.hasNext()) {
			System.out.println("| " +it.next());
		}
		System.out.println("+-----------------------------------------------------------+");

		//Use MySql to store data and retrieve data.
		ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.insertNewDataFromMapToMySql((List<String>) tvs,"tvs","name");
		connect.insertNewDataFromMapToMySql((List<String>) mov,"mov","name");
		connect.insertNewDataFromMapToMySql((List<String>) alb,"alb","name");

		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|\tPrinting from Database :");
		System.out.println("+-----------------------------------------------------------+");
		List<String> pdb = connect.readDataBase("tvs","name");
		System.out.println("TvSeries\t: "+pdb);


	}

}
