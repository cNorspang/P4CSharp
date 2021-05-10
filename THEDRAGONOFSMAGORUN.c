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

void DEFINED_LOCATION_DebugMenu();
void DEFINED_LOCATION_The_local_pub();
void DEFINED_LOCATION_Garden();
void DEFINED_LOCATION_Bar();
void DEFINED_LOCATION_GamblingTable();
void DEFINED_LOCATION_Street();
void DEFINED_LOCATION_Forrest();
void DEFINED_LOCATION_Field();
void DEFINED_LOCATION_Shop();
void DEFINED_LOCATION_Old_Castle();
void DEFINED_LOCATION_Bed_Room();
void DEFINED_LOCATION_Basement();
void DEFINED_LOCATION_Dining_Room();
void DEFINED_LOCATION_House();
void DEFINED_LOCATION_FightTheDragon();
void DEFINED_LOCATION_TheEnd();
void DEFINED_LOCATION_DeathEnd();

struct GENERATED_PLAYER_STRUCT { 
char name[256] ;
int Health_point;
int Gold;
int bandage_amount;
int bandage_health;
int potion_amount;
int potion_health;
int counter;
bool regular_sword ;
int regular_sword_damage;
bool THE_GREAT_SWORD_OF_THE_OLD_ONE ;
int THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE;
bool GreatSwordReady ;
bool Boost_of_internal_power_for_one_attack ;
int The_dragon_of_smaguron_health;
int The_dragon_of_smaguron_damage;
bool CanLeaveBar ;
bool VisitedBar ;
bool VisitedCastle ;
bool VisitedShop ;
bool VisitedGarden ;
bool VisitedForrest ;
bool VisitedField ;
bool VisitedDining_Room_first ;
bool VisitedDining_Room_Second ;
};
struct GENERATED_PLAYER_STRUCT PLAYER_STRUCT;

void COMPILER_PLAYER_STRUCT_INIT(){
    strcpy(PLAYER_STRUCT.name, "Geralt of Revia");
    PLAYER_STRUCT.Health_point =100;
    PLAYER_STRUCT.Gold =10;
    PLAYER_STRUCT.bandage_amount =0;
    PLAYER_STRUCT.bandage_health =21;
    PLAYER_STRUCT.potion_amount =0;
    PLAYER_STRUCT.potion_health =100;
    PLAYER_STRUCT.counter =0;
    PLAYER_STRUCT.regular_sword = false;
    PLAYER_STRUCT.regular_sword_damage =10;
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = false;
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE =50;
    PLAYER_STRUCT.GreatSwordReady = false;
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = false;
    PLAYER_STRUCT.The_dragon_of_smaguron_health =1000;
    PLAYER_STRUCT.The_dragon_of_smaguron_damage =10;
    PLAYER_STRUCT.CanLeaveBar = false;
    PLAYER_STRUCT.VisitedBar = false;
    PLAYER_STRUCT.VisitedCastle = false;
    PLAYER_STRUCT.VisitedShop = false;
    PLAYER_STRUCT.VisitedGarden = false;
    PLAYER_STRUCT.VisitedForrest = false;
    PLAYER_STRUCT.VisitedField = false;
    PLAYER_STRUCT.VisitedDining_Room_first = false;
    PLAYER_STRUCT.VisitedDining_Room_Second = false;}

void DEFINED_LOCATION_DebugMenu(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Welcome to the debug menu");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Start game"); 

    printf("\n2. Travel"); 

    int USER_CHOICE_INPUT_2mYLcdU = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_2mYLcdU == 1){

DEFINED_LOCATION_The_local_pub();
  }

  if (USER_CHOICE_INPUT_2mYLcdU == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Forrest"); 

    printf("\n2. Street"); 

    printf("\n3. Field"); 

    printf("\n4. Old_Castle"); 

    printf("\n5. Bed_Room"); 

    printf("\n6. FightTheDragon"); 

    printf("\n7. House"); 

    printf("\n8. TheEnd"); 

    printf("\n9. DeathEnd"); 

    int USER_CHOICE_INPUT_ASqQhET = COMPILER_TOOL_GET_INPUT(9);

  if (USER_CHOICE_INPUT_ASqQhET == 1){

DEFINED_LOCATION_Forrest();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 2){

DEFINED_LOCATION_Street();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 3){

DEFINED_LOCATION_Field();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 4){

DEFINED_LOCATION_Old_Castle();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 5){

DEFINED_LOCATION_Bed_Room();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 6){

DEFINED_LOCATION_FightTheDragon();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 7){

DEFINED_LOCATION_House();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 8){

DEFINED_LOCATION_TheEnd();
  }

  if (USER_CHOICE_INPUT_ASqQhET == 9){

DEFINED_LOCATION_DeathEnd();
  }

  }

DEFINED_LOCATION_DebugMenu();
}

