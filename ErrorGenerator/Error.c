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
#define clrscr() system("@cls||clear")

int Random_Int_Num(int from, int to){ return (rand() % (to + 1 - from)) + from;}

void COMPILER_TOOL_PRINT_TUI(){
    clrscr();
    printf("##| SWAE TEST |##################################################################\n");
    printf("#################################################################################\n\n");}
void COMPILER_TOOL_EXIT_CHECK(){ printf("\nThank you for playing :)"); exit(0);}

int COMPILER_TOOL_GET_INPUT(int max){
    char pwd; int num; int m = max; printf("\n");
    while (1) {pwd = getch(); if(pwd == 27)
    COMPILER_TOOL_EXIT_CHECK();if (isdigit(pwd)) {num = (int)pwd - 48;  /* b/c ASCII: nums start at 48.*/if (num <= max && num > 0) return num;} pwd = '\0';}}

void COMPILER_TOOL_WAIT_FOR_INPUT(){ printf("\n"); char c = getch(); if(c == 27)
   COMPILER_TOOL_EXIT_CHECK();}

char* COMPILER_TOOL_GET_STRING_INPUT(char * buf){
    char name[50];
    fgets(name, 50, stdin);
    name[strcspn(name, "\r\n")] = 0;
    strncpy(buf, name, 50); 
}


int COMPILER_TOOL_GET_INTERGER_INPUT() {
    char * p, s[100];
    int n; 
    while (fgets(s, sizeof(s), stdin)) 
    {n = strtol(s, &p, 10); 
    if (p == s || *p != '\n') {
    printf("Please enter an integer: ");}
    else break;} return n;}
void DEFINED_LOCATION_FirstLocation();
void DEFINED_LOCATION_SecondLocation();
void DEFINED_LOCATION_EndLocation();

struct GENERATED_PLAYER_STRUCT { 
int health;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void COMPILER_PLAYER_STRUCT_INIT(){
    PLAYER_STRUCT.health =2;}

void DEFINED_LOCATION_FirstLocation(){
    int Integer=2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d", "First integer: ", Integer);
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_SecondLocation();
DEFINED_LOCATION_FirstLocation();
}

void DEFINED_LOCATION_SecondLocation(){
    int Integer=2;
    Integer+=2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d", "Second integer: ", Integer);
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_FirstLocation();
DEFINED_LOCATION_SecondLocation();
}

void DEFINED_LOCATION_EndLocation(){
    char x[256] = "something";
DEFINED_LOCATION_EndLocation();
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));
    COMPILER_PLAYER_STRUCT_INIT();
    DEFINED_LOCATION_FirstLocation();
    return 0;
}
