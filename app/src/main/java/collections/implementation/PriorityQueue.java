package collections.implementation;

import collections.exceptions.EmptyCollectionException;

/**
 * A PriorityQueue represents a priority queue implemented using a heap.
 *
 * @param <T> the type of element held in this collection
 */
public class PriorityQueue<T> extends LinkedHeap<PriorityQueueNode<T>> {

    /**
     * Creates an empty priority queue.
     */
    public PriorityQueue() {
        super();
    }

    /**
     * Adds the given element to this PriorityQueue.
     *
     * @param object   the element to be added to the priority queue
     * @param priority the integer priority of the element to be added
     */
    public void addElement(T object, int priority) {
        PriorityQueueNode<T> node = new PriorityQueueNode<>(object, priority);
        super.addElement(node);
    }

    /**
     * Removes the next highest priority element from this priority queue and
     * returns a reference to it.
     *
     * @return a reference to the next highest priority element in this queue
     * @throws EmptyCollectionException if the priority queue is empty
     */
    public T removeNext() throws EmptyCollectionException {
        PriorityQueueNode<T> temp = super.removeMin();
        return temp.getElement();
    }
}