void DEFINED_LOCATION_The_local_pub(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s", "PUB OWNER: Hello there... You cannot be in here all day... You have to move soon\n", PLAYER_STRUCT.name, ". There is trouble incomming and I dont want my pub to\nbe destroyed...", "like last time...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Leave me be, if it is my time to die on this pub so be it..."); 

    printf("\n2. AAHHHHH!!!!!!!!!!!!!!... You dont have to yell, mom (drunk noice) BURP..."); 

    printf("\n3. Im sorry my old friend... i will be moving soon, just going to the bar"); 

    int USER_CHOICE_INPUT_gBjmW3RS = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_gBjmW3RS == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s", "PUB OWNER: dammit", PLAYER_STRUCT.name, " You HAVE to move... ", "Either you\ngo on the street or go to the bar for the last beer... THEN move");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. HMMMMMMMM.... (rising up for going to the bar)"); 

    printf("\n2. HMMMMMMMM.... (rising up for going on the street)"); 

    int USER_CHOICE_INPUT_296ifWZG = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_296ifWZG == 1){

DEFINED_LOCATION_Bar();
  }

  if (USER_CHOICE_INPUT_296ifWZG == 2){

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_gBjmW3RS == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "\'HELPFUL\' GUY: So drunk he would not even notice... HEHE");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "God forsaken... This man is so drunk he cant even tell im his mother or not");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Throw him into the garden... then he can move himself from there...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Garden();
  }

  if (USER_CHOICE_INPUT_gBjmW3RS == 3){

DEFINED_LOCATION_Bar();
  }

DEFINED_LOCATION_The_local_pub();
}

void DEFINED_LOCATION_Garden(){
    int money_on_people=Random_Int_Num(1, 15);
  if (PLAYER_STRUCT.VisitedGarden == false) {
    PLAYER_STRUCT.VisitedGarden = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Where.... Where am i???.... fuck i passed out again ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Hmmmm.... I lost some money, but there are other drunk people here, sooo...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1.  Im gonna rub them for money, what they cant spent on alcohol before passing out is weak boi"); 

    printf("\n2.  hmmmm.... (i am not gonna take any money and just leave)"); 

    int USER_CHOICE_INPUT_koHcTITG = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_koHcTITG == 1){
    PLAYER_STRUCT.Gold+=money_on_people;
  }

  if (USER_CHOICE_INPUT_koHcTITG == 2){

DEFINED_LOCATION_Bar();
  }

  }

  if (PLAYER_STRUCT.VisitedGarden == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "this garden is still full of drunken people every time.... the money in their\npockets are still good... if im a bad person");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. i am a bad boi... im taking the Gold"); 

    printf("\n2. Hmmmmmmm... (im am not gonna take this gold from these people besauce im no better my self)"); 

    int USER_CHOICE_INPUT_1qVBtb3 = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_1qVBtb3 == 1){
  if (PLAYER_STRUCT.Gold >= 50 && PLAYER_STRUCT.Boost_of_internal_power_for_one_attack == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "ohh... I have to much Gold... i can ditch something for more goal... is that\nwhat i want?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. yes"); 

    printf("\n2. no"); 

    int USER_CHOICE_INPUT_7FbZBiex = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_7FbZBiex == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I need ALL the gold I can get");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = false;
  }

  if (USER_CHOICE_INPUT_7FbZBiex == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I Have enough gold...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

    PLAYER_STRUCT.Gold+=money_on_people;
  }

  if (USER_CHOICE_INPUT_1qVBtb3 == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "No... I am a good person");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "well better get going... the Bar is a good place");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "fuck i mean hmmmmm... (well better get going... the Bar is a good place)");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Bar();
DEFINED_LOCATION_Garden();
}

