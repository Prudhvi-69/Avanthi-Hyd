@echo off
:loop
git add -A
git commit -m "auto push: %date% %time%"
git push origin main
timeout /t 69 /nobreak >nul
goto loop
