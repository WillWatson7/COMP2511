package lab06;


public interface Graph<E> extends Iterable<E> {
	// basic functionality of a graph
	void addNode(E node);
	void addEdge(E from, E to);
	boolean isEdge(E from, E to);
	
	
	
	// searching functionality of a graph 
	boolean bfs_is_path(E from, E to);
	boolean dfs_is_path(E from, E to);
}
