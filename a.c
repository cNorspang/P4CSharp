#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>
#ifdef _WIN32 
#include <conio.h> 
#else// do Unix-specific stuff 
#include <termios.h> 
#include <unistd.h>
    int getch (void){ int ch; struct termios oldt, newt; tcgetattr(STDIN_FILENO, &oldt); newt = oldt; newt.c_lflag &= ~(ICANON|ECHO);
        tcsetattr(STDIN_FILENO, TCSANOW, &newt); ch = getchar(); tcsetattr(STDIN_FILENO, TCSANOW, &oldt); return ch;}
#endif

#define clrscr() printf("\e[1;1H\e[2J")

int Random_Int_Num(int from, int to){ return (rand() % (to + 1 - from)) + from;}

void COMPILER_TOOL_PRINT_TUI(){
    clrscr();
    printf("##| SWAE TEST |##################################################################\n");
    printf("#################################################################################\n\n");}

int COMPILER_TOOL_GET_INPUT(int max){
    char pwd; int num; int m = max; printf("\n");
    while (1) {pwd = getch(); if (isdigit(pwd)) {num = (int)pwd - 48;  /* b/c ASCII: nums start at 48.*/if (num <= max && num > 0) return num;} pwd = '\0';}}

void COMPILER_TOOL_WAIT_FOR_INPUT(){ printf("\n"); char c = getch();}

struct GENERATED_PLAYER_STRUCT { 
char name[256] ;
int aaa ;
int yup ;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void Hvidovre(){
    char name[256] = "P. I. Smith";
    PLAYER_STRUCT.aaa = Random_Int_Num(25, 60);
    int bbb = 2*240+23;
  if (bbb > 100) {
    strcpy(PLAYER_STRUCT.name, "Herp the Derp");
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s%s%d", "Congratulations, ", name, " you managed to get to Hvidovre! ", PLAYER_STRUCT.name, ", ", PLAYER_STRUCT.aaa);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Set health to 1\n2. Reroll Health\n3. See health"); 
    int USER_CHOICE_INPUT = COMPILER_TOOL_GET_INPUT(3);
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));

    strcpy(PLAYER_STRUCT.name, "Herp");
    PLAYER_STRUCT.aaa = 1;
    PLAYER_STRUCT.yup = 12200;
    Hvidovre();
    return 0;
}
