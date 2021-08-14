@echo off
echo ########################################################
echo .
echo .                       Menu
echo .
echo ########################################################
echo .
 
 
 
rem ########################################################
 
rem #### Subcommands execution
IF NOT "%1"=="" GOTO subcomandos
 
rem ########################################################
 
 
:menu_start
rem Variables actuales
rem Aña
echo .
echo . -------------------------------------------
echo .    Menu JDYNAMICS
echo . -------------------------------------------
set OPTION=1
SET CHOICE=
 
:menu
set CHOICES=
rem only for debbuging
rem echo CHOICE: %CHOICE%
rem  OPTION: %OPTION%
 
rem ########################################################
rem Opciones de menú
rem ########################################################
 
 
 
set LABEL=compilarLimpio
set TEXT=Compilar proyecto
set KEY=0
if "%CHOICE%"=="" echo . %KEY%. %TEXT%  
if "%OPTION%"=="%CHOICE%" OPCION ELEGIDA:  %KEY%. %TEXT%  
if "%OPTION%"=="%CHOICE%" start %CD%\menu.bat %LABEL%
if "%OPTION%"=="%CHOICE%" goto menu_start
set CHOICES=%CHOICES%%KEY%
set /a "OPTION+=1"
 
 
rem ########################################################
 
echo .
choice /C %CHOICES%
set CHOICE=%errorlevel%
set OPTION=1
goto menu
 
 
rem ########################################################
rem 
rem Subcomandos externos: se ejecutan en procesos separados
rem 
rem ########################################################
 
:subcomandos
echo . -------------------------------------------
echo .    Menu jdynamics . Subcomando %1
echo . -------------------------------------------
 
rem Ejecución del subcomando
goto %1
 
echo .
echo ERROR. Subcomando no reconocido %1
echo . 
pause
goto end
 
rem ########################################################
ren Subcomandos
rem ########################################################
 
 
:compilarLimpio
call mvn  clean install
goto end
 
 
 
rem ########################################################
 
:end
pause
exit
