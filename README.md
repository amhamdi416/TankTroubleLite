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

- **Builder** (`MazeBuilder`): constructs mazes by adding walls step by step
- **Factory** (`MazeFactory`): provides ready-made maze layouts
- **Strategy** (`MovementStrategy`): lets tanks use different movement behaviors

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

- [Your name]
- [Partner's name]
