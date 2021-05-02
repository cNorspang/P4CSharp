#include <stdio.h>
#include <stdlib.h>

struct GENERATED_PLAYER_STRUCT { 
    int x;
};
struct GENERATED_PLAYER_STRUCT xCarier;

void locationOne(){
    printf("\nlocation One");
}

int main(void){
    xCarier.x = 10;
    printf("%d", xCarier.x);
    locationOne();
    return 0;
}