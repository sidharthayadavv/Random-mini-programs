#include <stdio.h>
#include<string.h>
int main(int argv, char *args[]){ 
//printf("%s",args[0]);
printf("%s\n",args[1]);
//printf("%s",args[2]);
printf("%d",argv);
if(strcmp(args[1],"start")){
printf("\nStart your Engine");
}
}
