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
void DEFINED_LOCATION_DragonFight();
void DEFINED_LOCATION_Hvidovre();
void DEFINED_LOCATION_END_POINT();

struct GENERATED_PLAYER_STRUCT { 
char name[256] ;
int health;
int joints;
bool hasSword ;
bool gotDealer ;
int trollLevel;
bool regular_sword ;
int regular_sword_damage;
bool THE_GREAT_SWORD_OF_THE_OLD_ONE ;
int THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE;
bool GreatSwordReady ;
bool Boost_of_internal_power_for_one_attack ;
int The_dragon_of_smaguron_health;
int The_dragon_of_smaguron_damage;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void COMPILER_PLAYER_STRUCT_INIT(){
    strcpy(PLAYER_STRUCT.name, "Herp");
    PLAYER_STRUCT.health =30;
    PLAYER_STRUCT.joints =0;
    PLAYER_STRUCT.hasSword = false;
    PLAYER_STRUCT.gotDealer = false;
    PLAYER_STRUCT.trollLevel =0;
    PLAYER_STRUCT.regular_sword = false;
    PLAYER_STRUCT.regular_sword_damage =10;
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = false;
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE =50;
    PLAYER_STRUCT.GreatSwordReady = false;
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = false;
    PLAYER_STRUCT.The_dragon_of_smaguron_health =1000;
    PLAYER_STRUCT.The_dragon_of_smaguron_damage =10;}

void DEFINED_LOCATION_Start(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You just arrived in the city, the night is comming.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " ~ Hello there traveler! How was the journey? My name is Aslan.\n A bro-ass hippie in the street looks at you\n\n ~ ...wanna get high?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. fuck. yeah. (+1 joint)"); 

    printf("\n2. nah"); 

    int USER_CHOICE_INPUT_Cf24G9mD = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_Cf24G9mD == 1){
    PLAYER_STRUCT.joints+=1;
  }

  if (USER_CHOICE_INPUT_Cf24G9mD == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "..aight cool. Goodnight then.\n\n If you need a bed try Hvidovre");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Hvidovre();
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Cool! let's go to the bar over there. Looks like they are smoking inside.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The bar is lively, people are cheering.\n The hippie goes towards the bar while lighting one.\n You see a women of the night standing in a door.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Lokale();
DEFINED_LOCATION_Start();
}

