package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GenerateRandom {

	public static Map<Integer, Integer> checkRand(int amount, int interval) {

		LinkedList<Integer> listOfGeneratedNumbers = new LinkedList<Integer>();
		Random generator = new Random();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < amount; i++) {
			listOfGeneratedNumbers.add(generator.nextInt(interval));
		}
		for (int i = 0; i < interval; i++) {
			int count = 0;
			Iterator<Integer> it = listOfGeneratedNumbers.iterator();
			while (it.hasNext()) {
				if (it.next() == i) {
					count++;
				}
			}
			map.put(i, count);
		}
		return map;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> mapka = checkRand(500000, 10);
		Set<Integer> keys = mapka.keySet();
		
		for(Integer key: keys) {
			System.out.println(key + " : " + mapka.get(key));
		}
		
		
	}

}
