package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public String[] removeAll(String[] sArr, String element){
        String[] newArr = new String[sArr.length-countOcc(sArr,element)];
        int x = 0;
        for (String s : sArr) {
            if (!s.equals(element)) {
                newArr[x++] = s;
            }
        }
        return newArr;
    }
}
