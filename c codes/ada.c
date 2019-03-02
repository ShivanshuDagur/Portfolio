#include<stdio.h> 
void main(){ 
	int arr[10], i, j, key, lb = 0, ub = 9, mid; 
	printf("Enter 10 numbers in the array:\n"); 
	for (i = 0; i < 10; i++){ 
		scanf("%d", &arr[i]); 
	} 
	for (i = 0; i < 10; i++){ 
		for (j = 0; j < 10 - 1 - i; j++){ 
			if (arr[j] > arr[j + 1]){ 
				int temp = arr[j]; 
				arr[j] = arr[j+1]; 
				arr[j+1] = temp; 
			} 
		} 
	} 
	printf("Enter a key to search: "); 
	scanf("%d", &key); 
	mid = (lb + ub)/2; 
	while (lb <= ub && arr[mid] != key){ 
		if (arr[mid] < key){ 
			lb = mid + 1; 
		} 
		else if (arr[mid] > key){ 
			ub = mid - 1; 
		} 
		mid = (lb + ub) / 2; 
	} 
	if (arr[mid] == key){ 
		printf("Element found in array at position %d!\n", mid); 
	} 
	else{ 
		printf("Element not found!\n"); 
	}
}
