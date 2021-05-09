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

char* COMPILER_TOOL_GET_STRING_INPUT(char * buf){
    char name[50];
    fgets(name, 50, stdin);
    name[strcspn(name, "\r\n")] = 0;
    strncpy(buf, name, 50); 
    return name; 
}

void DEFINED_LOCATION_The_local_pub();
void DEFINED_LOCATION_Garden();
void DEFINED_LOCATION_Bar();
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
int regular_sword_damage;
bool regular_sword ;
int THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE;
bool THE_GREAT_SWORD_OF_THE_OLD_ONE ;
bool Boost_of_internal_power_for_one_attack ;
bool VisitedBar ;
bool VisitedCastle ;
bool VisitedShop ;
bool VisitedGarden ;
bool VisitedForrest ;
bool VisitedField ;
bool right_answer ;
int The_dragon_of_smaguron_health;
int The_dragon_of_smaguron_damage;
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
    PLAYER_STRUCT.regular_sword_damage =10;
    PLAYER_STRUCT.regular_sword = true;
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE_DAMAGE =1;
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = false;
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = true;
    PLAYER_STRUCT.VisitedBar = false;
    PLAYER_STRUCT.VisitedCastle = false;
    PLAYER_STRUCT.VisitedShop = false;
    PLAYER_STRUCT.VisitedGarden = false;
    PLAYER_STRUCT.VisitedForrest = false;
    PLAYER_STRUCT.VisitedField = false;
    PLAYER_STRUCT.right_answer = false;
    PLAYER_STRUCT.The_dragon_of_smaguron_health =1000;
    PLAYER_STRUCT.The_dragon_of_smaguron_damage =1;}

