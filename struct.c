#include<stdio.h>
struct emp{
    char * n;
    int a;
    int sal;
};
int main()
{
    struct emp new;
    new.a=89;
    new.sal=980000;
    new.n="pankaj";
    puts(new.n);
    printf("%d\t%d",new.a,new.sal);
    return 0;
}