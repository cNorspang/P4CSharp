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
    PLAYER_STRUCT.THE_GREAT_SWORD_OF_THE_OLD_ONE = true;
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = true;
    PLAYER_STRUCT.VisitedBar = false;
    PLAYER_STRUCT.VisitedCastle = false;
    PLAYER_STRUCT.VisitedShop = false;
    PLAYER_STRUCT.VisitedGarden = false;
    PLAYER_STRUCT.VisitedForrest = false;
    PLAYER_STRUCT.right_answer = false;
    PLAYER_STRUCT.The_dragon_of_smaguron_health =1000;
    PLAYER_STRUCT.The_dragon_of_smaguron_damage =1;}

void DEFINED_LOCATION_The_local_pub(){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s", "PUB OWNER: Hello there... You cannot be in here all day... You have to move\nsoon ", PLAYER_STRUCT.name, ". There is trouble incomming and I dont want \nmy pub to be destroyed...", "like last time...");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. Leave me be, if it is my time to die on this pub so be it..."); 

    printf("\n2. AAHHHHH!!!!!!!!!!!!!!... You dont have to yell, mom (drunk noice) BURP..."); 

    printf("\n3. Im sorry my old friend... i will be moving soon, just going to the bar"); 

    int USER_CHOICE_INPUT_FzJGSEf = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_FzJGSEf == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s", "PUB OWNER: dammit", PLAYER_STRUCT.name, " You HAVE to move... ", "Either you\ngo on the street or go to the bar for the last beer... THEN move");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. HMMMMMMMM.... (rising up for going to the bar)"); 

    printf("\n2. HMMMMMMMM.... (rising up for going on the street)"); 

    int USER_CHOICE_INPUT_G25zfla4 = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_G25zfla4 == 1){

DEFINED_LOCATION_Bar();
  }

  if (USER_CHOICE_INPUT_G25zfla4 == 2){

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_FzJGSEf == 2){

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

  if (USER_CHOICE_INPUT_FzJGSEf == 3){

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

    int USER_CHOICE_INPUT_NszR0ZfQ = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_NszR0ZfQ == 1){
    PLAYER_STRUCT.Gold+=money_on_people;
  }

  if (USER_CHOICE_INPUT_NszR0ZfQ == 2){

DEFINED_LOCATION_Bar();
  }

  }

  if (PLAYER_STRUCT.VisitedGarden == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "this garden is still full of drunken people every time.... the money in their\npockets are still good... if im a bad person");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. i am a bad boi... im taking the Gold"); 

    printf("\n2. Hmmmmmmm... (im am not gonna take this gold from these people besauce im no better my self)"); 

    int USER_CHOICE_INPUT_NGgOP8OY = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_NGgOP8OY == 1){
  if (PLAYER_STRUCT.Gold >= 50 && PLAYER_STRUCT.Boost_of_internal_power_for_one_attack == true) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "ohh... I have to much Gold... i can ditch something for more goal... is that\nwhat i want?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. yes"); 

    printf("\n2. no"); 

    int USER_CHOICE_INPUT_unNpm4Zs = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_unNpm4Zs == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I need ALL the gold I can get");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Boost_of_internal_power_for_one_attack = false;
  }

  if (USER_CHOICE_INPUT_unNpm4Zs == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "I Have enough gold...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  }

    PLAYER_STRUCT.Gold+=money_on_people;
  }

  if (USER_CHOICE_INPUT_NGgOP8OY == 2){

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
    printf("%s%s%s", "BARTENDER: Jesus... you look bad ", PLAYER_STRUCT.name, " how can someone\nlike you ever be so bad at drinking HA HA HA!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "BARTENDER: Well joke aside... What can I get you ", PLAYER_STRUCT.name);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. beer... hm"); 

    printf("\n2. water...hm"); 

    printf("\n3. nothing... hm"); 

    int USER_CHOICE_INPUT_4k9atdPg = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_4k9atdPg == 1){
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

  if (USER_CHOICE_INPUT_4k9atdPg == 2){
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

  if (USER_CHOICE_INPUT_4k9atdPg == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "my head hurts... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point-=5;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Are you sure I cant get you anything?");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. water... hm"); 

    printf("\n2. beer... hm"); 

    int USER_CHOICE_INPUT_aUAZD71r = COMPILER_TOOL_GET_INPUT(2);

  if (USER_CHOICE_INPUT_aUAZD71r == 1){
    PLAYER_STRUCT.Gold-=1;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "much better... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Health_point+=3;

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%d%s%d", "current health and gold is now ", PLAYER_STRUCT.Health_point, " | ", PLAYER_STRUCT.Gold);
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }

  if (USER_CHOICE_INPUT_aUAZD71r == 2){
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

    int USER_CHOICE_INPUT_nV44bzmJ = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_nV44bzmJ == 1){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "congratulations... you played yourself for some virtual punani... now lost\n2 gold");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=2;
  }

  if (USER_CHOICE_INPUT_nV44bzmJ == 2){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "more beer costs more than just 1 gold... remember that...");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    PLAYER_STRUCT.Gold-=1;
    PLAYER_STRUCT.Health_point-=5;
  }

  if (USER_CHOICE_INPUT_nV44bzmJ == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s%s%s%s%s%s", "BARTENDER: Once upon a time, there was a cold hearted, backstabbing dragon\nthat was", "so mean and ugly. He loved to travel to the human world and snat\nch little", "kids out of their beds while they were sleeping, and he would \ndrop them", "down his green tortoise throat. Now back in those days all th\ne kids would", "sit in his stomach and cry, \'Let us out, Let us out!!\' O\nf course he would not", "let them out, but sometimes a brave little soul wo\nuld travel the long journey", "till he plopped out the other end.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "what is that?? tell me the real story... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Now there was a little girl named Susie who had heard about this\nevil\n						dragon, and wanted to see for herself that he was real. So one nig\nht she\n						crawled under her sister\'s bed waiting for the dragon to pick\nher up. The\n						dragon came slowly and silently through the city, getting\nready to pick up\n						his midnight snack. When Susie saw her she was amaze\nd at how ugly he\n						was, his mouth was dripping with drool ready to pick\na kid. He then picked\n						up Susie\'s sister with Susie hanging on to her\nback. Right before she was\n						going to be dropped in the pot of doom, she \njumped swiftly on to the\n						dragons head. She felt the slimy texture of t\nhe dragon’s skin on her cold\n						bare toes, she waited until the dragon wa\ns ready to go, and then she\n						clenched his smelly ear as tight as she could s\no that she wouldn\'t go flying\n						off his head. Then she experienced som\nething no one else had ever\n						experienced before, she was flying! She fel\nt the cold winter breeze hitting\n						her face as they flew over her city.\n\'There is my house,\' she called with her\n						tiny sliver of a voice. She t\nhen looked behind her seeing how big the\n						dragon actually was and ho\nw small she was. She looked up at the night sky\n						and closed her eyes, drifting into a deep sleep.\n						");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "stop this nonce my friend... hmm");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: Susie woke up to the sound of big feet stomping on a rock. As she\npeeked\n						her eyes open, afraid of what she was going to see, she saw multiple\n						drago\nns surrounding the dragon that she was standing on. The dragons\n						were ma\nking strange sounds in dragon language, yelling at the dragon that\n						\nseemed smaller than the rest. Susie looked down at the dragons eyes\n						seein\ng floods of tears streaming down its face, it was crying. She didn\'t see\\nn						why they were doing this, this dragon was huge to her, but small to them.\n\n						Then she understood, the dragon was lonely. After what felt like hours, the\n\n						little dragon scooted its way out of the circle moving back to its cave.\nThen\n						she saw the most ugly thing she had ever seen: trash, rubbish, mud\\nn						everywhere, and anything you could think of that was disgusting. Sh\ne \n						smelled in the stench and she thought she was going to throw up.\nAs they\n						walked back to his cave Susie could feel the dragon moping\naround. She\n						felt so bad for him, eating all the little children so his sor\nrows would go\n						away. Then she called out as loud as she could in to the dragon’s ear:");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "HMMMMMMMMM (starting to get angry)");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'Mr. Dragon, I think I might know how to help you.\' As soon as\nthe\n						dragon heard this, his yellow eyes peered up at Susie having t\nhe sense of\n						sorrow and anger all at once. As soon as his eyes hit hers \nthey had a long\n						stare until the dragon picked her up with his creep\ny long claws and was\n						about to drop her in to his mouth, but he had mi\nssed his chance because\n						Susie had fainted.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'I\'m so sorry, I\'m so sorry!\' Was what Susie woke up to.");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'Please don\'t die, I\'m so sorry!\' She looked up and saw the\ndragon\n						looking over her, sobbing in big floods");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "BARTENDER: \'I\'m all right Mr. Dragon.\' Susie said. The dragon stopped sobbing\n						and\nlooked her straight in the eyes. She then saw that this dragon was not\n						me\nan at all, all he needed was a friend. She looked deep in to him, seeing\n					\n	all the things that had made this happen. She saw the sorr-");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "listen here my friend... I was talking about the drake with the contract on\nit... hmm");
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
    printf("%s", "You are now on the street in the town known as HONEYWOOD... (ironic init HA\nHA :-)");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s%s", "From here you can travel to THE FORREST, THE BAR (again) OR THE SHOP, where\nwould you like to go ", PLAYER_STRUCT.name);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    printf("\n1. travel to the forrest, i will hmmm..."); 

    printf("\n2. travel to the bar, hmmm... women and beer is still good"); 

    printf("\n3. travel to the Shop, hmm might need some good sjit hmm"); 

    printf("\n4. information about the town of honeywood"); 

    int USER_CHOICE_INPUT_AKwZsd3 = COMPILER_TOOL_GET_INPUT(4);

  if (USER_CHOICE_INPUT_AKwZsd3 == 1){

DEFINED_LOCATION_Forrest();
  }

  if (USER_CHOICE_INPUT_AKwZsd3 == 2){

DEFINED_LOCATION_Bar();
  }

  if (USER_CHOICE_INPUT_AKwZsd3 == 3){

DEFINED_LOCATION_Shop();
  }

  if (USER_CHOICE_INPUT_AKwZsd3 == 4){
  if (PLAYER_STRUCT.counter == 0) {

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "TRUST ME.... YOU DONT WANT TO KNOW... now go to the shop... and dont EVER\nTHINK of asking this again...");
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
    printf("%s%s%s", "SHOP OWNER:	Hello ", PLAYER_STRUCT.name, " what can i get for you?   ");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "hmmm... hello Emperor... i need something from you");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "SHOP OWNER:	YEEEEEEES..... that is why you are here?");
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

    int USER_CHOICE_INPUT_XGFFvCbd = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_XGFFvCbd == 1){
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
    printf("%s", " HEHEHE you have no power here...	LEAVE MY SHOP!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_XGFFvCbd == 2){
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
    printf("%s", " HEHEHE you have no power here...	LEAVE MY SHOP!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

  }

  if (USER_CHOICE_INPUT_XGFFvCbd == 3){

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
    printf("%s", "There is the field ahead or the old castle... hmmm... the town is behind me\nalso if i need to go back..");
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "where to go? hmmm....");
    COMPILER_TOOL_WAIT_FOR_INPUT();
  }


    printf("\n1. I will go north... to the field"); 

    printf("\n2. I will search in the old, dark, very very scary castle.. hmmm (nervous hmmm)"); 

    printf("\n3. hmmm...I am a chicken... I go back to the town..."); 

    int USER_CHOICE_INPUT_uCaRzBNf = COMPILER_TOOL_GET_INPUT(3);

  if (USER_CHOICE_INPUT_uCaRzBNf == 1){

DEFINED_LOCATION_Field();
  }

  if (USER_CHOICE_INPUT_uCaRzBNf == 2){

DEFINED_LOCATION_Old_Castle();
  }

  if (USER_CHOICE_INPUT_uCaRzBNf == 3){

    COMPILER_TOOL_PRINT_TUI();
    printf("%s", "cluck cluck cluck cluck cluck cluck CHICKEN!!!!!!");
    COMPILER_TOOL_WAIT_FOR_INPUT();

DEFINED_LOCATION_Street();
  }

DEFINED_LOCATION_Forrest();
}

void DEFINED_LOCATION_Field(){
    int a=1;
DEFINED_LOCATION_Field();
}

void DEFINED_LOCATION_Old_Castle(){
    int a=1;
DEFINED_LOCATION_Old_Castle();
}

void DEFINED_LOCATION_Bed_Room(){
    int a=1;
DEFINED_LOCATION_Bed_Room();
}

void DEFINED_LOCATION_Basement(){
    int a=1;
DEFINED_LOCATION_Basement();
}

void DEFINED_LOCATION_Dining_Room(){
    int a=1;
DEFINED_LOCATION_Dining_Room();
}

void DEFINED_LOCATION_House(){
    int a=1;
DEFINED_LOCATION_House();
}

void DEFINED_LOCATION_FightTheDragon(){
    int a=1;
DEFINED_LOCATION_FightTheDragon();
}

int main(int argc, char const *argv[]){
    time_t t;
    srand((unsigned)time(&t));
    COMPILER_PLAYER_STRUCT_INIT();
    DEFINED_LOCATION_The_local_pub();
    return 0;
}
