/**
 * 
 */
package lab06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author tecty
 *
 */
public class ListGraph<E> implements Graph<E> {
	ArrayList<E> nodes = new ArrayList<>();
	ArrayList<ArrayList<Boolean>> edges = new ArrayList<ArrayList<Boolean>>();
	
	int n_node = 0;
	@Override
	public Iterator<E> iterator() {
		// return all the nodes' iterator
		return nodes.iterator();
	}

	@Override
	public void addNode(E node) {
//		add node for the iterator
		nodes.add(node);
		// initial the value for the array
		edges.add(n_node, new ArrayList<Boolean>());
		// add up the counter for node
		n_node ++;
		for (int i = 0; i < n_node; i++) {
			// set to 0 at the new row
			edges.get(n_node -1).set(i, false);
			// set to 0 to the new column 
			edges.get(i).set(n_node -1, false);
		}
		
	}

	@Override
	public void addEdge(E from, E to) {
		// edges[from.index][to.index] = true
		edges.get(nodes.indexOf(from)).set(nodes.indexOf(to), true);
	}

	@Override
	public boolean isEdge(E from, E to) {
		// TODO Auto-generated method stub
		return edges.get(nodes.indexOf(from)).get(nodes.indexOf(to));
	}

	@Override
	public boolean bfs_is_path(E from, E to) {
		ArrayList<E> visited = new ArrayList<>();
		ArrayQueue<E> queue = new ArrayQueue<>();
		queue.add(from);
		while(!queue.isEmpty()) {
			// dequeue the first element
			E this_node = queue.remove();
			if (this_node.equals(to)) {
				// I'm standing on the node I want to reach
				return true;
			}
			
			for (int i = 0; i < n_node; i++) {
				if (isEdge(this_node, nodes.get(i)) && !visited.contains(nodes.get(i))) {
					// there is an edge between this node and i
					// and we have not visited the i's node
					
					// mark i as visited
					visited.add(nodes.get(i));
					// try to visit i's node 
					queue.add(nodes.get(i));
				}
			}
		}
		return false;
	}

	@Override
	public boolean dfs_is_path(E from, E to) {
		// TODO Auto-generated method stub
		return false;
	}

}
