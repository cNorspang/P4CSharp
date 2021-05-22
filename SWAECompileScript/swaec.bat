@echo off

FOR /F "tokens=1-10 delims=." %%a in ("%*") do (

SWAE %*

if %%a==-h EXIT /B 1
if %%a==help EXIT /B 1
 
gcc %%a.c -o %%a
del %%a.c 

)

