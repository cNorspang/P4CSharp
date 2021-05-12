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

void DEFINED_LOCATION_Start();
void DEFINED_LOCATION_Lokale();
void DEFINED_LOCATION_TheFuckeNing();
void DEFINED_LOCATION_Slottet();
void DEFINED_LOCATION_Hvidovre();
void DEFINED_LOCATION_END_POINT();

struct GENERATED_PLAYER_STRUCT { 
char name[256] ;
int health;
int joints;
bool hasSword ;
bool gotDealer ;
int trollLevel;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void COMPILER_PLAYER_STRUCT_INIT(){
    strcpy(PLAYER_STRUCT.name, "Herp");
    PLAYER_STRUCT.health =30;
    PLAYER_STRUCT.joints =0;
    PLAYER_STRUCT.hasSword = false;
    PLAYER_STRUCT.gotDealer = false;
    PLAYER_STRUCT.trollLevel =0;}

void DEFINED_LOCATION_Start(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You just arrived in the city, the night is comming.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " ~ Hello there traveler! How was the journey? My name is Aslan.\nA bro-ass hippie\nin the street looks at you\n\n~ ...wanna get high?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. fuck. yeah. (+1 joint)"); 

    printf("\n2. nah"); 

    int USER_CHOICE_INPUT_pdln0fM = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_pdln0fM == 1){
    PLAYER_STRUCT.joints+=1;
  }

  if (USER_CHOICE_INPUT_pdln0fM == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "..aight cool. Goodnight then.\n\nIf you need a bed try Hvidovre");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Hvidovre();
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Cool! let\'s go to the bar over there. Looks like they are smoking inside.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The bar is lively, people are cheering.\nThe hippie goes towards the bar while\nlighting one.\nYou see a women of the night standing in a door.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Lokale();
DEFINED_LOCATION_Start();
}

void DEFINED_LOCATION_Lokale(){

    printf("\n1. Go to the lady"); 

  if (PLAYER_STRUCT.gotDealer == false) printf("\n2. Find the Hippie in the bar"); 

  if (PLAYER_STRUCT.gotDealer) printf("\n3. Smoke with Hippie"); 

    printf("\n4. See what the noise in the back is."); 

    int USER_CHOICE_INPUT_bds8MsG3 = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_bds8MsG3 == 1){

DEFINED_LOCATION_TheFuckeNing();
  }

 if (PLAYER_STRUCT.gotDealer == false){

  if (USER_CHOICE_INPUT_bds8MsG3 == 2){
    PLAYER_STRUCT.gotDealer = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You find the Hippie in the bar.\n~ hey friend, I got some joints when you are\nready");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 } else if (USER_CHOICE_INPUT_bds8MsG3 == 2) { USER_CHOICE_INPUT_bds8MsG3 = 3; } 

 if (PLAYER_STRUCT.gotDealer){

  if (USER_CHOICE_INPUT_bds8MsG3 == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Hippie sees you.\n~ yo, the deal is blood for ju\nyou in?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. sure"); 

    printf("\n2. nah im good"); 

    int USER_CHOICE_INPUT_ASFnULJ2 = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_ASFnULJ2 == 1){
    PLAYER_STRUCT.health-=5;
    PLAYER_STRUCT.joints+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "He grabs your arm and bites you!\n~ Thanks man, here you go\n\nHe hands you\na ju");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_ASFnULJ2 == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Cool. you ");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

 } else if (USER_CHOICE_INPUT_bds8MsG3 == 3) { USER_CHOICE_INPUT_bds8MsG3 = 4; } 

  if (USER_CHOICE_INPUT_bds8MsG3 == 4){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Welp its a troll.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Slottet();
  }

DEFINED_LOCATION_Lokale();
}

void DEFINED_LOCATION_TheFuckeNing(){
    int i=0;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A large women stands in the doorway\n~ Hello there boo\nShe stares at you. ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. ma\'lady ;)"); 

    printf("\n2. uhm.. what?"); 

    int USER_CHOICE_INPUT_G8cxO78F = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_G8cxO78F == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "She drags you in..");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Throws herself on the bed");
    COMPILER_TOOL_WAIT_FOR_INPUT();

  while(i<=4) {

    printf("\n1. Spank"); 

    printf("\n2. Slap"); 

    printf("\n3. Dap"); 

    printf("\n4. Nap"); 

    int USER_CHOICE_INPUT_DVYiMNBH = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_DVYiMNBH == 1){
    i+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*BOING*");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_DVYiMNBH == 2){
    i+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*YAP*");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_DVYiMNBH == 3){
    i+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*DAP*");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_DVYiMNBH == 4){
    i+=1;
    PLAYER_STRUCT.health+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You nap beside the women. You regain 1 Hp");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "She start peeing and you rush out into the bar..\n\n...On the way out you grab\na sword from behind a dresser.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.hasSword = true;
  }

  if (USER_CHOICE_INPUT_G8cxO78F == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " ~ Not a man of the night, I see. \nShe turn around..");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


DEFINED_LOCATION_Lokale();
DEFINED_LOCATION_TheFuckeNing();
}

