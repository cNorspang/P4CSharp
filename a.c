#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int RndNum(int to, int from){ return (rand() % (from + 1 - to)) + to;}

struct GENERATED_PLAYER_STRUCT { 
int aaa ;
int yup ;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void Hvidovre(){
char name[255] = "P. I. Smith";
    int bbb = 2*240+23;
    printf("%s%s%s", "Congratulations, ", name, " you managed to get to Hvidovre!"); 
    getchar(); 
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));

    PLAYER_STRUCT.aaa = 1;
    PLAYER_STRUCT.yup = 12200;
    Hvidovre();
    return 0;
}
