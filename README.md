# Mines-Game-Simulator

A Java Swing desktop simulation of the popular Mines gambling game built in NetBeans.

## Overview

This project recreates the core mechanics of the popular Mines gambling game in a standalone desktop application using Java Swing.  
Players can place bets, select mine counts, reveal tiles, cash out profits, and manage their in-game balance.

The game includes a fully interactive GUI, dynamic multiplier calculations, random mine generation, and persistent balance storage.


## Features

- 5x5 interactive game grid
- Configurable mine count (1–24 mines)
- Real-time multiplier calculation
- Cashout system
- Random tile selection feature
- Persistent balance saving
- Interactive hover effects
- Dynamic profit calculation
- Custom UI design with images/icons
- Input validation for betting
- Win/Loss overlay system


## Technologies Used

- Java
- Java Swing
- NetBeans IDE


## Game Mechanics

The multiplier system is based on probability calculations and RTP logic.<br>
The multiplier dynamically increases after every successful safe tile reveal.<br>
Example formula used:

```java
probability *= (double)(totalTiles - mines - i) / (totalTiles - i);
multiplier = (1.0 / probability) * rtp;
```

Current RTP:
- around 97%





## How to Run

1. Clone the repository

```bash
git clone https://github.com/SebastijanPecenko/Mines-Game-Simulator.git
```

2. Open the project in NetBeans

3. Build and run the application


## Future Improvements

- Sound effects
- Animation system
- Better game balancing
- Cleaner code and fixing bugs


## Disclaimer

This project was created for educational and simulation purposes only.<br>
No real-money gambling is included.