void DEFINED_LOCATION_Bar(){
  if (PLAYER_STRUCT.VisitedBar == false) {
    PLAYER_STRUCT.VisitedBar = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s", "BARTENDER: Jesus... you look bad ", PLAYER_STRUCT.name, " how can someone like\nyou ever be so bad at drinking HA HA HA!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "BARTENDER: Well joke aside... What can I get you ", PLAYER_STRUCT.name);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. beer... hm"); 

    printf("\n2. water...hm"); 

    printf("\n3. nothing... hm"); 

    int USER_CHOICE_INPUT_hcZGhBcd = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_hcZGhBcd == 1){
    PLAYER_STRUCT.Gold-=2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "comming right up...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmm... my health is not so good now");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=8;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current health and gold is now ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_hcZGhBcd == 2){
    PLAYER_STRUCT.Gold-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "okay... the best cure for hangover i guess even you need something like that\nonce in a while");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "much better... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current health and gold is now ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_hcZGhBcd == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "my head hurts... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=5;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Are you sure I cant get you anything?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. water... hm"); 

    printf("\n2. beer... hm"); 

    int USER_CHOICE_INPUT_7DSIXem = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_7DSIXem == 1){
    PLAYER_STRUCT.Gold-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "much better... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point+=3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current health and gold is now ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_7DSIXem == 2){
    PLAYER_STRUCT.Gold-=2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "comming right up...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmm... my health is not so good now");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current health and gold is now ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

  }

  if (PLAYER_STRUCT.VisitedBar == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: so what can i get you besides my lovely drinks and women?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. hmm... these women you speak of doesn\'t sound to bad"); 

    printf("\n2. hmm... more beer"); 

    printf("\n3. hmm... got a poker table?"); 

    printf("\n4. hmm... tell me about that dragon again..."); 

  if (PLAYER_STRUCT.CanLeaveBar) printf("\n5. ... (leave)"); 

    int USER_CHOICE_INPUT_KPWRUJ6 = COMPILER_TOOL_GET_INPUT(5);

  if (USER_CHOICE_INPUT_KPWRUJ6 == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "congratulations... you played yourself for some virtual punani... now lost 2\ngold");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=2;
  }

  if (USER_CHOICE_INPUT_KPWRUJ6 == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "more beer costs more than just 1 gold... remember that...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=1;
    PLAYER_STRUCT.Health_point-=5;
  }

  if (USER_CHOICE_INPUT_KPWRUJ6 == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "In the back.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_GamblingTable();
  }

  if (USER_CHOICE_INPUT_KPWRUJ6 == 4){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Once upon a time, there was a cold hearted, backstabbing dragon that\nwas so mean and ugly. He loved to travel to the human world and snatch little\nkids out of their beds while they were sleeping, and he would drop them\ndown his green tortoise throat. Now back in those days all the kids would\nsit in his stomach and cry, \'Let us out, Let us out!!\' Of course he would not\nlet them out, but sometimes a brave little soul would travel the long journey\ntill he plopped out the other end.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "what is that?? tell me the real story... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Now there was a little girl named Susie who had heard about this evil\ndragon, and wanted to see for herself that he was real. So one night she\ncrawled under her sister\'s bed waiting for the dragon to pick her up. The\ndragon came slowly and silently through the city, getting ready to pick up\nhis midnight snack. When Susie saw her she was amazed at how ugly he\nwas, his mouth was dripping with drool ready to pick a kid. He then picked\nup Susie\'s sister with Susie hanging on to her back. Right before she was\ngoing to be dropped in the pot of doom, she jumped swiftly on to the\ndragons head. She felt the slimy texture of the dragon’s skin on her cold\nbare toes, she waited until the dragon was ready to go, and then she\nclenched his smelly ear as tight as she could so that she wouldn\'t go flying\noff his head. Then she experienced something no one else had ever\nexperienced before, she was flying! She felt the cold winter breeze hitting\nher face as they flew over her city.\'There is my house,\' she called with her\ntiny sliver of a voice. She then looked behind her seeing how big the\ndragon actually was and how small she was. She looked up at the night sky\nand closed her eyes, drifting into a deep sleep.\n");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "stop this nonsense my friend... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Susie woke up to the sound of big feet stomping on a rock.\nAs she peeked her eyes open, afraid of what she was going to see, she saw \nmultiple dragons surrounding the dragon that she was standing on. The dragons\nwere making strange sounds in dragon language, yelling at the dragon that\nseemed smaller than the rest. Susie looked down at the dragons eyes\nseeing floods of tears streaming down its face, it was crying. She didn\'t see\nwhy they were doing this, this dragon was huge to her, but small to them.\nThen she understood, the dragon was lonely. After what felt like hours, the\nlittle dragon scooted its way out of the circle moving back to its cave. Then\nshe saw the most ugly thing she had ever seen: trash, rubbish, mud\neverywhere, and anything you could think of that was disgusting. She \nsmelled in the stench and she thought she was going to throw up. As they\nwalked back to his cave Susie could feel the dragon moping around. She\nfelt so bad for him, eating all the little children so his sorrows would go\naway. Then she called out as loud as she could in to the dragon’s ear:");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "HMMMMMMMMM (starting to get angry)");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'Mr. Dragon, I think I might know how to help you.\' As soon as the\ndragon heard this, his yellow eyes peered up at Susie having the sense of\nsorrow and anger all at once. As soon as his eyes hit hers they had a long\nstare until the dragon picked her up with his creepy long claws and was\nabout to drop her in to his mouth, but he had missed his chance because\nSusie had fainted.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'I\'m so sorry, I\'m so sorry!\' Was what Susie woke up to.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'Please don\'t die, I\'m so sorry!\' She looked up and saw the dragon\nlooking over her, sobbing in big floods");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'I\'m all right Mr. Dragon.\' Susie said. The dragon stopped sobbing\nand looked her straight in the eyes. She then saw that this dragon was not\nmean at all, all he needed was a friend. She looked deep in to him, seeing\nall the things that had made this happen. She saw the sorr-");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "listen here my friend... I was talking about the drake with the contract on it...\nhmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER:ahh... why didn\'t you just say so my friend");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: There is a dragon with a lot of health in the forrest might wanna\ndo some damage to the dragon and saving this town..");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Might wanna shop before killing it i guess...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.regular_sword_damage=12;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d%s%d", "current health: ", PLAYER_STRUCT.Health_point, ", damage: ", PLAYER_STRUCT.regular_sword_damage, "\nand gold: ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I might gonna go to the street, then I decide what i want to do... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.CanLeaveBar = true;

DEFINED_LOCATION_Street();
  }

 if (PLAYER_STRUCT.CanLeaveBar){

  if (USER_CHOICE_INPUT_KPWRUJ6 == 5){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: May Sovngarde be with you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

 } else if (USER_CHOICE_INPUT_KPWRUJ6 == 5) { USER_CHOICE_INPUT_KPWRUJ6 = 6; } 

  }

DEFINED_LOCATION_Bar();
}

