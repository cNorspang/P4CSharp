#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int Random_Int_Num(int from, int to){ return (rand() % (to + 1 - from)) + from;}

struct GENERATED_PLAYER_STRUCT { 
int aaa ;
int yup ;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void Hvidovre(){
    char name[256] = "P. I. Smith";
    PLAYER_STRUCT.aaa = Random_Int_Num(5, 6);
    int bbb = 2*240+23;
    if (bbb > 100) {
    strcpy(name, "Herp The Derp");
    }

    printf("%s%s%s%d%s%d", "Congratulations, ", name, " you managed to get to Hvidovre! ", bbb, ", ", PLAYER_STRUCT.aaa); 
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
