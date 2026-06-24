@echo off
REM Build script: compiles all .java files into bin/ and creates employee-app.jar with Main-Class employee.employemenu
set ROOT=%~dp0
set BIN=%ROOT%bin


















pauseecho Built employee-app.jarjar cfm employee-app.jar manifest.txt -C "%BIN%" .
ndel manifest.txtecho Main-Class: employee.employemenu>manifest.txtpopd)  )    exit /b 1    popd    echo Compilation failed for %%f  if errorlevel 1 (  javac -d "%BIN%" "%%f"  echo Compiling %%ffor /r %%f in (*.java) do (pushd "%ROOT%"mkdir "%BIN%"if exist "%BIN%" rmdir /s /q "%BIN%"n