void DEFINED_LOCATION_GamblingTable(){
    int playerBet=0;
    bool gameRunning = true;
    int dealerRoll=0;
    int playerRoll=0;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d", "DEALER: The game is Dice of Sovngarde, dragons are triple.\nCurrent gold: ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Leave"); 

  if (PLAYER_STRUCT.Gold >= 5) printf("\n2. Bet 5"); 

  if (PLAYER_STRUCT.Gold >= 10) printf("\n3. Bet 10"); 

  if (PLAYER_STRUCT.Gold >= 20) printf("\n4. Bet 20"); 

  if (PLAYER_STRUCT.Gold >= 50) printf("\n5. Bet 50"); 

    int USER_CHOICE_INPUT_v45pd1me = COMPILER_TOOL_GET_INPUT(5);

  if (USER_CHOICE_INPUT_v45pd1me == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You get up and go out into the bar.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Bar();
  }

 if (PLAYER_STRUCT.Gold >= 5){

  if (USER_CHOICE_INPUT_v45pd1me == 2){
    playerBet=5;
  }

 } else if (USER_CHOICE_INPUT_v45pd1me == 2) { USER_CHOICE_INPUT_v45pd1me = 3; } 

 if (PLAYER_STRUCT.Gold >= 10){

  if (USER_CHOICE_INPUT_v45pd1me == 3){
    playerBet=10;
  }

 } else if (USER_CHOICE_INPUT_v45pd1me == 3) { USER_CHOICE_INPUT_v45pd1me = 4; } 

 if (PLAYER_STRUCT.Gold >= 20){

  if (USER_CHOICE_INPUT_v45pd1me == 4){
    playerBet=20;
  }

 } else if (USER_CHOICE_INPUT_v45pd1me == 4) { USER_CHOICE_INPUT_v45pd1me = 5; } 

 if (PLAYER_STRUCT.Gold >= 50){

  if (USER_CHOICE_INPUT_v45pd1me == 5){
    playerBet=50;
  }

 } else if (USER_CHOICE_INPUT_v45pd1me == 5) { USER_CHOICE_INPUT_v45pd1me = 6; } 

    dealerRoll=Random_Int_Num(1, 20);
    playerRoll=Random_Int_Num(1, 20);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The dealer rolls his dice.\nYou roll yours and you get ", playerRoll, ".\n\n");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  if (playerRoll == 20) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "HOT DAMN Dragon it is!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold+=playerBet*3;
  }
  else {

    printf("\n1. Bet your dice is greater"); 

    printf("\n2. Bet your dice is lesser"); 

    printf("\n3. Bet your dice is equal"); 

    int USER_CHOICE_INPUT_vXyIzMB = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_vXyIzMB == 1){
  if (playerRoll > dealerRoll) {
    PLAYER_STRUCT.Gold+=playerBet;
  }
  else {
    PLAYER_STRUCT.Gold-=playerBet;
  }

  }

  if (USER_CHOICE_INPUT_vXyIzMB == 2){
  if (playerRoll < dealerRoll) {
    PLAYER_STRUCT.Gold+=playerBet;
  }
  else {
    PLAYER_STRUCT.Gold-=playerBet;
  }

  }

  if (USER_CHOICE_INPUT_vXyIzMB == 3){
  if (playerRoll == dealerRoll) {
    PLAYER_STRUCT.Gold+=playerBet;
  }
  else {
    PLAYER_STRUCT.Gold+=playerBet*13;
  }

  }

  }

DEFINED_LOCATION_GamblingTable();
}

void DEFINED_LOCATION_Street(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You are now on the street in the town known as HONEYWOOD... (ironic init HA HA\n:-)");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "From here you can travel to THE FORREST, THE BAR (again) OR THE SHOP, where would\nyou like to go ", PLAYER_STRUCT.name);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. travel to the forrest, i will hmmm..."); 

    printf("\n2. travel to the bar, hmmm... women and beer is still good"); 

    printf("\n3. travel to the Shop, hmm might need some good sjit hmm"); 

    printf("\n4. information about the town of honeywood"); 

    int USER_CHOICE_INPUT_DHaaLefI = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_DHaaLefI == 1){

DEFINED_LOCATION_Forrest();
  }

  if (USER_CHOICE_INPUT_DHaaLefI == 2){

DEFINED_LOCATION_Bar();
  }

  if (USER_CHOICE_INPUT_DHaaLefI == 3){

DEFINED_LOCATION_Shop();
  }

  if (USER_CHOICE_INPUT_DHaaLefI == 4){
  if (PLAYER_STRUCT.counter == 0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "TRUST ME.... YOU DONT WANT TO KNOW... now go to the shop... and dont EVER THINK\nof asking this again...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.counter+=1;

DEFINED_LOCATION_Shop();
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "told you not to ask again...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=10;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "current hp is ", PLAYER_STRUCT.Health_point, " not smart.....");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Shop();
  }

  }

DEFINED_LOCATION_Street();
}

void DEFINED_LOCATION_Shop(){
  if (PLAYER_STRUCT.VisitedShop == false) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s", "SHOP OWNER: Hello ", PLAYER_STRUCT.name, " what can i get for you? ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmmm... hello Emperor... i need something from you");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "SHOP OWNER: YEEEEEEES..... that is why you are here?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmmm....");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "SHOP OWNER: ....");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "....");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.VisitedShop = true;
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d%s%d", "UNLIMITED ITEMS... what do you want to buy?\n\nCurrent gold: ", PLAYER_STRUCT.Gold, "\nCurrent\npotions: ", PLAYER_STRUCT.potion_amount, "\nCurrent bandages: ", PLAYER_STRUCT.bandage_amount);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


    printf("\n1. ... (leave)"); 

    printf("\n2. ... (buy some potions)"); 

    printf("\n3. ... (buy some bandages)"); 

    int USER_CHOICE_INPUT_iUStnjQX = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_iUStnjQX == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "bye! hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  if (USER_CHOICE_INPUT_iUStnjQX == 2){
  if (PLAYER_STRUCT.Gold >= 10) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "potions? hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "here");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.potion_amount+=1;
    PLAYER_STRUCT.Gold-=10;
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " HEHEHE you have no power here... LEAVE MY SHOP!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_iUStnjQX == 3){
  if (PLAYER_STRUCT.Gold >= 3) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "bandage? hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "here");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.bandage_amount+=1;
    PLAYER_STRUCT.Gold-=3;
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " HEHEHE you have no power here... LEAVE MY SHOP!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  }

DEFINED_LOCATION_Shop();
}