void DEFINED_LOCATION_Slottet(){
    int enemy_health=42+PLAYER_STRUCT.trollLevel*5;
    bool flag = true;

  while(flag) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d%s%d", "Your HP: ", PLAYER_STRUCT.health, "(jays:", PLAYER_STRUCT.joints, ") Troll HP:\n", enemy_health);
    COMPILER_TOOL_WAIT_FOR_INPUT();
    int roll=Random_Int_Num(6, 14);
    int lroll=roll+6;

    printf("\n1. Attack with Staff"); 

  if (PLAYER_STRUCT.joints > 0) printf("\n2. Smoke Health Potion"); 

  if (PLAYER_STRUCT.hasSword) printf("\n3. Swing your Sword!"); 

    int USER_CHOICE_INPUT_Z4DQfoP4 = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_Z4DQfoP4 == 1){
    enemy_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You attack for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 if (PLAYER_STRUCT.joints > 0){

  if (USER_CHOICE_INPUT_Z4DQfoP4 == 2){
    PLAYER_STRUCT.health+=15;
    PLAYER_STRUCT.joints-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "420 baby! 15 Health healed");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 } else if (USER_CHOICE_INPUT_Z4DQfoP4 == 2) { USER_CHOICE_INPUT_Z4DQfoP4 = 3; } 

 if (PLAYER_STRUCT.hasSword){

  if (USER_CHOICE_INPUT_Z4DQfoP4 == 3){
    enemy_health-=lroll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You attack for ", lroll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 } else if (USER_CHOICE_INPUT_Z4DQfoP4 == 3) { USER_CHOICE_INPUT_Z4DQfoP4 = 4; } 

  if (enemy_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The troll falls over, it is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you! The Troll had 6 jays in his stash, score!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.joints+=6;

DEFINED_LOCATION_Hvidovre();
  }

    int enemychoice=Random_Int_Num(1, 2);
  if (enemychoice == 1) {
    int enemyDamage=Random_Int_Num(8+PLAYER_STRUCT.trollLevel*2, 15+PLAYER_STRUCT.trollLevel*2);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Enemy attacks you with his greatclub for ", enemyDamage, " damage!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health-=enemyDamage;
  }
  else if (enemychoice == 2) {
    int enemyHeals=Random_Int_Num(4+PLAYER_STRUCT.trollLevel*2, 8+PLAYER_STRUCT.trollLevel*2);

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
    printf("%s%s%s%d%s%d%s%d", "Congratulations, ", PLAYER_STRUCT.name, " you managed to get to the debug menu!\nHp:\n", PLAYER_STRUCT.health, " Jays: ", PLAYER_STRUCT.joints, " TrollLvl: ", PLAYER_STRUCT.trollLevel);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Set health to 1"); 

    printf("\n2. Reroll Health"); 

    printf("\n3. Toggle Sword"); 

    printf("\n4. level up troll"); 

    printf("\n5. level down troll"); 

    printf("\n6. get jay"); 

    printf("\n7. lose jay"); 

    printf("\n8. Goto Lokale"); 

    int USER_CHOICE_INPUT_1VOxLLqA = COMPILER_TOOL_GET_INPUT(8);

  if (USER_CHOICE_INPUT_1VOxLLqA == 1){
    PLAYER_STRUCT.health=1;
  }

  if (USER_CHOICE_INPUT_1VOxLLqA == 2){
    PLAYER_STRUCT.health=Random_Int_Num(2, 100);
  }

  if (USER_CHOICE_INPUT_1VOxLLqA == 3){
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

  if (USER_CHOICE_INPUT_1VOxLLqA == 4){
    PLAYER_STRUCT.trollLevel+=1;
  }

  if (USER_CHOICE_INPUT_1VOxLLqA == 5){
    PLAYER_STRUCT.trollLevel-=1;
  }

  if (USER_CHOICE_INPUT_1VOxLLqA == 6){
    PLAYER_STRUCT.joints+=1;
  }

  if (USER_CHOICE_INPUT_1VOxLLqA == 7){
    PLAYER_STRUCT.joints-=1;
  }

  if (USER_CHOICE_INPUT_1VOxLLqA == 8){

DEFINED_LOCATION_Lokale();
  }

DEFINED_LOCATION_Hvidovre();
}

void DEFINED_LOCATION_END_POINT(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "END");
    COMPILER_TOOL_WAIT_FOR_INPUT();
DEFINED_LOCATION_END_POINT();
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));
    COMPILER_PLAYER_STRUCT_INIT();
    DEFINED_LOCATION_Start();
    return 0;
}
