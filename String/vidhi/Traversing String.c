/******************************************************************************

                            TRAVERSING STRING
Counting Vowels in the string.

*******************************************************************************/

#include <stdio.h>
int str(){
    char s[20];
    printf("Input a string\n");
    scanf("%[^\n]s\n",s);
    printf("your string: \n");
    printf("%s\n",s);
    int i,c=0;
    for(i=0;s[i]!='\0';i++){
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
        c++;
    }
    return c;
}
int main()
{
    int q = str();
    printf("total number of vowels:\n");
    printf("%d",q);

    return 0;
}