void DEFINED_LOCATION_Lokale(){

    printf("\n1. Go to the lady"); 

  if (PLAYER_STRUCT.gotDealer == false) printf("\n2. Find the Hippie in the bar"); 

  if (PLAYER_STRUCT.gotDealer) printf("\n3. Smoke with Hippie"); 

    printf("\n4. See what the noise in the back is."); 

    int USER_CHOICE_INPUT_TUSDEvz9 = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_TUSDEvz9 == 1){

DEFINED_LOCATION_TheFuckeNing();
  }

 if (PLAYER_STRUCT.gotDealer == false){

  if (USER_CHOICE_INPUT_TUSDEvz9 == 2){
    PLAYER_STRUCT.gotDealer = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You find the Hippie in the bar.\n ~ hey friend, I got some joints when you are ready");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 } else if (USER_CHOICE_INPUT_TUSDEvz9 == 2) { USER_CHOICE_INPUT_TUSDEvz9 = 3; } 

 if (PLAYER_STRUCT.gotDealer){

  if (USER_CHOICE_INPUT_TUSDEvz9 == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Hippie sees you.\n ~ yo, the deal is blood for ju\n you in?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. sure"); 

    printf("\n2. nah im good"); 

    int USER_CHOICE_INPUT_OuDs43tU = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_OuDs43tU == 1){
    PLAYER_STRUCT.health-=5;
    PLAYER_STRUCT.joints+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "He grabs your arm and bites you!\n ~ Thanks man, here you go\n\nHe hands you a ju");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_OuDs43tU == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Cool. you ");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

 } else if (USER_CHOICE_INPUT_TUSDEvz9 == 3) { USER_CHOICE_INPUT_TUSDEvz9 = 4; } 

  if (USER_CHOICE_INPUT_TUSDEvz9 == 4){

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
    printf("%s", "A large women stands in the doorway\n ~ Hello there boo\nShe stares at you. ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. ma'lady ;)"); 

    printf("\n2. uhm.. what?"); 

    int USER_CHOICE_INPUT_0hcH7eC = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_0hcH7eC == 1){

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

    int USER_CHOICE_INPUT_nlatAyXO = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_nlatAyXO == 1){
    i+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*BOING*");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_nlatAyXO == 2){
    i+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*YAP*");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_nlatAyXO == 3){
    i+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*DAP*");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_nlatAyXO == 4){
    i+=1;
    PLAYER_STRUCT.health+=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You nap beside the women. You regain 1 Hp");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "She start peeing and you rush out into the bar..\n\n...On the way out you grab a sword from behind a dresser.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.hasSword = true;
  }

  if (USER_CHOICE_INPUT_0hcH7eC == 2){

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
    printf("%s%d%s%d%s%d", "Your HP: ", PLAYER_STRUCT.health, "(jays:", PLAYER_STRUCT.joints, ")   Troll HP: ", enemy_health);
    COMPILER_TOOL_WAIT_FOR_INPUT();
    int roll=Random_Int_Num(6, 14);
    int lroll=roll+6;

    printf("\n1. Attack with Staff"); 

  if (PLAYER_STRUCT.joints > 0) printf("\n2. Smoke Health Potion"); 

  if (PLAYER_STRUCT.hasSword) printf("\n3. Swing your Sword!"); 

    int USER_CHOICE_INPUT_z47Ws38c = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_z47Ws38c == 1){
    enemy_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You attack for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 if (PLAYER_STRUCT.joints > 0){

  if (USER_CHOICE_INPUT_z47Ws38c == 2){
    PLAYER_STRUCT.health+=15;
    PLAYER_STRUCT.joints-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "420 baby! 15 Health healed");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 } else if (USER_CHOICE_INPUT_z47Ws38c == 2) { USER_CHOICE_INPUT_z47Ws38c = 3; } 

 if (PLAYER_STRUCT.hasSword){

  if (USER_CHOICE_INPUT_z47Ws38c == 3){
    enemy_health-=lroll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You attack for ", lroll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

 } else if (USER_CHOICE_INPUT_z47Ws38c == 3) { USER_CHOICE_INPUT_z47Ws38c = 4; } 

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

void DEFINED_LOCATION_DragonFight(){
    int dragonLevel=0;
    bool flag = true;

  while(flag) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "Your HP: ", PLAYER_STRUCT.health, "   Dragon HP: ", PLAYER_STRUCT.The_dragon_of_smaguron_health);
    COMPILER_TOOL_WAIT_FOR_INPUT();
    int roll=0;

    printf("\n1. Leave ->"); 

    printf("\n2. Bonk with stick!"); 

  if (PLAYER_STRUCT.regular_sword) printf("\n3. Swing your Sword!"); 

  if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == false) printf("\n4. Ready the Great Old Sword."); 

  if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == true) printf("\n5. Attack with the Great old Sword!"); 

    int USER_CHOICE_INPUT_BtpdDjS4 = COMPILER_TOOL_GET_INPUT(5);

  if (USER_CHOICE_INPUT_BtpdDjS4 == 1){

DEFINED_LOCATION_Hvidovre();
  }

  if (USER_CHOICE_INPUT_BtpdDjS4 == 2){
    roll=Random_Int_Num(3, 8);
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You Bonk the *Dragon* for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
  }

 if (PLAYER_STRUCT.regular_sword){

  if (USER_CHOICE_INPUT_BtpdDjS4 == 3){
    roll=Random_Int_Num(PLAYER_STRUCT.regular_sword_damage-3, PLAYER_STRUCT.regular_sword_damage+3);
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You Swing your Sword for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
  }

 } else if (USER_CHOICE_INPUT_BtpdDjS4 == 3) { USER_CHOICE_INPUT_BtpdDjS4 = 4; } 

 if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == false){

  if (USER_CHOICE_INPUT_BtpdDjS4 == 4){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "When hand comes to hilt, question comes to heart, from soul is given heaven's answer\n via either divine balancing scale or sword.", "For there is either hope, or there is not,\n and one way or another, suffering must end.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = true;
  }

 } else if (USER_CHOICE_INPUT_BtpdDjS4 == 4) { USER_CHOICE_INPUT_BtpdDjS4 = 5; } 

 if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == true){

  if (USER_CHOICE_INPUT_BtpdDjS4 == 5){
    roll=Random_Int_Num(PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE-13, PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE+13);
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%d%s", "You wield the Sword with might!\nand it slices through the dragon like a hot knife through butter.\n\n", "You attack for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
  }

 } else if (USER_CHOICE_INPUT_BtpdDjS4 == 5) { USER_CHOICE_INPUT_BtpdDjS4 = 6; } 

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The deed is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Hvidovre();
  }

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health < 200 && Random_Int_Num(1, 3) == 3) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Dragon gets angry, it is fighing for its life.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Go for the Execute."); 

    printf("\n2. Not yet"); 

    int USER_CHOICE_INPUT_Sz9FnGRT = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_Sz9FnGRT == 1){
  if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You rush towards the dragon\n\nIt fears you.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You Slice your Great Old Sword through the dragons skull.\nIt screams.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health=0;
  }
  else if (Random_Int_Num(1, 4) == 4) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You rush towards the dragon\n\nIt gets ready.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "By a true miracle you piece the dragons scales.\n\nYou got it good.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health=0;
  }
  else {
    roll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage, PLAYER_STRUCT.The_dragon_of_smaguron_damage+15+dragonLevel);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You rush towards the beast!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You hit it but the scales stopped your weapon.\n\nIt spits fire at you for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health-=roll;
  }

  }

  if (USER_CHOICE_INPUT_Sz9FnGRT == 2){
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=1;
  }

  }
  else if (Random_Int_Num(1, 5) == 5) {
    roll=Random_Int_Num(PLAYER_STRUCT.regular_sword_damage+5, PLAYER_STRUCT.regular_sword_damage+10);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Dragon turns its back. you see your chance\n\nDo you take it?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Run and jump onto the back of the dragon!"); 

    printf("\n2. Catch your breath instead"); 

    int USER_CHOICE_INPUT_XPVAjOqe = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_XPVAjOqe == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You slice open a fresh wound and deal ", roll, " damage");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;
  }

  if (USER_CHOICE_INPUT_XPVAjOqe == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You catch your breath and feel the second wind.\n\nJust in time for the dragon again facing you");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=1;
  }

  }

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The deed is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Hvidovre();
  }

    int enemychoice=Random_Int_Num(1, 3);
