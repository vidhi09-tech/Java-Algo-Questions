#include<stdio.h>
int main()
{
    char str[100],temp; 
    int  i,j,len,ans;
    scanf("%s",str);
    for(len=0;str[len]!='\0';len++); 
    for(i=0;i<len;i++)  
    {  
        ans=0;
        if(str[i]>=48 && str[i]<=57)   //check number
        {
           temp=str[i-1];  
           while(str[i]>=48 && str[i]<=57)
           {
               ans=ans*10+(str[i]-48); 
               i++;
           }
           for(j=1;j<=ans;j++)  
             printf("%c",temp);
        }
    }
}


