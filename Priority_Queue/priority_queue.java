package Priority_Queue;

import java.util.ArrayList;


// Min heap implementation...

public class priority_queue {
    private ArrayList<Integer> heap;

    public priority_queue(){
        heap = new ArrayList<>();
    }
    boolean isEmpty(){
        return heap.size() == 0;
    }
    int size(){
        return heap.size();
    }
    int getMin() throws PrioprityQueueException{
        if(isEmpty())
        throw new PrioprityQueueException();

        return heap.get(0);
    }
    void insert(int element){
        heap.add(element);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while(childIndex >0){

            if(heap.get(childIndex)< heap.get(parentIndex)){
                int temp = heap.get(childIndex);

                heap.set(parentIndex, temp);
                heap.set(childIndex, heap.get(parentIndex));
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }else{
                return;
            }
        }
    }
    int remove() throws PrioprityQueueException{
        if(isEmpty())
        throw new PrioprityQueueException();

        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int index = 0 ;
        int minIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while(leftChildIndex < heap.size()-1){

        if(heap.get(leftChildIndex) < heap.get(rightChildIndex))
        minIndex = leftChildIndex;

        if(rightChildIndex < heap.size() &&  heap.get(rightChildIndex) < heap.get(leftChildIndex))
        minIndex = rightChildIndex;

        int temp1 = heap.get(index);
        heap.set(index, heap.get(minIndex));
        heap.set(minIndex, temp1);
        index = minIndex;
        leftChildIndex = minIndex*2 +1;
        rightChildIndex = minIndex*2 +2;

        }
        return temp;
    }
}