int enemyRoll;
  if (enemychoice == 1) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage-10, PLAYER_STRUCT.The_dragon_of_smaguron_damage+10);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Dragon bites you for ", enemyRoll, " damage!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health-=enemyRoll;
  }
  else if (enemychoice == 2) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage-PLAYER_STRUCT.The_dragon_of_smaguron_damage*2, 8+PLAYER_STRUCT.The_dragon_of_smaguron_damage*2)+dragonLevel*3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Dragon recites an ancient melody\nIts lifeforce has changed by ", enemyRoll, " health");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health+=enemyRoll;
  }
  else if (enemychoice == 3) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage, PLAYER_STRUCT.The_dragon_of_smaguron_damage+5)+dragonLevel*2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Dragon spits fire in a cone\n\nYou are hit for ", enemyRoll, " damage");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health-=enemyRoll;
  }

  if (PLAYER_STRUCT.health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "you dead boi");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.health=1;

DEFINED_LOCATION_Hvidovre();
  }

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The deed is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Hvidovre();
  }


  }

DEFINED_LOCATION_DragonFight();
}

void DEFINED_LOCATION_Hvidovre(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%d%s%d%s%d", "Congratulations, ", PLAYER_STRUCT.name, " you managed to get to the debug menu!\nHp: ", PLAYER_STRUCT.health, "   Jays: ", PLAYER_STRUCT.joints, "   TrollLvl: ", PLAYER_STRUCT.trollLevel);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Set health to 1"); 

    printf("\n2. Reroll Health"); 

    printf("\n3. Toggle Sword"); 

    printf("\n4. level up troll"); 

    printf("\n5. level down troll"); 

    printf("\n6. get jay"); 

    printf("\n7. lose jay"); 

    printf("\n8. Goto Lokale"); 

    printf("\n9. dragonfight Menu"); 

    int USER_CHOICE_INPUT_6gbtrMcT = COMPILER_TOOL_GET_INPUT(9);

  if (USER_CHOICE_INPUT_6gbtrMcT == 1){
    PLAYER_STRUCT.health=1;
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 2){
    PLAYER_STRUCT.health=Random_Int_Num(2, 100);
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 3){
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

  if (USER_CHOICE_INPUT_6gbtrMcT == 4){
    PLAYER_STRUCT.trollLevel+=1;
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 5){
    PLAYER_STRUCT.trollLevel-=1;
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 6){
    PLAYER_STRUCT.joints+=1;
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 7){
    PLAYER_STRUCT.joints-=1;
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 8){

DEFINED_LOCATION_Lokale();
  }

  if (USER_CHOICE_INPUT_6gbtrMcT == 9){

    printf("\n1. <- back"); 

    printf("\n2. Toggle regular sword"); 

    printf("\n3. Toggle Great Sword"); 

    printf("\n4. Goto DragonFight"); 

    int USER_CHOICE_INPUT_bYtSxhdC = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_bYtSxhdC == 1){
    int i=0;
  }

  if (USER_CHOICE_INPUT_bYtSxhdC == 2){
  if (PLAYER_STRUCT.regular_sword == false) {
    PLAYER_STRUCT.regular_sword = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Regular Sword gained yay");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }
  else {
    PLAYER_STRUCT.regular_sword = false;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Aaaand its gone...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

  if (USER_CHOICE_INPUT_bYtSxhdC == 3){
  if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE == false) {
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Great Sword gained yay");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }
  else {
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = false;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Aaaand its gone...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

  if (USER_CHOICE_INPUT_bYtSxhdC == 4){

DEFINED_LOCATION_DragonFight();
  }

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
