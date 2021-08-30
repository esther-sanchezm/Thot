@echo off
echo ########################################################
echo .
echo .                    Installation
echo .
echo ########################################################
echo .


:Main
  CALL :Menu
EXIT /B 0

:Menu
  echo Action to do:
  echo 1 - Up
  echo 2 - Down
  echo E - Exit
  echo.
  choice /c:12e
  SET m=%errorlevel%
  IF %m% EQU 1 CALL :MenuUp
  IF %m% EQU 2 CALL :MenuDown
  IF %m% EQU 4 CALL :Quit

  popd
EXIT /B 0

:MenuUp
  echo Service:
  echo 1 - Database
  echo 2 - Backend
  echo 3 - Frontend
  echo 4 - All
  echo E - Exit
  echo.
  choice /c:12345e
  SET m=%errorlevel%
  IF %m% EQU 1 CALL :Database
  IF %m% EQU 2 CALL :Backend
  IF %m% EQU 3 CALL :Frontend
  IF %m% EQU 4 CALL :Quit

  popd
EXIT /B 0

:MenuDown
  docker-compose down
EXIT /B 0

:Database
  docker-compose up -d mongodb
EXIT /B 0

:Backend
  cd ..
  cd backend
  call mvn clean install -f ../pom.xml
  cd thot-boot
  call mvn package -f ../thot-boot/pom.xml jib:dockerBuild
  call docker build . -t thot-backend
  docker-compose up -d thot-backend
EXIT /B 0

:Exit
  pause
EXIT /B 0
