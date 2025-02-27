
#include<stdio.h>
int main(){
    int n1, n2, out;
    char op;
    
    printf("select an operator (+,-,*,/) :");
    op=getchar();
    getchar();
    printf("enter two numbers");
    scanf("%d%d", &n1,&n2);
    //op=n1*n2;
    //printf("%d",op);
    //printf("%d%d",n1,n2);
    /*if(op=='+')
        out=n1+n2;
        
    else if(op=='*')
          out=n1*n2;
          else if(op=='/')
          out=n1/n2;
          else if(op== '-')
          out=n1-n2;
          printf("%d",out);*/
    switch (op) {
        case '-':
        out  = n1-n2;
        break;
        case '+':
        out  = n1+n2;
        break;
        case '*':
        out  = n1*n2;
        break;
        case '/':
        out  = n1/n2;
        break;
    } 
    printf("Your Answer is %d",out);
    return 0;
}