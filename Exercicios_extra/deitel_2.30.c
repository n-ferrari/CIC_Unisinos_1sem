//Separating digits in an integer
#include<stdio.h>

int main()
{
    int n, int_div, remainder;

    printf("Enter an integer with 5 digits ");
    scanf("%i", &n);

    remainder = n % 10000;
    int_div = n / 10000;

    printf("%i ", int_div);

    int_div = remainder / 1000;
    remainder = remainder % 1000;

    printf("%i ", int_div);

    int_div = remainder / 100;
    remainder = remainder % 100;

    printf("%i ", int_div);

    int_div = remainder / 10; 
    remainder = remainder % 10; 

    printf("%i ", int_div);
    printf("%i ", remainder);        

}