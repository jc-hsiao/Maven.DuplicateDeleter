package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

//    @Override
//    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
//        Integer[] newArr = array.clone();
//        for (int i = 0; i < newArr.length; i++){
//            if(countOcc(newArr, newArr[i]) >= maxNumberOfDuplications){
//                newArr = removeAll(newArr, newArr[i]);
//                i=-1;
//            }
//        }
//        return newArr;
//    }
//
//    @Override
//    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        Integer[] newArr = array.clone();
//        for (int i = 0; i < newArr.length; i++){
//            if(countOcc(newArr, newArr[i]) == exactNumberOfDuplications){
//                newArr = removeAll(newArr, newArr[i]);
//                i=0;
//            }
//        }
//        return newArr;
//    }
//
//    public Integer countOcc( Integer[] intArr, Integer element){
//        int count = 0;
//        for (Integer integer:intArr) {
//            if(integer.equals(element))
//                count++;
//        }
//        return count;
//    }
//
    public Integer[] removeAll(Integer[] intArr, Integer element){
        Integer[] newArr = new Integer[intArr.length-countOcc(intArr,element)];
        int x = 0;
        for (Integer integer : intArr) {
            if (!integer.equals(element)) {
                newArr[x++] = integer;
            }
        }
        return newArr;
    }
}
