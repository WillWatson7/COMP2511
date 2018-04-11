/**
 * 
 */
package lab05;

/**
 * @author tecty
 *
 */
public interface Set<E>  extends Iterable<E> {
	// element operation
	void add(E element);
	void delete(E element);
	boolean is_exist(E element);
	
	// set operation
	Set<E> union(Set<E> another_set);
	Set<E> intersection(Set<E> another_set);
	boolean is_subset_of(Set<E> another_set);
	
	@Override
	boolean equals(Object obj);
}