void DEFINED_LOCATION_The_local_pub(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s", "PUB OWNER: Hello there... You cannot be in here all day... You have to move soon\n", PLAYER_STRUCT.name, ". There is trouble incomming and I dont want my pub t\no be destroyed...", "like last time...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Leave me be, if it is my time to die on this pub so be it..."); 

    printf("\n2. AAHHHHH!!!!!!!!!!!!!!... You dont have to yell, mom (drunk noice) BURP..."); 

    printf("\n3. Im sorry my old friend... i will be moving soon, just going to the bar"); 

    int USER_CHOICE_INPUT_28negS6L = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_28negS6L == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s", "PUB OWNER: dammit", PLAYER_STRUCT.name, " You HAVE to move... ", "Either you\ngo on the street or go to the bar for the last beer... THEN move");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. HMMMMMMMM.... (rising up for going to the bar)"); 

    printf("\n2. HMMMMMMMM.... (rising up for going on the street)"); 

    int USER_CHOICE_INPUT_374FNnQq = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_374FNnQq == 1){

DEFINED_LOCATION_Bar();
  }

  if (USER_CHOICE_INPUT_374FNnQq == 2){

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_28negS6L == 2){

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

  if (USER_CHOICE_INPUT_28negS6L == 3){

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

    int USER_CHOICE_INPUT_p0f8CLUn = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_p0f8CLUn == 1){
    PLAYER_STRUCT.Gold+=money_on_people;
  }

  if (USER_CHOICE_INPUT_p0f8CLUn == 2){

DEFINED_LOCATION_Bar();
  }

  }

  if (PLAYER_STRUCT.VisitedGarden == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "this garden is still full of drunken people every time.... the money in their\npockets are still good... if im a bad person");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. i am a bad boi... im taking the Gold"); 

    printf("\n2. Hmmmmmmm... (im am not gonna take this gold from these people besauce im no better my self)"); 

    int USER_CHOICE_INPUT_FhHH7qDt = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_FhHH7qDt == 1){
  if (PLAYER_STRUCT.Gold >= 50 && PLAYER_STRUCT.Boost_of_internal_power_for_one_attack == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "ohh... I have to much Gold... i can ditch something for more goal... is that\nwhat i want?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. yes"); 

    printf("\n2. no"); 

    int USER_CHOICE_INPUT_WnyRGjMZ = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_WnyRGjMZ == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I need ALL the gold I can get");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = false;
  }

  if (USER_CHOICE_INPUT_WnyRGjMZ == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I Have enough gold...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

    PLAYER_STRUCT.Gold+=money_on_people;
  }

  if (USER_CHOICE_INPUT_FhHH7qDt == 2){

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

    int USER_CHOICE_INPUT_BmZyM5DT = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_BmZyM5DT == 1){
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

  if (USER_CHOICE_INPUT_BmZyM5DT == 2){
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

  if (USER_CHOICE_INPUT_BmZyM5DT == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "my head hurts... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=5;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Are you sure I cant get you anything?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. water... hm"); 

    printf("\n2. beer... hm"); 

    int USER_CHOICE_INPUT_5T6D3hVa = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_5T6D3hVa == 1){
    PLAYER_STRUCT.Gold-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "much better... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point+=3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current health and gold is now ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_5T6D3hVa == 2){
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

  while(PLAYER_STRUCT.right_answer == false) {

    printf("\n1. hmm... these women you speak of doesn\'t sound to bad"); 

    printf("\n2. hmm... more beer"); 

    printf("\n3. hmm... tell me about that dragon again..."); 

    int USER_CHOICE_INPUT_qDVV3THP = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_qDVV3THP == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "congratulations... you played yourself for some virtual punani... now lost 2\ngold");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=2;
  }

  if (USER_CHOICE_INPUT_qDVV3THP == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "more beer costs more than just 1 gold... remember that...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=1;
    PLAYER_STRUCT.Health_point-=5;
  }

  if (USER_CHOICE_INPUT_qDVV3THP == 3){

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
    printf("%s", "stop this nonce my friend... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Susie woke up to the sound of big feet stomping on a rock. As she\npeeked\nher eyes open, afraid of what she was going to see, she saw multiple\ndragons surrounding the dragon that she was standing on. The dragons\nwere making strange sounds in dragon language, yelling at the dragon that\nseemed smaller than the rest. Susie looked down at the dragons eyes\nseeing floods of tears streaming down its face, it was crying. She didn\'t see\nwhy they were doing this, this dragon was huge to her, but small to them.\nThen she understood, the dragon was lonely. After what felt like hours, the\nlittle dragon scooted its way out of the circle moving back to its cave. Then\nshe saw the most ugly thing she had ever seen: trash, rubbish, mud\neverywhere, and anything you could think of that was disgusting. She \nsmelled in the stench and she thought she was going to throw up. As they\nwalked back to his cave Susie could feel the dragon moping around. She\nfelt so bad for him, eating all the little children so his sorrows would go\naway. Then she called out as loud as she could in to the dragon’s ear:");
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
    printf("%s%d%s%d%s%d", "current health, damage and gold... ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.regular_sword_damage, "\n| ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I might gonna go to the street, then I decide what i want to do... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.right_answer = true;

DEFINED_LOCATION_Street();
  }


  }

  }

