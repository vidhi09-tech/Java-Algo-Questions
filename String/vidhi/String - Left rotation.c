/******************************************************************************
String - Left rotation
Write a program to accept the string and left rotate the string n times
ex - input: 6  apple
output: pplea
*******************************************************************************/

#include <stdio.h>

int main()
{
    char s[100],temp;
    int len,i,j;
    int n;
    scanf("%d\n",&n);
    scanf("%[^\n]s",s);

    for( len = 0; s[len]!='\0';len++);
    for(j=1;j<=n;j++){
        temp = s[0];
        for(i=0;i<(len-1);i++){
        s[i]=s[i+1];
        s[i+1]=temp;}
        
    }
    printf("%s",s);

    
}
