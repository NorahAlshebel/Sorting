
package lab10;
import java.util.*;

public class Lab10 {

    public static void main(String[] args) {
    

Integer[] ID = { 5, 6, 1, 2, -3, 0, -1, 8, 9 };
Integer[] ID2 = { 15, 18, 1, -1, 20, 23, 5, 7, -5 };
Integer[] ID3 = { 100, -1, 11, -10, 20, 50, 99, 27, 0 };
// from this line until 21 (Linear search)
System.out.println("The number you are looking for is :" );
System.out.println(linearSearch(ID, 0, ID.length,5 ) ? "Found!" : "Not Found!");
System.out.println("_______________________________________");
System.out.println("The number you are looking for is :" );
System.out.println(linearSearch(ID, 1, ID.length,5 ) ? "Found!" : "Not Found!");
System.out.println("_______________________________________");
//Print array 1 before sort
System.out.println("The first array before sorting :" );
System.out.println(Arrays.toString(ID));
System.out.println("_______________________________________");
//Print array 2 before sort
System.out.println("The Second array before sorting :" );
System.out.println(Arrays.toString(ID2));
System.out.println("_______________________________________");
//Print array 3 before sort
System.out.println("The Third array before sorting :" );
System.out.println(Arrays.toString(ID3));
System.out.println("_______________________________________");
// Bubble Sort :
System.out.println("The first array after Bubble Sorting:" );
bubbleSort(ID,ID.length );
System.out.println(Arrays.toString(ID));
System.out.println("_______________________________________");
// Selection Sort :
System.out.println("The second array after Selection Sorting:" );
selectionSort(ID2);
System.out.println(Arrays.toString(ID2));
System.out.println("_______________________________________");
// Insertion Sort :
System.out.println("The third array after insertion Sorting:" );
insertionSort(ID3);
System.out.println(Arrays.toString(ID3));
System.out.println("_______________________________________");
}
public static <T extends Comparable<T>> boolean linearSearch(T[] data, int min, int max, T target) {
int index = min;
boolean found = false;
while (!found && index <= max) {
if (data[index].compareTo(target) > 0)
return false;
found = data[index].equals(target);
index++;
}
return found;
}
public static <T extends Comparable<T>> void bubbleSort(T a[], int length) {
for (int i = 0; i < (length - 1); i++) {
for (int j = length - 1; j > i; j--) {
if (a[j - 1].compareTo( a[j])>0) {

T temp = a[j - 1];
a[j - 1] = a[j];
a[j] = temp;
}
}
}
}
public static <T extends Comparable<T>> void selectionSort(T[] data) {
int min;
T temp;
for (int index = 0; index < data.length - 1; index++) {
min = index;
for (int scan = index + 1; scan < data.length; scan++)
if (data[scan].compareTo(data[min]) < 0)
min = scan;
swap(data, min, index);
}
}
private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
T temp = data[index1];
data[index1] = data[index2];
data[index2] = temp;
}
public static <T extends Comparable<T>> void insertionSort(T[] data) {
for (int index = 1; index < data.length; index++) {
T key = data[index];
int position = index;
while (position > 0 && data[position - 1].compareTo(key) > 0) {
data[position] = data[position - 1];
position--;
}
data[position] = key;
}
}
}
    

