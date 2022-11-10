#include <stdio.h>
#include <graphics.h>
#include <stdlib.h>

int main() {
     int gm, gd=DETECT, errCode;
     intitgraph(&gd,&gm, "c://tc//bgi");
     
     errCode= graphresult();
     
     if(errCode != grOk)
     {
         printf("error");
         exit(1);
     }
    
    return 0;
}