void DEFINED_LOCATION_Forrest(){
  if (PLAYER_STRUCT.VisitedForrest == false) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "you are now in the forrest, on the way for the clue of where the dragon could\nbe...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "you find some gold in the forrest in the direction of the field");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold+=5;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current status: ", PLAYER_STRUCT.Gold, " | ", PLAYER_STRUCT.Health_point);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "There is also an old castle ahead, might also be where the drake are.. hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "where to go? hmmm....");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.VisitedForrest = true;
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "There is the field ahead or the old castle... hmmm... the town is behind me also\nif i need to go back..");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "where to go? hmmm....");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


    printf("\n1. I will go north... to the field"); 

    printf("\n2. I will search in the old, dark, very very scary castle.. hmmm (nervous hmmm)"); 

    printf("\n3. hmmm...I am a chicken... I go back to the town..."); 

    int USER_CHOICE_INPUT_i5ut9RJK = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_i5ut9RJK == 1){

DEFINED_LOCATION_Field();
  }

  if (USER_CHOICE_INPUT_i5ut9RJK == 2){

DEFINED_LOCATION_Old_Castle();
  }

  if (USER_CHOICE_INPUT_i5ut9RJK == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

DEFINED_LOCATION_Forrest();
}

void DEFINED_LOCATION_Field(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "There is so beautiful here");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "sometimes i wonder what is the purpose of life is when I look over this field...\nhmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Well this is a good place to take a nap before moving on");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s", "But then again I am a busy ", PLAYER_STRUCT.name, " so... what to do hmmm...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    bool bad = false;

    printf("\n1. A tired person"); 

    printf("\n2. A fresh person"); 

    int USER_CHOICE_INPUT_awe7PO7W = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_awe7PO7W == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "ZZZzzzZZZzzz .... ZZZzzzZZZzzz");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "VOICE IN HEAD: You will never find the dragon in this area... the life of yours,\nis no longer in your hands");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "VOICE IN HEAD: Do you believe in faith... believe in quality of life in all lifeforms..?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Yes i do... maybe my purpose is not to kill but to love"); 

    printf("\n2. No.. life is meaningless, no matter the form or age... all shall die by my hand"); 

    int USER_CHOICE_INPUT_s3qRa7y = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_s3qRa7y == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "VOICE IN HEAD: :-)");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point=100;
  }

  if (USER_CHOICE_INPUT_s3qRa7y == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "VOICE IN HEAD: :-/");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.regular_sword = false;
    bad = true;
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "AHH!...... hmmm, the dreams keeps getting worse, hopefully i didnt do anything\nstupid like saying No in a dream...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  if (bad == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "That would make me lose something on me of value... like a potion or my swor-.....");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "where is my sword... hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmmmm.....");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "Well... i hope i find something else to fight with... or else im a bad ", PLAYER_STRUCT.name);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "good thing i said Yes then... I still have all my belongings.. hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I love this game");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "well lets get going... where to hmmm...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. There is a house... maybe there is something useful inside there hmmm.."); 

    printf("\n2. The street is still visible from here... maybe I am still a chicken... hmm.."); 

    printf("\n3. Maybe the forrest can give me something... hmm the old castle there"); 

    int USER_CHOICE_INPUT_ZagpIAV = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_ZagpIAV == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "To the house");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_House();
  }

  if (USER_CHOICE_INPUT_ZagpIAV == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  if (USER_CHOICE_INPUT_ZagpIAV == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "back to the forrest... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Forrest();
  }

  }

  if (USER_CHOICE_INPUT_awe7PO7W == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I am good to go and want to move to other places, since the drake is not here\nor else the writer would have made it appear..");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "let me see... hmm...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. There is a house... maybe there is something useful inside there hmmm.."); 

    printf("\n2. The street is still visible from here... maybe I am still a chicken... hmm.."); 

    printf("\n3. Maybe the forrest can give me something... hmm the old castle there"); 

    int USER_CHOICE_INPUT_W6Qfs4F = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_W6Qfs4F == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "To the house");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_House();
  }

  if (USER_CHOICE_INPUT_W6Qfs4F == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  if (USER_CHOICE_INPUT_W6Qfs4F == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "back to the forrest... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Forrest();
  }

  }

DEFINED_LOCATION_Field();
}