DEFINED_LOCATION_Bar();
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

    int USER_CHOICE_INPUT_KCuS5LSt = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_KCuS5LSt == 1){

DEFINED_LOCATION_Forrest();
  }

  if (USER_CHOICE_INPUT_KCuS5LSt == 2){

DEFINED_LOCATION_Bar();
  }

  if (USER_CHOICE_INPUT_KCuS5LSt == 3){

DEFINED_LOCATION_Shop();
  }

  if (USER_CHOICE_INPUT_KCuS5LSt == 4){
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
    printf("%s", "UNLIMITED ITEMS... what do you want to buy?");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


    printf("\n1. ... (buy some potions)"); 

    printf("\n2. ... (buy some bandages)"); 

    printf("\n3. ... (buy nothing and leave)"); 

    int USER_CHOICE_INPUT_0ZVYujG = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_0ZVYujG == 1){
  if (PLAYER_STRUCT.Gold >= 10) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "potions? hmmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "here");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.potion_amount+=1;
    PLAYER_STRUCT.Gold-=10;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "current gold: ", PLAYER_STRUCT.Gold, " Im leaving, might come back for more...\nhmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " HEHEHE you have no power here... LEAVE MY SHOP!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_0ZVYujG == 2){
  if (PLAYER_STRUCT.Gold >= 3) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "bandage? hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "here");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.bandage_amount+=1;
    PLAYER_STRUCT.Gold-=3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s", "current gold: ", PLAYER_STRUCT.Gold, " Im leaving, might come back for more...\nhmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }
  else {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", " HEHEHE you have no power here... LEAVE MY SHOP!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_0ZVYujG == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "bye! hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
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

    int USER_CHOICE_INPUT_16WQr2q = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_16WQr2q == 1){

DEFINED_LOCATION_Field();
  }

  if (USER_CHOICE_INPUT_16WQr2q == 2){

DEFINED_LOCATION_Old_Castle();
  }

  if (USER_CHOICE_INPUT_16WQr2q == 3){

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

    int USER_CHOICE_INPUT_R78Iitjn = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_R78Iitjn == 1){

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

    int USER_CHOICE_INPUT_snNjzDY = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_snNjzDY == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "VOICE IN HEAD: :-)");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point=100;
  }

  if (USER_CHOICE_INPUT_snNjzDY == 2){

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

    int USER_CHOICE_INPUT_jGA14Hdg = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_jGA14Hdg == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "To the house");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_House();
  }

  if (USER_CHOICE_INPUT_jGA14Hdg == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  if (USER_CHOICE_INPUT_jGA14Hdg == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "back to the forrest... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Forrest();
  }

  }

  if (USER_CHOICE_INPUT_R78Iitjn == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I am good to go and want to move to other places, since the drake is not here\nor else the writer would have made it appear..");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "let me see... hmm...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. There is a house... maybe there is something useful inside there hmmm.."); 

    printf("\n2. The street is still visible from here... maybe I am still a chicken... hmm.."); 

    printf("\n3. Maybe the forrest can give me something... hmm the old castle there"); 

    int USER_CHOICE_INPUT_35cult51 = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_35cult51 == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "To the house");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_House();
  }

  if (USER_CHOICE_INPUT_35cult51 == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  if (USER_CHOICE_INPUT_35cult51 == 3){

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

    int USER_CHOICE_INPUT_to4jjfJ5 = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_to4jjfJ5 == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "DARK VOICE: \'are you sure that is what you want?\'");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. YES BRING IT ON!!!!! ARHHH"); 

    printf("\n2. NO DONT BRING IT ON IHHHH"); 

    int USER_CHOICE_INPUT_mEwlbNuz = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_mEwlbNuz == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "DARK VOICE: SO BE IT...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Basement();
  }

  if (USER_CHOICE_INPUT_mEwlbNuz == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "DARK VOICE: good choice... NOW LEAVE!!!!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "uhhh im running!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Field();
  }

  }

  if (USER_CHOICE_INPUT_to4jjfJ5 == 2){

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
    int a=1;
DEFINED_LOCATION_Old_Castle();
}

void DEFINED_LOCATION_Bed_Room(){
    int a=1;
DEFINED_LOCATION_Bed_Room();
}

void DEFINED_LOCATION_Dining_Room(){
    int a=1;
DEFINED_LOCATION_Dining_Room();
}

void DEFINED_LOCATION_FightTheDragon(){
    int a=1;
DEFINED_LOCATION_FightTheDragon();
}

void DEFINED_LOCATION_DeathEnd(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "GOD (yes.... he is existing): You died... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_DeathEnd();
DEFINED_LOCATION_DeathEnd();
}

void DEFINED_LOCATION_TheEnd(){
    int a=1;
DEFINED_LOCATION_TheEnd();
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));
    COMPILER_PLAYER_STRUCT_INIT();
    DEFINED_LOCATION_The_local_pub();
    return 0;
}
