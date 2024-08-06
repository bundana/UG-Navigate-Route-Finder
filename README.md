### UG Navigate - Route Finder Application

#### Overview

UG Navigate is a desktop application for navigating the University of Ghana campus. It helps users find optimal routes between various locations and landmarks, offering features to calculate distances and generate routes using different algorithms.

---

### Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [How It Was Built](#how-it-was-built)
4. [Classes and Methods](#classes-and-methods)
5. [Data Structures and Algorithms](#data-structures-and-algorithms)
6. [Screenshots](#screenshots)
7. [Contributing](#contributing)
8. [License](#license)

---


### Installation

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/bundana/UG-Navigate-Route-Finder/
   ```

2. **Compile the Code**:
   Ensure you have JDK installed and run:
   ```sh
   javac *.java
   ```

3. **Run the Application**:
   ```sh
   java Main
   ```

---

### Usage

1. **Launch the Application**:
    - Run the `Main` class to start the application.

2. **Find Routes**:
    - **Select Start Location**: Choose a starting point from the dropdown menu.
    - **Select End Location**: Choose a destination from the dropdown menu.
    - **Optional Landmark**: Choose a landmark to include in the route if desired.
    - **Click "Find Route"**: View the results in a separate window showing the route details.

3. **View Results**:
    - **Route Window**: Displays the calculated route, nearby landmarks, and algorithm details.

---

### How It Was Built

- **Programming Language**: Java
- **UI Framework**: Swing for GUI components.
- **Data Management**: Utilized HashMaps to manage predefined locations and landmarks.
- **Routing Algorithms**:
    - **Greedy Algorithm**: Selects the nearest unvisited location to build the route.
    - **Dynamic Programming**: Uses the Floyd-Warshall algorithm for calculating shortest paths.

---

### Classes and Methods

#### `Main`

- **Purpose**: Entry point of the application; initializes and displays the login window.

#### `MapUtils`

- **Purpose**: Provides utility methods for managing locations and landmarks.
- **Key Methods**:
    - `getLocationByName(String name)`: Retrieve location by name.
    - `calculateDistance(Location loc1, Location loc2)`: Compute distance using Haversine formula.
    - `calculateRouteGreedy(Location start, Location end, Location landmark)`: Greedy approach for route calculation.
    - `calculateRouteDynamic(Location start, Location end, Location landmark)`: Dynamic approach using Floyd-Warshall algorithm.


#### `Location`

- **Purpose**: Represents a geographical location with name, latitude, and longitude.

#### `ResultWindow`

- **Purpose**: Displays routing results, including route details and nearby landmarks.
- **Key Method**:
    - `buildResultText(...)`: Generates formatted text for the results.

#### `RouteFinder`

- **Purpose**: GUI for users to select locations, compute routes, and view results.
- **Key Method**:
    - `main(String[] args)`: Launches the application.

---

### Data Structures and Algorithms

- **HashMap**: Used to store locations and landmarks.
- **ArrayList**: Manages lists of locations and landmarks.
- **2D Array**: Used in the Floyd-Warshall algorithm for distance matrices.
- **Algorithms**:
    - **Haversine Formula**: Calculates distances between geographic coordinates.
    - **Greedy Approach**: Constructs routes by selecting nearest unvisited locations.
    - **Floyd-Warshall Algorithm**: Computes shortest paths between all pairs of locations.

---

### Screenshots
 
![image](<resources/readme/screenshot (1).png>) 
![image](<resources/readme/screenshot (2).png>)  
![image](<resources/readme/screenshot (4).png>) 
![image](<resources/readme/screenshot (5).png>)  
![image](<resources/readme/screenshot (7).png>) 
![image](<resources/readme/screenshot (8).png>) 
![image](<resources/readme/screenshot (9).png>) 
---

### Contributing

1. **Fork the Repository**.
2. **Create a New Branch**:
   ```sh
   git checkout -b feature/your-feature
   ```
3. **Commit Your Changes**:
   ```sh
   git commit -am 'Add new feature'
   ```
4. **Push to the Branch**:
   ```sh
   git push origin feature/your-feature
   ```
5. **Submit a Pull Request**.

---

### License

This project is licensed under the MIT License - see https://opensource.org/license/mit for details.



