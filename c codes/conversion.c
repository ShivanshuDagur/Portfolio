#include <math.h>
#include <stdio.h> 
#include <stdlib.h> 
#include <string.h> 

int convert(char *token)
{ 
    int quad = atoi(token); 
    double answer = 0.0;
    double i = 0.0; 
    char *str; 
    double r;
    if (strlen(token) > 8)
    { 
        printf("Wrong input\n"); 
        exit(0); 
    } 
    while (quad != 0)
    { 
         r = quad % 10; 
        answer += r * pow(2.0, i++); 
        quad /= 10; 
    } 
        return answer; 
} 
          

int main(void)
{ 
    char ip[35], *token, result[50]; 
    int count = 0, answer; 
    char string[30]; 
    printf("It's Shivanshu here!\n"); 
    printf("Enter an ip address in binary: "); 
    scanf("%s", ip); 
    token = strtok(ip, "."); 
    while (token != NULL)
    { 
        count++; 
        answer = convert(token); 
        sprintf(result, "%d", answer); 
        strcat(string, result); 
        if (count < 4)
        { 
            strcat(string, "."); 
        } 
        token = strtok(NULL, "."); 
    } 
    if (count != 4)
    { 
        printf("Wrong number of octaves"); 
        exit(0); 
    } 
    printf("Your IP in decimal is: %s\n", string); 
}


    