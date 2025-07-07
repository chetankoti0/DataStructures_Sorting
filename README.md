# 🔢 Java Sorting Algorithms

This repository contains implementations of fundamental sorting algorithms in Java. Each algorithm is implemented in its own class and demonstrates basic sorting logic for integer arrays.

---

## 📁 Files Included

| File Name            | Description                                  |
|----------------------|----------------------------------------------|
| `bubbleSort.java`    | Implements Bubble Sort                       |
| `selectionSort.java` | Implements Selection Sort                    |
| `insertionSort.java` | Implements Insertion Sort                    |
| `mergeSort.java`     | Implements Merge Sort (Divide and Conquer)   |
| `quickSort.java`     | Implements Quick Sort (Divide and Conquer)   |
| `Input.java`         | Helper class for handling user input         |

---

## 📌 Sorting Algorithms Overview

### 1. 🫧 Bubble Sort
- Compares and swaps adjacent elements if they are in the wrong order.
- **Time Complexity**:
  - Best: O(n)
  - Average/Worst: O(n²)
- **Space Complexity**: O(1)
- **Stable**: ✅

---

### 2. 🎯 Selection Sort
- Selects the minimum element and places it at the beginning of the unsorted portion.
- **Time Complexity**: O(n²) for all cases
- **Space Complexity**: O(1)
- **Stable**: ❌

---

### 3. 📝 Insertion Sort
- Builds a sorted array one item at a time by inserting elements in the correct position.
- **Time Complexity**:
  - Best: O(n)
  - Average/Worst: O(n²)
- **Space Complexity**: O(1)
- **Stable**: ✅

---

### 4. 🧩 Merge Sort
- Recursively splits the array and merges the sorted halves.
- **Time Complexity**: O(n log n) for all cases
- **Space Complexity**: O(n)
- **Stable**: ✅

---

### 5. ⚡ Quick Sort
- Selects a pivot, partitions the array, and sorts each part recursively.
- **Time Complexity**:
  - Best/Average: O(n log n)
  - Worst: O(n²)
- **Space Complexity**:
  - Iterative: O(log n)
  - Recursive: Depends on implementation
- **Stable**: ❌

---

## 🧪 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-sorting-algorithms.git
   cd java-sorting-algorithms
   ```

2. Compile all `.java` files:
   ```bash
   javac *.java
   ```

3. Run any sorting algorithm:
   ```bash
   java bubbleSort
   java selectionSort
   java insertionSort
   java mergeSort
   java quickSort
   ```

---

## 🔧 Input Handling

- All sorting programs use the `Input.java` class to read:
  - Size of the array
  - Array elements

---


