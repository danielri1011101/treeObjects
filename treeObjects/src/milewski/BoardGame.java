package milewski;

public class BoardGame {

	/**
	 * Symbol drawn and its coordinates.
	 * @author daniel
	 *
	 */
	class Move {
		int symbol;
		int x;
		int y;
	}
	
	/**
	 * The parent field is so that an array of move
	 * edges easily represents a tree.
	 * @author daniel
	 *
	 */
	class MEdge {
		Move move;
		int parent;
	}
	
	/**
	 * Now a move tree can simply be an array of move edges.
	 */
}