void DEFINED_LOCATION_House(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The house is an old house... might be cursed... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I feel the urge for not going down in the basement... but there could also be\nsome good booty down there... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "what should i do...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. hmm... I am not afraid for going down in the basement"); 

    printf("\n2. hmm there is nothing in this house, and that basement is not worth it... i want to live to fight the dragon..."); 

    int USER_CHOICE_INPUT_F2uXKUeB = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_F2uXKUeB == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "DARK VOICE: \'are you sure that is what you want?\'");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. YES BRING IT ON!!!!! ARHHH"); 

    printf("\n2. NO DONT BRING IT ON IHHHH"); 

    int USER_CHOICE_INPUT_wKLVYTNU = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_wKLVYTNU == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "DARK VOICE: SO BE IT...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Basement();
  }

  if (USER_CHOICE_INPUT_wKLVYTNU == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "DARK VOICE: good choice... NOW LEAVE!!!!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "uhhh im running!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Field();
  }

  }

  if (USER_CHOICE_INPUT_F2uXKUeB == 2){

DEFINED_LOCATION_Field();
  }

DEFINED_LOCATION_House();
}

void DEFINED_LOCATION_Basement(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*****REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE*****");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*INTERNAL DARKNESS*");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Do have any regrets... should i have killed the BARTENDER... would I have ever\nmet the dragon... does soya taste good on eggs...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "this is the e-");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_DeathEnd();
DEFINED_LOCATION_Basement();
}

void DEFINED_LOCATION_Old_Castle(){
    bool Answer = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You are now in the old castle...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

  while(Answer) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s", "what does ", PLAYER_STRUCT.name, " want to do?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. I want to see my current... EVERYTHING!!!!"); 

    printf("\n2. I want to explorer the castle for hopefully more extreme shit than your current sword"); 

    printf("\n3. I want RIGHT NOW... hmmm to fight the dragon, which might, might not be on the roof... who knows... it is a dragon after all... hmm"); 

    int USER_CHOICE_INPUT_dnBXxowD = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_dnBXxowD == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s%d%s%s%d%s%s%d%s%s%d%s%s%d%s", "name: ", PLAYER_STRUCT.name, " | ", "health: ", PLAYER_STRUCT.Health_point, "\n| ", "gold: ", PLAYER_STRUCT.Gold, " | ", "amount og bandages ", PLAYER_STRUCT.bandage_amount, "\n(+21 hp) | ", "potion amount: ", PLAYER_STRUCT.potion_amount, " | ", "normal sword\ndmg: ", PLAYER_STRUCT.regular_sword_damage, " (good luck with that sword) ");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_dnBXxowD == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "noice hmmm.... where do I want to go for further exploring?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

  while(Answer) {

    printf("\n1. To the old bedroom in this castle... everyting extreme happens in bedrooms..."); 

    printf("\n2. Take me to the candyshop"); 

    printf("\n3. To the forrest again.. might missed something... like an egg.... because im a chicken if a go back"); 

    printf("\n4. To the Dining room there is always something in the dining room"); 

    int USER_CHOICE_INPUT_glIGfMB = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_glIGfMB == 1){

DEFINED_LOCATION_Bed_Room();
  }

  if (USER_CHOICE_INPUT_glIGfMB == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "What are you.... 5???? pick another");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_glIGfMB == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Forrest();
  }

  if (USER_CHOICE_INPUT_glIGfMB == 4){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " TO THE DINING ROOM *shhhhhhhhhhuuuuuuussssss* (yes you are 5) ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Dining_Room();
  }


  }

  }

  if (USER_CHOICE_INPUT_dnBXxowD == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "AM I SURE I WANT TO FIGHT THE DRAGON NOW... WITH MY CURRENT HEALTH....", PLAYER_STRUCT.Health_point, "?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. I AM READY"); 

    printf("\n2. not ready"); 

    int USER_CHOICE_INPUT_Ql2I2da4 = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_Ql2I2da4 == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "are you REALLY REALLY SURE!!!!!!!!!!!!!!!! NO TURNING BACK... LIFE OR DEATH...\nNOT LIKE THE BASEMENT...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. YEEEES"); 

    printf("\n2. no"); 

    int USER_CHOICE_INPUT_LapuZeip = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_LapuZeip == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "okay say i didnt warn ya.... hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_FightTheDragon();
  }

  if (USER_CHOICE_INPUT_LapuZeip == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "thought so...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

  if (USER_CHOICE_INPUT_Ql2I2da4 == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "thought so...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }


  }

DEFINED_LOCATION_Old_Castle();
}

