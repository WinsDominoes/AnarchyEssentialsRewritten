# AnarchyEssentialsRewritten
A simple plugin for anarchy servers. Warning, there might be bad languages in the default configuration file so please beware.

## About
This plugin was originally coded by Me, but I decided to rewrite all of it and add configuration and other features. 
The plugin is entirely coded by me and it is the original source code.

## Commands
This plugin contains normal commands such as
- /help
- /donate
- /info 
- /vote
- /rules
- /howto
and others. 

### Configuration (config.yml)
The default config.yml
```
# AnarchyEssentials By WinsDominoes
# AnarchyEssentials By WinsDominoes, And Pistonmaster (Hausemaster)
# Website: 10b10t.org
# VERSION 1.0 SNAPSHOT
# This a configuration file for AnarchyEssentials Plugin
# We will be adding more commands soon. :D

# How to change the style and colors
# Use § for adding colors and styles

# How do I add a new line?
#  - "Line 1"
#  - "Line 2"
# You do not need to use \n for this plugin

# Help Command for /help, this will not affect your /bukkit:help
# This command can be used by players only...
help:
    - "§6--------------------------------------------------"
    - "§3/ignore <name> to ignore a player"
    - "§3/ignorelist to list ignored players"
    - "§3/msg <name> to pm at a player"
    - "§3/r to reply to the last person that messaged you"
    - "§3/togglechat to turn chat on/off"
    - "§3/toggledeathmsgs to toggle death messages"
    - "§3/kill to kill yourself in the game"
    - "§3/tps To see the server's TPS."
    - "§3/uptime to see the server's uptime"
    - "§3/stats To see the server's world stats"
    - "§6--------------------------------------------------"

# Vote Command
# This command can be used by players only...
vote:
    - "§e-----§3 Vote For Our Server! §e-----"
    - "§31. https://minecraft-mp.com/server/242946/vote/"
    - "§32. https://topg.org/Minecraft/in-597073"
    - "§e-------------------------------------"

# Donate Command
# This command can be used by players only
donate:
    - "§6Donate§3 to help our server at §6paypal.me/10builders10tools"

# Rules Command
# Use this command if your server is fake anarchy or not anarchy.
# rules:
    # - "1. No Rules"
    # - "2. No Rules"
    # - "3. No Rules"

#This is an updated version for the rules command which will be the message displayed when the user got kicked.
rules: §4This server is no rules because it's anarchy you idiot!

# Info Command
# This command can be used by players only, default /info will work only in the console
info:
    - "§410builders§310tools is a minecraft anarchy server"

# /howto command
howto:
    - "1. Nothing 2. Nothing 3. Nothing 4. Nothing"

# /shit command, which will kill the player then display the message
shit:
    - "1. Dont ask for help, 2. Help Yourself"
```
