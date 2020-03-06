
package FirstAssignment;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yang on 1/23/20.
 */
public class  StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int size = array.length;
        return array[size-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[count] = array[i];
            count ++;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] is_pangramic = new boolean[26];
        for (int i = 0; i <array.length; i++) {
            String elem = array[i];
             elem = elem.toUpperCase();
            for (int j = 0; j < elem.length(); j++) {
                int ascii = elem.charAt(j) - 65;
                if (ascii >= 0 && ascii < 26) {
                    is_pangramic[ascii] = true;
                }

            }
        }
            for (int x =0; x < 26;x++){
                if(!is_pangramic[x]){
                    return  false;
                }
            }
            return  true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count =0;
        for(int i =0; i< array.length; i++){
            if(array[i].equals(value)){
                count+=1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToBeRemove) {
        int newArraySize = array.length - getNumberOfOccurrences(array, valueToBeRemove);
        String[] resultArray = new String[newArraySize];
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(valueToBeRemove)) {
                index++;
            } else {
                resultArray[i - index] = array[i];
            }
        }
        return resultArray;
    }

    public static int duplicatesCount(String[] array) {

        int dupCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                dupCount++;
            }
        }
        return dupCount;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
          int new_arrSize = array.length - duplicatesCount(array);
          String[] res_arr = new String[new_arrSize];
          int index =0;
          for(int x =0; x<array.length; x++){
              if(x==0 || !array[x].equals(array[x-1])){
                  res_arr[index] = array[x];
                  index+=1;
              }
          }
          return res_arr;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO


    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> new_arrSize = new ArrayList<String>();
        new_arrSize.add(array[0]);
        int x = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(Character.toString(new_arrSize.get(x).charAt(0)))) {
                String coneccted = new_arrSize.get(x) + array[i];
                new_arrSize.set(x, coneccted);

            } else {
                new_arrSize.add(array[i]);
                x++;
            }

        }
        return  new_arrSize.toArray(new String[new_arrSize.size()]);
    }

}
