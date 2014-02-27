@echo off

setlocal

if "%2" == "" (
    set run_mode=run
) else (
    set run_mode=%2
)

if "%1" == "" goto get_instance_name
set instance_name=%1
goto instance_name_ok

:get_instance_name
set /p instance_name=Please input valid instance name [instance1]:

if not "%instance_name%" == "" goto instance_name_ok
set instance_name=instance1

:instance_name_ok
cd tcServer-6.0

call tcruntime-ctl.bat %instance_name% %run_mode%
endlocal
