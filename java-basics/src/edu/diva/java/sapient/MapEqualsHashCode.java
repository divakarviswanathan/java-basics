package edu.diva.java.sapient;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapEqualsHashCode {

	Integer id;
	
	public MapEqualsHashCode(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		MapEqualsHashCode other = (MapEqualsHashCode) obj;
		boolean ret = false;
		if(other.id.equals(this.id)) {
			ret = true;
		}
		return ret;
	}

	@Override
	public String toString() {
		return "MapEqualsHashCode [id=" + id + "]";
	}

	public static void main(String[] args) {
		MapEqualsHashCode m1 = new MapEqualsHashCode(1);
		MapEqualsHashCode m2 = new MapEqualsHashCode(1);
		Map m = new TreeMap();
		m.put(m1, 1);
		m.put(m2, 1);
		System.out.println(m.size());
		Iterator itr = m.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