void DEFINED_LOCATION_Bed_Room(){
    bool Answer = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "It seems there is chosen the bedroom... full of action happens in the bedroom...\nhmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Mostly dust... i mean.. it is old... cant expect much... but there is still some\nsmall things inside here...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

  while(Answer) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "What to check...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. the closet... hmm"); 

    printf("\n2. Behind the bed... hmm"); 

    printf("\n3. behind the window... hmm"); 

    printf("\n4. Go to the dining room... hmmm, there is nothing for me here..."); 

    printf("\n5. go back to where i came from... hmm"); 

    int USER_CHOICE_INPUT_j4zxY9iM = COMPILER_TOOL_GET_INPUT(5);

  if (USER_CHOICE_INPUT_j4zxY9iM == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "there is nothing there... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_j4zxY9iM == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " THERE IS SOMETHING HERE");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Pretty voice: yeeees, witcher, you found me at last");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Pretty voice: I\'ve been waiting for you for a long time now, like ever since\nthe creator created me... that\'s like 12 hours ago...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Pretty voice: please pick me up from behind the bed... daddy");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. I will pick up"); 

    printf("\n2. i will not pick up"); 

    int USER_CHOICE_INPUT_Rf5oxIg = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_Rf5oxIg == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmm.. wao... there was: dead rat, non-magic dust and oh yea... A CRAZY STRONG\nSWORD FROM THE LEGENDARY OLD ONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Pretty voice: i am finally with you my lovly daddy... I will assist you more\nin the quest against the evil dragon on the roof which is pretty strong");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "What?? hmm....");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Pretty voice: what?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = true;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "*congrats... you are now in posession of the GREAT SWORD OF THE OLD ONE");
    COMPILER_TOOL_WAIT_FOR_INPUT();

  while(Answer) {

    printf("\n1. read manual"); 

    printf("\n2. Travel to the Dining room, might be good shit there"); 

    printf("\n3. go back where I came from... hmm, then decide what to do next"); 

    int USER_CHOICE_INPUT_wz8KpLsz = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_wz8KpLsz == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Definition of sword\n1: a weapon (such as a cutlass or rapier) with a long blade for cutting or thrusting\nthat is often used as a symbol of honor or authority\n2a: an agency or instrument of destruction or combat");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_wz8KpLsz == 2){

DEFINED_LOCATION_Dining_Room();
  }

  if (USER_CHOICE_INPUT_wz8KpLsz == 3){

DEFINED_LOCATION_Old_Castle();
  }


  }

  }

  if (USER_CHOICE_INPUT_Rf5oxIg == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "your loss dude... hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

  if (USER_CHOICE_INPUT_j4zxY9iM == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "IDIOT... one cannot simply check behind a window...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_j4zxY9iM == 4){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "To the dining room hmmmmmmmmmmmmmm (deep hmm)");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Dining_Room();
  }

  if (USER_CHOICE_INPUT_j4zxY9iM == 5){

DEFINED_LOCATION_Old_Castle();
  }


  }

DEFINED_LOCATION_Bed_Room();
}

void DEFINED_LOCATION_Dining_Room(){
  if (PLAYER_STRUCT.VisitedDining_Room_first == false) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "nothing here, go away...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.VisitedDining_Room_first = true;

DEFINED_LOCATION_Old_Castle();
  }

  if (PLAYER_STRUCT.VisitedDining_Room_Second == false) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "okay here is a bandage now go...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.bandage_amount+=1;

DEFINED_LOCATION_Old_Castle();
    PLAYER_STRUCT.VisitedDining_Room_Second = true;
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "nice try....................");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Old_Castle();
  }

DEFINED_LOCATION_Dining_Room();
}

void DEFINED_LOCATION_FightTheDragon(){
    int dragonLevel=0;
    bool flag = true;

  while(flag) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "Your HP: ", PLAYER_STRUCT.Health_point, " Dragon HP: ", PLAYER_STRUCT.The_dragon_of_smaguron_health);
    COMPILER_TOOL_WAIT_FOR_INPUT();
    int roll=0;

    printf("\n1. Bonk with stick!"); 

  if (PLAYER_STRUCT.regular_sword) printf("\n2. Swing your Sword!"); 

  if (PLAYER_STRUCT.potion_amount > 0) printf("\n3. Drink potion"); 

  if (PLAYER_STRUCT.bandage_amount > 0) printf("\n4. Apply bandage"); 

  if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == false) printf("\n5. Ready the Great Old Sword."); 

  if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == true) printf("\n6. Attack with the Great old Sword!"); 

    int USER_CHOICE_INPUT_TInqLnAz = COMPILER_TOOL_GET_INPUT(6);

  if (USER_CHOICE_INPUT_TInqLnAz == 1){
    roll=Random_Int_Num(3, 8);
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You Bonk the *Dragon* for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
  }

 if (PLAYER_STRUCT.regular_sword){

  if (USER_CHOICE_INPUT_TInqLnAz == 2){
    roll=Random_Int_Num(PLAYER_STRUCT.regular_sword_damage-3, PLAYER_STRUCT.regular_sword_damage+3);
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You Swing your Sword for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
  }

 } else if (USER_CHOICE_INPUT_TInqLnAz == 2) { USER_CHOICE_INPUT_TInqLnAz = 3; } 

 if (PLAYER_STRUCT.potion_amount > 0){

  if (USER_CHOICE_INPUT_TInqLnAz == 3){
    PLAYER_STRUCT.Health_point+=PLAYER_STRUCT.potion_health;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You run around the dragon while chugging a potion, it is refreshing.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
    PLAYER_STRUCT.potion_amount-=1;
  }

 } else if (USER_CHOICE_INPUT_TInqLnAz == 3) { USER_CHOICE_INPUT_TInqLnAz = 4; } 

 if (PLAYER_STRUCT.bandage_amount > 0){

  if (USER_CHOICE_INPUT_TInqLnAz == 4){
    PLAYER_STRUCT.Health_point+=PLAYER_STRUCT.bandage_health;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You hide long enouge to quickly apply bandage to yourself");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
    PLAYER_STRUCT.bandage_amount-=1;
  }

 } else if (USER_CHOICE_INPUT_TInqLnAz == 4) { USER_CHOICE_INPUT_TInqLnAz = 5; } 

 if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == false){

  if (USER_CHOICE_INPUT_TInqLnAz == 5){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "When hand comes to hilt, question comes to heart, from soul is given heaven\'s\nanswer\nvia either divine balancing scale or sword.", "For there is either hope,\nor there is not,\nand one way or another, suffering must end.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = true;
  }

 } else if (USER_CHOICE_INPUT_TInqLnAz == 5) { USER_CHOICE_INPUT_TInqLnAz = 6; } 

 if (PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE && PLAYER_STRUCT.GreatSwordReady == true){

  if (USER_CHOICE_INPUT_TInqLnAz == 6){
    roll=Random_Int_Num(PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE-13, PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE+13);
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%d%s", "You wield the Sword with might!\nand it slices through the dragon like a hot\nknife through butter.\n\n", "You attack for ", roll, " damage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.GreatSwordReady = false;
  }

 } else if (USER_CHOICE_INPUT_TInqLnAz == 6) { USER_CHOICE_INPUT_TInqLnAz = 7; } 

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The deed is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_TheEnd();
  }

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health < 400 && Random_Int_Num(1, 3) == 3) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Dragon gets angry, it is fighing for its life.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Go for the Execute."); 

    printf("\n2. Not yet"); 

    int USER_CHOICE_INPUT_NR1fRiex = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_NR1fRiex == 1){
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
    printf("%s", "By a true miracle you pierce the dragons scales.\n\nYou got it good.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health=0;
  }
  else {
    roll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage, PLAYER_STRUCT.The_dragon_of_smaguron_damage+15+dragonLevel);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You rush towards the beast!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You hit it but the scales stopped your weapon.\n\nIt spits fire at you for ", roll, "\ndamage.");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=roll;
  }

  }

  if (USER_CHOICE_INPUT_NR1fRiex == 2){
    PLAYER_STRUCT.Health_point+=4;
  }

  }
  else if (Random_Int_Num(1, 5) == 5) {
    roll=Random_Int_Num(PLAYER_STRUCT.regular_sword_damage+5, PLAYER_STRUCT.regular_sword_damage+10);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Dragon turns its back. you see your chance\n\nDo you take it?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Run and jump onto the back of the dragon!"); 

    printf("\n2. Catch your breath instead"); 

    int USER_CHOICE_INPUT_zP4uc4qM = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_zP4uc4qM == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "You slice open a fresh wound and deal ", roll, " damage");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health-=roll;
  }

  if (USER_CHOICE_INPUT_zP4uc4qM == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "You catch your breath and feel the second wind.\n\nJust in time for the dragon\nagain facing you");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point+=Random_Int_Num(3, 8);
  }

  }

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The deed is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_TheEnd();
  }

    int enemychoice=Random_Int_Num(1, 4);
