/**
 * 
 */
package lab05;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author tecty
 * @param <E>
 *
 */
public  class ArraySet<E> implements Set<E> ,Iterable<E>{
	// create a array list to store the data 
	ArrayList<E> data = new ArrayList<E>(); 

	@Override
	public void add(E element) {
		if (!this.is_exist(element)) {
			// a set couldn't have duplicate element;
			data.add(element);
		}
	}

	@Override
	public void delete(E element) {
		data.remove(element);
	}

	@Override
	public boolean is_exist(E element) {
		return data.contains(element);
	}

	@Override
	public Set<E> union(Set<E> another_set) {
		// store the together info of the set  
		ArraySet<E> new_set = new ArraySet<E>();
		Iterator<E> it = this.iterator();
		while ( it.hasNext() ) {
			E e = it.next();
			// iterate over this array
			new_set.add(e);
		}
		it = another_set.iterator();
		while ( it.hasNext() ) {
			E e = it.next();
			// iterate over this array
			new_set.add(e);
		}
		return new_set;
	}

	@Override
	public Set<E> intersection(Set<E> another_set) {
		// store the together info of the set  
		ArraySet<E> new_set = new ArraySet<E>();
		Iterator<E> it = this.iterator();
		while ( it.hasNext() ) {
			E e = it.next();
			// calculate the intersection by checking weather another 
			// set has same element;
			if (another_set.is_exist(e)) {
				// both set has same element.
				new_set.add(e);
			}
		}
	
		return new_set;
	}

	@Override
	public boolean is_subset_of(Set<E> another_set) {
		Iterator<E> it = this.iterator();
		while ( it.hasNext() ) {
			E e = it.next();
			// calculate the subset by checking weather another 
			// set has same element;
			if (!another_set.is_exist(e)) {
				// some element is not exist in another set
				return false;
			}
		}
		return true;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return data.iterator();
	}

	@Override
	public String toString() {
		// empty string store the result
		String str = new String();
		
		Iterator<E> it = this.iterator();
		while ( it.hasNext() ) {
			E e = it.next();
			str += e.toString() +" ";
		}
		return str;
	}
	

}
