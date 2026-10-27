# TankTroubleLite

A two-player Java tank game inspired by Tank Trouble.

> **Status: Work in progress.** Core maze and tank movement are in place; gameplay features are still being built.

## Current Features

- **Maze system:** grid-based mazes with walls and boundary checking
- **Preset layouts:** small, open, and corridor mazes via `MazeFactory`
- **Tank movement:** tanks move through the maze and are blocked by walls and edges
- **Swappable movement behavior:** movement is controlled by strategy classes (currently basic left and right)

## Planned Features

- [ ] Player-controlled movement (keyboard input)
- [ ] Shooting and bullets
- [ ] Collision and hit detection
- [ ] Two-player gameplay with scoring
- [ ] Graphical display of the maze and tanks
- [ ] More maze layouts

## Project Structure

```
tanktroublelite/
├── maze/       Maze, MazeBuilder, MazeFactory
├── strategy/   MovementStrategy and its implementations
└── tank/       Tank
```

## Design Patterns Used

- **Builder** (`MazeBuilder`): Constructs mazes by adding walls step by step. Since we are familiar with a maze builder  
                               we thought incorporating a maze builder for our game would suit it perfectly since
                               we learned the pattern in class and throughout our polymorphia homeworks. And this
                               pattern makes it easier to create different maze layouts as we continue working on 
                               the project.
- **Factory** (`MazeFactory`): Provides ready-made maze layouts. As we continue working on it, we will add 
                               more maze layouts for players to choose from when playing the game. This separates
                               the creation of specific maze layouts from the rest of the game.
- **Strategy** (`MovementStrategy`): Lets tanks use different movement behaviors. As we continue working on 
                                     it, we will implement the strategy for the player who uses WASD keys and
                                     the strategy for the player using the arrow keys. With the common interface
                                     for the tanks movement behavior, it keeps the tanks movement logic separate
                                     from specific behaviors used.

## Getting Started

**Requirements:** Java [version, e.g. 17+]

```bash
# Compile
javac -d out $(find . -name "*.java")

# Run
java -cp out tanktroublelite.[MainClassName]
```

## Controls

[To be added once player input is implemented]

## Authors

- Amir Mhamdi
- Alan Ayala
