#include <stdio.h>
#include<string.h>
int main()
{
    char ch[30];
    char ch1[] = { 'v','i','d','h','i','\0'};
    printf("input a long string\n");
    scanf("%[^\n]s",ch);
    printf("\nlong string: %s",ch);
    printf("\n");
    printf("short string: %s\n",ch1);
    // getting the length of the string
    printf("length of long string: %ld\n",strlen(ch));
    printf("length of short string: %ld\n",strlen(ch1));
    // copying the string to another string
    printf("Creating another empty string to copy\n");
    char ch2[50];
    strcpy(ch2,ch);
    printf("copied the long string to other string: %s",ch2);
    //concatenating to strings
    strcat(ch,ch1);
    printf("\nnow the long string got change as it is concatenated with short string: \n%s",ch);
    

    return 0;
}

