#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

//added
#ifdef _WIN32
    #include <conio.h>
#else
// do Unix-specific stuff
    #include <termios.h>
    #include <unistd.h>

    int getch (void)
    {
        int ch;
        struct termios oldt, newt;

        tcgetattr(STDIN_FILENO, &oldt);
        newt = oldt;
        newt.c_lflag &= ~(ICANON|ECHO);
        tcsetattr(STDIN_FILENO, TCSANOW, &newt);
        ch = getchar();
        tcsetattr(STDIN_FILENO, TCSANOW, &oldt);

        return ch;
    }
#endif

//added
#define clrscr() printf("\e[1;1H\e[2J")

//added
struct GENERATED_PLAYER_STRUCT { 
    int x;
};
struct GENERATED_PLAYER_STRUCT xCarier;

//added
void COMPILER_TOOL_PRINT_TUI(){
    clrscr();
    printf("##| SWAE TEST |##################################################################\n");
    printf("#################################################################################\n\n");

}

void COMPILER_TOOL_PRINT_CHOICE(int id, char option[256]){
    printf("%d%s", id, option);
}


char* COMPILER_TOOL_GET_STRING_INPUT(char * buf){
    char name[50];
    fgets(name, 50, stdin);
    name[strcspn(name, "\r\n")] = 0; 
    strncpy(buf, name, 50);
    return name;
}


//added
int COMPILER_TOOL_GET_INPUT(int max){
    char pwd;
    int num;
    int m = max;
    
    printf("\n");
    while(1){
        pwd = getch();  
        if(isdigit(pwd)){
            num = (int)pwd - 48;  // b/c ASCII: nums start at 48.
            if(num <= max && num > 0)
                return num;
        }
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
    int USER_CHOICE_INPUT = COMPILER_TOOL_GET_INPUT(4);

    COMPILER_TOOL_PRINT_TUI();    
    printf("%s%d", "entered: ", USER_CHOICE_INPUT);
    COMPILER_TOOL_WAIT_FOR_INPUT();

    COMPILER_TOOL_PRINT_TUI();    
    printf("enter your name");
    printf("\n\n/> ");
    char USER_STRING_INPUT[51];
    memset(USER_STRING_INPUT, 0, 51);
    COMPILER_TOOL_GET_STRING_INPUT(USER_STRING_INPUT);


    printf("%s", USER_STRING_INPUT);
};

int main(void){
    printf("%d", (8/3));
    COMPILER_TOOL_WAIT_FOR_INPUT();
    xCarier.x = 10;
    locationOne();
    return 0;
}
