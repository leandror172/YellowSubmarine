This is a project to implement a remote controlled submarine. When executing
the submarine console, it will ask for a list of commands (a string).
Valid commands are:
'L' - Turn Left
'R' - Turn Right
'M' - Move in the currently facing direction
'U' - Go Up
'D' - Go Down
If any one command is not valid, a message is shown. Otherwise, the command
list is executed, and the submarine's new position is show.
Position is listed as (X Y Z DIRECTION), where X, Y and Z are coordinates, and
DIRECTION is the submarine's current facing direction, which can be NORTE, SUL,
LESTE and OESTE.
After execution/error, you will be asked if you want to send a new list of  a
new list of commands. To do so, type Y. Otherwise, the application ends.
