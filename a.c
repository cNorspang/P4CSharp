#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>
#include <stdbool.h>
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
bool hasSword ;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void COMPILER_PLAYER_STRUCT_INIT(){
    strcpy(PLAYER_STRUCT.name, "Herp");
    PLAYER_STRUCT.aaa = 67;
    PLAYER_STRUCT.yup = 12200;
    PLAYER_STRUCT.hasSword = false;}

void DEFINED_LOCATION_Hvidovre(){
    char namem[256] = "P. I. Smith";
    int bbb = 0;
    bbb += 101;
  if (bbb > 100) {
    strcpy(PLAYER_STRUCT.name, "Herp the Derp");
  }
  else {
    PLAYER_STRUCT.aaa = bbb;
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s%d", "Congratulations, ", PLAYER_STRUCT.name, " you managed to get to Hvidovre! ", ", ", PLAYER_STRUCT.aaa);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Set health to 1\n2. Reroll Health\n3. See health\n4. Get Sword"); 
    int USER_CHOICE_INPUT = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT == 1){
    PLAYER_STRUCT.aaa = 1;
  }
  else if (USER_CHOICE_INPUT == 2){
    PLAYER_STRUCT.aaa = Random_Int_Num(2, 100);
  }
  else if (USER_CHOICE_INPUT == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%d%s", PLAYER_STRUCT.name, " has ", PLAYER_STRUCT.aaa, " HP left");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }
  else if (USER_CHOICE_INPUT == 4){
  if (PLAYER_STRUCT.hasSword == false) {
    PLAYER_STRUCT.hasSword = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Sword gained yay");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }
  else {
    PLAYER_STRUCT.hasSword = false;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Aaaand its gone...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

DEFINED_LOCATION_Hvidovre();
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));
    COMPILER_PLAYER_STRUCT_INIT();
    DEFINED_LOCATION_Hvidovre();
    return 0;
}
