# AnarchyEssentialsRewritten
A simple plugin for anarchy servers. Warning, there might be inappropriate language in the default configuration file so please beware.

## About
This plugin was originally coded by Me, but I decided to rewrite all of it and add configuration and other features. 
The plugin is entirely coded by me and it is the original source code.

If you are upgrading to a newer version, you might need to delete the old configuration then start the server and it will generate a new config. 

### Authors
This plugin was made by WinsDominoes (Owner of 10builders10tools or 10b10t.org). 

And special thanks to Pistonmaster for helping me code some other features such as the reload command. 
Here is his Github Page :D https://github.com/AlexProgrammerDE

### Plugin Support
If you have any questions, or need support. Please join our discord server
https://discord.gg/fDbYgpu

### Donations
If you want to support the plugin and also the server of 10b10t.org, 
please click on this link: https://ko-fi.com/10b10t.

#### Reload Command
To reload the configuration you can use the command /aereload

The permission is: ae.reload

## Commands
This plugin contains normal commands such as
- /help
- /donate
- /info 
- /vote
- /rules
- /howto
and others. 

# Videos 
[![Watch the video](https://winsvideo.net/uploads/videos/5f38a5ce256e1.mp4)](https://winsvideo.net/uploads/videos/5f38a5ce256e1.mp4)


### Configuration (config.yml)
The default config.yml
```
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

#This is an updated version for the rules command which will be the reason why the player is kicked
rules: This server is no rules because it's anarchy you idiot!

# Info Command
# This command can be used by players only, default /info will work only in the console
info:
    - "§410builders§310tools is a minecraft anarchy server"

# /howto command, this command will send this message to the players
howto:
    - "1. Fuck off, 2. Kys, 3. Get the fuck outta here, 4. Get your ass outta here, 5. Leave"

# /shit command, this command will kill players
shit:
    - "1. Dont ask for help, 2. Help Yourself"

# /tpa command for vanilla servers, this command will kill the player and send this message
tpa:
    - "You think that would work? In your dreams"

# /home for you to troll people with, this command will kick the player with the reason specified
home:
    - "You aint getting that command aren't ya"

# /sethome this command will kill the player and send this message
sethome:
    - "Ahhhhh ok, you tryna set your home? Get the hell outta here"
```
