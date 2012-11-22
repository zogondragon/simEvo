/**
 *  QuadTree class : Abstract Data Structure used for Map
 */
public class QuadTree<Key extends Comparable<Key>, Value> {
    private Node root;

    // helper node data type
    private class Node {
        Key x, y;       // coordinate
        Node north_west, north_east, south_east, south_west;
        Value value;    // Tile, in my case

        Node(Key x, Key y, Value value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    // helper compare functions
    private boolean less(Key k1, Key k2) { return k1.compareTo(k2) < 0; }
    private boolean eq(Key k1, Key k2) { return k1.compareTo(k2) == 0; }

    public void Insert(Key x, Key y, Value value) {
        root = Insert(root, x, y, value); // overloading
    }

    private Node Insert(Node node, Key x, Key y, Value value) {
        if (node == null) {
            return new Node(x, y, value); 
        } else if (less(x, node.x) && less(y, node.y)) {
            node.south_west = Insert(node.south_west, x, y, value);
        } else if (less(x, node.x) && !less(y, node.y)) {
            node.north_west = Insert(node.north_west, x, y, value);
        } else if (!less(x, node.x) && less(y, node.y)) {
            node.south_east = Insert(node.south_east, x, y, value);
        } else if (!less(x, node.x) && !less(y, node.y)) {
            node.north_east = Insert(node.north_east, x, y, value);
        }
        return node;
    }

    // return null, if not found
    // return Value, if found
    public Value Find(Key x, Key y) {
        Node result = Find(root, x, y);    // overloading
        if (result == null) {
            return null;
        } else {
            return result.value;
        }
    }

    // TODO: implement this
    private Node Find(Node node, Key x, Key y) {
        return null;
    }
}
