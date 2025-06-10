# 🐍 Snake Game: Classic Arcade Experience in Java

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)  
[![Java](https://img.shields.io/badge/Java-11%2B-orange.svg)]() [![Swing](https://img.shields.io/badge/Swing-GUI-red.svg)]() [![Game](https://img.shields.io/badge/Genre-Arcade-purple.svg)]()

---

## 🎮 Game Overview

A modern implementation of the classic Snake arcade game built with Java Swing. Guide your snake to collect food, grow longer, and achieve the highest score possible while avoiding collisions with walls and your own tail!

## ✨ Features

🎯 **Classic Gameplay** - Traditional snake mechanics with smooth movement  
🍎 **Food Collection** - Collect apples to grow your snake and increase score  
📊 **Score Tracking** - Real-time score display and high score management  
🎨 **Custom Graphics** - Beautiful sprite-based visuals with custom assets  
⌨️ **Intuitive Controls** - Arrow key navigation for seamless gameplay  
🔄 **Game States** - Start screen, gameplay, and game over states  
💾 **High Score System** - Track and save your best performances  

## 🚀 Quick Start

### Prerequisites
- Java 11 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Installation & Run

```bash
# Clone the repository
git clone https://github.com/MuhammadAli2603/snake-game.git
cd snake-game

# Compile the game
javac *.java

# Run the game
java Main
```

### Default Login Credentials
```
USERNAME: Ali
PASSWORD: 123
```
*Note: These can be modified in the Login.java class*

## 🎮 How to Play

1. **Launch** the game by running `Main.java`
2. **Login** with the provided credentials
3. **Use Arrow Keys** to control your snake:
   - ↑ Move Up
   - ↓ Move Down  
   - ← Move Left
   - → Move Right
4. **Collect Food** (red apples) to grow your snake and increase score
5. **Avoid Collisions** with walls and your own tail
6. **Beat Your High Score** and challenge yourself!

## 🏗️ Project Structure

```
snake-game/
├── Main.java                 # Entry point and main game class
├── Login.java               # User authentication system
├── Menu.java                # Game menu and navigation
├── SnakeGame.java          # Core game logic and mechanics
├── HighScoreManager.java   # Score tracking and persistence
├── README.md               # This file
└── assets/
    ├── apple_red.png       # Food sprite
    ├── back.jpg           # Background image
    ├── body.png           # Snake body segment
    ├── head.png           # Snake head sprite
    └── black_colorful_minimalist_artist.jpg
```

## 🎯 Game Mechanics

- **Snake Movement**: Continuous movement in the current direction
- **Growth System**: Snake grows by one segment per food item consumed  
- **Collision Detection**: Game ends on wall or self-collision
- **Score Calculation**: Points awarded based on food collected
- **Speed**: Game speed may increase as snake grows (configurable)

## 🛠️ Customization

### Modify Game Settings
Edit the game parameters in `SnakeGame.java`:
- Game board size
- Snake speed
- Food spawn rate
- Scoring system

### Change Login Credentials
Update the authentication in `Login.java`:
```java
// Modify these values
private static final String USERNAME = "YourUsername";
private static final String PASSWORD = "YourPassword";
```

### Custom Graphics
Replace the image files in the assets folder with your own:
- `head.png` - Snake head sprite
- `body.png` - Snake body segments  
- `apple_red.png` - Food item
- `back.jpg` - Game background

## 🏆 High Scores

The game automatically tracks and saves your highest scores using the `HighScoreManager` class. Scores persist between game sessions.

## 🤝 Contributing

1. Fork this repository
2. Create a feature branch (`git checkout -b feature/awesome-feature`)
3. Commit your changes (`git commit -m "Add awesome feature"`)
4. Push to the branch (`git push origin feature/awesome-feature`)
5. Open a Pull Request

## 📋 Future Enhancements

- [ ] Multiple difficulty levels
- [ ] Power-ups and special items
- [ ] Multiplayer support
- [ ] Sound effects and background music
- [ ] Leaderboard system
- [ ] Mobile-responsive version
- [ ] Different game modes (timed, obstacles, etc.)

## 🐛 Known Issues

- Login credentials are hardcoded (can be customized)
- High scores stored locally only

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Classic Snake game concept from Nokia mobile phones
- Java Swing documentation and community
- Retro gaming inspiration

---

**Ready to play?** Clone the repo and start your Snake adventure! 🐍🎮
