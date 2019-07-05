@echo off
color 0A
cd..
git status
git add -A
git commit -m "%random%"
git push