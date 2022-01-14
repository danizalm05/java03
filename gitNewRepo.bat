cls
 
@echo off
del .git 
git init
pause
git status

pause
git add .
git commit -m  "first commit"  
pause
git branch -M master
pause
                      
git remote add origin https://github.com/danizalm05/java03.git
git remote -v
pause 
cls
git push -u origin master

pause