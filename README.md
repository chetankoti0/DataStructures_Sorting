# Java Sorting Algorithms

This repository contains basic implementations of popular sorting algorithms in Java. Each sorting algorithm is encapsulated in its own class and sorts an integer array using a specific technique.

# 📁 Files Included
# File Name	Description
bubbleSort.java	Implements Bubble Sort
selectionSort.java	Implements Selection Sort
insertionSort.java	Implements Insertion Sort
mergeSort.java	Implements Merge Sort
quickSort.java	Implements Quick Sort
Input.java	Utility class for taking user input (Scanner)

# 📌 Sorting Algorithms Covered
# 1. Bubble Sort
Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
Time Complexity:
Best: O(n)
Average & Worst: O(n²)
Stable: ✅

# 2. Selection Sort
Selects the minimum element and places it at the beginning of the unsorted part.
Time Complexity:
Best, Average, Worst: O(n²)
Stable: ❌

# 3. Insertion Sort
Builds the final sorted array one item at a time.
Time Complexity:
Best: O(n)
Average & Worst: O(n²)
Stable: ✅

# 4. Merge Sort
Divide and Conquer algorithm. Recursively splits and merges sorted subarrays.
Time Complexity: O(n log n) for all cases
Stable: ✅

# 5. Quick Sort
Divide and Conquer algorithm. Picks a pivot and partitions the array.
Time Complexity:
Best & Average: O(n log n)
Worst: O(n²)
Stable: ❌

# How to Run

# Clone the repository:
git clone https://github.com/your-username/java-sorting-algorithms.git
cd java-sorting-algorithms

# Compile the Java files:
javac *.java
Run any of the sorting algorithms, for example:
java bubbleSort

# 💡 Note
All algorithms take input through the Input.java helper class.
Customize the input array by modifying the main() method of each sorting class. Ideal for learning basic sorting and understanding time complexity.

