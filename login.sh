#!/bin/bash

NAME="${1:-jcp-labs-013}"

clear
sleep 1
export PS1="\[\e]0;pi@$NAME: \w\a\]${debian_chroot:+($debian_chroot)}\[\033[01;32m\]pi@$NAME\[\033[00m\]:\[\033[01;34m\]\w \$\[\033[00m\] "

echo "
Linux $NAME 4.9.59-v7+ #1047 SMP Sun Oct 29 12:19:23 GMT 2017 armv7l

The programs included with the Debian GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Debian GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
Last login: Mon Oct 22 00:25:57 2018 from 192.168.2.1

SSH is enabled and the default password for the 'pi' user has not been changed.
This is a security risk - please login as the 'pi' user and type 'passwd' to set a new password.

"
bash -i