int enemyRoll;
  if (enemychoice == 1) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage-10, PLAYER_STRUCT.The_dragon_of_smaguron_damage+10);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Dragon bites you for ", enemyRoll, " damage!");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=enemyRoll;
  }
  else if (enemychoice == 2) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage-PLAYER_STRUCT.The_dragon_of_smaguron_damage*2, 8+PLAYER_STRUCT.The_dragon_of_smaguron_damage*2)+dragonLevel*3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Dragon recites an ancient melody\nIts lifeforce has changed by ", enemyRoll, "\nhealth and ");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_health+=enemyRoll;
  }
  else if (enemychoice == 3) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage, PLAYER_STRUCT.The_dragon_of_smaguron_damage+5)+dragonLevel*2;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "The Dragon spits fire in a cone\n\nYou are hit for ", enemyRoll, " damage");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=enemyRoll;
  }
  else if (enemychoice == 4) {
    enemyRoll=Random_Int_Num(PLAYER_STRUCT.The_dragon_of_smaguron_damage-10, PLAYER_STRUCT.The_dragon_of_smaguron_damage+10);

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The Dragon flies over and land behind you. It spits fire on the ground, you have\nto move to get around it. The dragon recites an ancient melody and grow stronger");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.The_dragon_of_smaguron_damage+=4;
    PLAYER_STRUCT.GreatSwordReady = false;
  }

  if (PLAYER_STRUCT.Health_point<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "you dead boi");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point=1;

DEFINED_LOCATION_DeathEnd();
  }

  if (PLAYER_STRUCT.The_dragon_of_smaguron_health<=0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The deed is done.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "A GLORIUS WIN for you!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_TheEnd();
  }


  }

DEFINED_LOCATION_FightTheDragon();
}

void DEFINED_LOCATION_DeathEnd(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "GOD (yes.... I am real): You died... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_DeathEnd();
DEFINED_LOCATION_DeathEnd();
}

void DEFINED_LOCATION_TheEnd(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "WOW.... you did it.... i cant belive you actually finished this test game...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "you are the hero... the hero who saved the town of honeywood... this can only\nbe celibrated with the outmost happy reward:");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "The BIGGEST amount of GOLD which is allowed of me to give you, which is 2,147,483,647");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "wow... im so happy you ended this, hope you had fun at least, or at least felt\na bit nostalgic...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "before goodbye.. a quick roundup from our sponsor for this game; MONSTER ApS\nand Aurora Cannabis");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "off course a BIG applause to the developers of this program and the language\nin general: ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Kevin Koepke");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Casper Nordspang");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Buenno");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Dunnis");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Frede");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "and last and least, the polish dude");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "Hope for the best for you, and good win forward....................................................\nTHE END");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_TheEnd();
DEFINED_LOCATION_TheEnd();
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));
    COMPILER_PLAYER_STRUCT_INIT();
    DEFINED_LOCATION_DebugMenu();
    return 0;
 }