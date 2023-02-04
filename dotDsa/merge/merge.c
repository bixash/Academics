// merge sort in C
#include <stdio.h>

// merge two subarrays L and M into arr
void merge(int arr[], int leftIndex, int middle, int rightIndex) {

  // Create L ← A[leftIndex..middle] and M ← A[middle+1..rightIndex]
  int n1 = middle - leftIndex + 1;
  int n2 = rightIndex - middle;

  int L[n1], M[n2];

  for (int i = 0; i < n1; i++)
    L[i] = arr[leftIndex + i];
  for (int j = 0; j < n2; j++)
    M[j] = arr[middle + 1 + j];

  // Maintain current index of sub-arrays and main array
  int i, j, k;
  i = 0;
  j = 0;
  k = leftIndex;

  // Until we reach either end of either L or M, pick larger among
  // elements L and M and place them in the corect position at A[leftIndex..rightIndex]
  while (i < n1 && j < n2) {
    if (L[i] <= M[j]) {
      arr[k] = L[i];
      i++;
    } else {
      arr[k] = M[j];
      j++;
    }
    k++;
  }

  // When we run out of elements in either L or M,
  // pick up the remaining elements and put in A[leftIndex..rightIndex]
  while (i < n1) {
    arr[k] = L[i];
    i++;
    k++;
  }

  while (j < n2) {
    arr[k] = M[j];
    j++;
    k++;
  }
}

// Divide the array into two subarrays, sort them and merge them
void mergeSort(int arr[], int l, int rightIndex) {
  if (l < rightIndex) {

    // m is the point where the array is divided into two subarrays
    int m = l + (rightIndex - l) / 2;

    mergeSort(arr, l, m);
    mergeSort(arr, m + 1, rightIndex);

    // merge the sorted subarrays
    merge(arr, l, m, rightIndex);
  }
}

void Printarray(int arr[], int size) {
  for (int i = 0; i < size; i++)
    printf("%d ", arr[i]);
  printf("\n");
}

int main() {
  int arr[] = {0, 5, 12, 10, 9, 1};
  int size = sizeof(arr) / sizeof(arr[0]);

  mergeSort(arr, 0, size - 1);

  printf("Sorted array: \n");
  Printarray(arr, size);
}
