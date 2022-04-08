/**
* Autor: Majo Gil (20337) y Sofia Escobar (20489) 
* Codigo de apoyo: 	https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
*/

public interface PriorityQueueJCF<E extends Comparable<E>> {

    public E getFirst();
    public E remove();
    public void add(E value);
    public boolean isEmpty();
    public int size();
    public void clear();
}