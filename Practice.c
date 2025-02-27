#include <stdio.h>
int z = 8;
int main() {

    extern int a;
    printf("%d",a);
    return 0;
}
int a=9;
