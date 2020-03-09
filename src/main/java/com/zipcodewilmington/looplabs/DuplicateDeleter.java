package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    @Override
    public T[] removeDuplicates(int maxNumberOfDuplications) {
        T[] newArr = array.clone();
        for (int i = 0; i < newArr.length; i++){
            if(countOcc(newArr, newArr[i]) >= maxNumberOfDuplications){
                newArr = removeAll(newArr, newArr[i]);
                i=-1;
            }
        }
        return newArr;
    }

    @Override
    public T[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        T[] newArr = array.clone();
        for (int i = 0; i < newArr.length; i++){
            if(countOcc(newArr, newArr[i]) == exactNumberOfDuplications){
                newArr = removeAll(newArr, newArr[i]);
                i=0;
            }
        }
        return newArr;
    }

    public Integer countOcc( T[] intArr, T element){
        int count = 0;
        for (T integer:intArr) {
            if(integer.equals(element))
                count++;
        }
        return count;
    }

    abstract T[] removeAll(T[] intArr, T element);
}
