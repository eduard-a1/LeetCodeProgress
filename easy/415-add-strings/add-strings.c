#include <string.h>
#include <math.h>
#include <stdlib.h>

char* addStrings(char* num1, char* num2) {

    int len = strlen(num1) >= strlen(num2) ? strlen(num1) : strlen(num2);
    
    char *total = malloc(len+2 * sizeof(char));

    if(!total)
        return NULL;
    
    int i = strlen(num1) -1;
    int j = strlen(num2) -1;
    int carry = 0;
    int k = 0;
    int sum;

    while(i >= 0 || j >= 0 || carry == 1){

        int number1 = i >= 0 ? num1[i] - '0' : 0;
        int number2 = j >= 0 ? num2[j] - '0' : 0;

        i--;
        j--;

        sum = number1 + number2 + carry;
        total[k++] = (sum % 10) + 48;
        carry = sum / 10;
    }

    printf("%d\n", k);

    total[k] = '\0';
    
    printf("%s\n", total);

    for(int left = 0, right = k - 1; left <= right; left++, right--){
        char temp = total[left];
        total[left] = total[right];
        total[right] = temp;
    }


    return total;
}
