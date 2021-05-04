#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

#define clrscr() printf("\e[1;1H\e[2J")

struct GENERATED_PLAYER_STRUCT { 
    int x;
};
struct GENERATED_PLAYER_STRUCT xCarier;

void COMPILER_TOOL_PRINT_TUI(){
    clrscr();
    printf("##| SWAE TEST |##################################################################\n");
    printf("#################################################################################\n\n");

}

void COMPILER_TOOL_PRINT_CHOICE(int id, char option[256]){
    printf("%d%s", id, option);
}

int COMPILER_TOOL_GET_INPUT(int max){
    char pwd;
    int num;
    int m = max;

    while(1){
        pwd = getch();  
        if(isdigit(pwd)){
            num = (int)pwd - 48;  // b/c ASCII: nums start at 48.
            if(num <= max && num >= 0)
                return num;
        }
        //else printf(" => Retry\n");
        pwd = '\0';      
    }
}


void COMPILER_TOOL_WAIT_FOR_INPUT(){
    printf("\n");
    char c = getch();
}

void locationOne(){
    
    COMPILER_TOOL_PRINT_TUI();    
    printf("sup boi");
    COMPILER_TOOL_WAIT_FOR_INPUT();
    
    COMPILER_TOOL_PRINT_TUI();
    printf("This is a test!");
    int USER_INPUT = COMPILER_TOOL_GET_INPUT(4);

    COMPILER_TOOL_PRINT_TUI();    
    printf("%s%d", "entered: ", USER_INPUT);
    COMPILER_TOOL_WAIT_FOR_INPUT();
};

int main(void){
    xCarier.x = 10;
    locationOne();
    return 0;
}
