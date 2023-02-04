#include <stdio.h>

int binarySearch(int arr[100], int left, int right, int key)
{

  int m;
  int flag = 0;
  if (left <= right)
  {
    m = (left + right) / 2;

    if (key == arr[m])
      flag = m;
    else if (key < arr[m])
      return binarySearch(arr, left, m - 1, key);
    else
      return binarySearch(arr, m + 1, right, key);
  }
  else
    return flag;
}


void main () {


  int arr[]={1,2,3,4,5,6,7,8,9,0};
  int n, key, flag;
  printf("\nEnter number to search: ");
  scanf("%d", &key);

  flag = binarySearch(arr,0,n-1,key);


  if(flag ==0)
    printf("\nSearch unsuccesful");
  else
    printf("\n%d found", key);

}