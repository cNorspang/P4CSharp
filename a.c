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
void DEFINED_LOCATION_Start();
void DEFINED_LOCATION_Lokale();
void DEFINED_LOCATION_TheFuckeNing();
void DEFINED_LOCATION_Slottet();
void DEFINED_LOCATION_Hvidovre();

struct GENERATED_PLAYER_STRUCT { 
char name[256] ;
int health;
int joints;
bool hasSword ;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void COMPILER_PLAYER_STRUCT_INIT(){
    strcpy(PLAYER_STRUCT.name, "Herp");
    PLAYER_STRUCT.health =30;
    PLAYER_STRUCT.joints =0;
    PLAYER_STRUCT.hasSword = false;}

void DEFINED_LOCATION_Start(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Hello there traveler! How was the journey? My name is Aslan.\n\n so... wanna get high?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. fuck. yeah. (+1 joint)"); 

    printf("\n2. nah"); 

    int USER_CHOICE_INPUT = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT == 1){
    PLAYER_STRUCT.joints+=1;
  }

  if (USER_CHOICE_INPUT == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "..aight cool. Goodnight then.\n\n If you need a bed try Hvidovre");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Hvidovre();
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Cool! let's go to the bar over there. Looks like they are smoking inside.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Lokale();
DEFINED_LOCATION_Start();
}

void DEFINED_LOCATION_Lokale(){

DEFINED_LOCATION_Slottet();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "STOP");
    COMPILER_TOOL_WAIT_FOR_INPUT();
DEFINED_LOCATION_Lokale();
}

void DEFINED_LOCATION_TheFuckeNing(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "STOP");
    COMPILER_TOOL_WAIT_FOR_INPUT();
DEFINED_LOCATION_TheFuckeNing();
}

void DEFINED_LOCATION_Slottet(){
    int enemy_health=42;
    bool flag = true;

  while(flag) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d%s%d", "Your HP: ", PLAYER_STRUCT.health, "(jays:", PLAYER_STRUCT.joints, ")   Troll HP: ", enemy_health);
    COMPILER_TOOL_WAIT_FOR_INPUT();
    int roll=Random_Int_Num(3, 8);

    printf("\n1. Attack with Staff"); 

  if (PLAYER_STRUCT.joints > 0) printf("\n2. Smoke Health Potion"); 

    int USER_CHOICE_INPUT = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT == 1){
    enemy_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You attack for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 if (PLAYER_STRUCT.joints > 0){

  if (USER_CHOICE_INPUT == 2){
    PLAYER_STRUCT.health+=15;
    PLAYER_STRUCT.joints-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "420 baby! 15 Health healed");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 }

  if (enemy_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you! The Troll had 6 jays in his stash, score!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.joints+=6;

DEFINED_LOCATION_Hvidovre();
  }

    int enemychoice=Random_Int_Num(1, 2);
  if (enemychoice == 1) {
    int enemyDamage=Random_Int_Num(1, 5);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Enemy attacks you with his greatclub for ", enemyDamage, " damage!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health-=enemyDamage;
  }
  else if (enemychoice == 2) {
    int enemyHeals=Random_Int_Num(1, 2);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The enemy heals for ", enemyHeals, " health");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    enemy_health+=enemyHeals;
  }

  if (PLAYER_STRUCT.health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "you dead boi");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health=1;

DEFINED_LOCATION_Lokale();
  }


  }

DEFINED_LOCATION_Slottet();
}

void DEFINED_LOCATION_Hvidovre(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s", "Congratulations, ", PLAYER_STRUCT.name, " you managed to get to Hvidovre!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Set health to 1"); 

    printf("\n2. Reroll Health"); 

    printf("\n3. See health"); 

    printf("\n4. Get Sword"); 

    int USER_CHOICE_INPUT = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT == 1){
    PLAYER_STRUCT.health=1;
  }

  if (USER_CHOICE_INPUT == 2){
    PLAYER_STRUCT.health=Random_Int_Num(2, 100);
  }

  if (USER_CHOICE_INPUT == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%d%s", PLAYER_STRUCT.name, " has ", PLAYER_STRUCT.health, " HP left");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT == 4){
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
    DEFINED_LOCATION_Start();
    return 0;
}
