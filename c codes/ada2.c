#include<stdio.h> 
void main(){
	int arr[10], i, key, flag = 0, pos; 
	printf("Enter 10 numbers in the array:\n"); 
	for (i = 0; i< 10; i++){
		 scanf("%d", &arr[i]); 
	} 
	printf("Enter a key to search: "); 
	scanf("%d", &key); 
	for (i = 0; i < 10; i++){ 
		if (arr[i] == key){ 
			flag = 1; 
			pos = i; 
		} 
	} 
	if (flag == 1){ 
		printf("Element found at position %d!\n", pos); 
	} 
	else{ 
		printf("Element not found!\n");
 	} 
}
