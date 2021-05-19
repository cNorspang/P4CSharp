#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void Init(){
    time_t t;
   /* Intializes random number generator */
   srand((unsigned) time(&t));
}

int RndNum(int from, int to){
    return (rand() % (to + 1 - from)) + from;
}

int main () {
   int i;

   Init();
   /* Print 5 random numbers from 0 to 49 */
   for( i = 0 ; i < 10 ; i++ ) {
      printf("%d\n", RndNum(10, 20));
    }
   
   return(0);
}
/*
srand((unsigned)time(NULL));

int RndNum(int to, int from){
    int rNum = rand();
    return (rNum % (from - to)) + to;
}

int main(){
    for (int i = 0; i < 10; i++)
    {
        printf("%d. %d", i, RndNum(10, 20));
    }
    return 0;
}
*/