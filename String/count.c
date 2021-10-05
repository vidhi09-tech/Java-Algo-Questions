#include <stdio.h>
void str(){
    char s[20];
    printf("Input a string\n");
    scanf("%[^\n]s\n",s);
    
    int i,c=0;
    for(i=0;s[i]!='\0';i++){
        if((s[i]>=32 && s[i]<=47) || (s[i]>=58 && s[i]<=64) || (s[i]>=91 &&s[i]<=96)
        || (s[i]>=123 && s[i]<=126))
        c++;
    }
    
    printf("%d",c);
    
}
int main()
{
    str();
    

    return 0;
}
