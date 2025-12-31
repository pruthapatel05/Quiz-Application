# Simple Minds - Quiz Application

A desktop-based Java quiz application built using Java Swing. Test your knowledge with Java programming questions in an interactive and engaging quiz format.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Java_Swing-007396?style=for-the-badge&logo=java&logoColor=white)



## ✨ Features

- **User-Friendly Interface**: Clean and intuitive graphical user interface using Java Swing
- **Interactive Quiz**: 10 multiple-choice questions on Java programming concepts
- **Timer Functionality**: 15 seconds per question to add excitement and challenge
- **50-50 Lifeline**: Eliminate two incorrect options to help you find the right answer
- **Score Tracking**: Real-time score calculation based on correct answers (10 points per question)
- **User Personalization**: Enter your name for a personalized quiz experience
- **Rules Page**: Clear instructions and fun rules before starting the quiz
- **Score Display**: Final score screen with option to play again


## 🛠️ Technologies Used

- **Java**: Core programming language
- **Java Swing**: For building the graphical user interface
- **AWT (Abstract Window Toolkit)**: For event handling and graphics

## 📁 Project Structure

```
Quiz_App/
│
├── java--quiz/
│   ├── src/
│   │   ├── Quiz/
│   │   │   ├── login.java          # Login screen with name input
│   │   │   ├── rules.java          # Rules and instructions screen
│   │   │   ├── quiz.java           # Main quiz interface with questions
│   │   │   └── score.java          # Score display screen
│   │   └── Icons/
│   │       ├── login.jpeg          # Login screen image
│   │       ├── quiz.jpg            # Quiz screen header image
│   │       └── score.png           # Score screen image
│   ├── bin/                        # Compiled class files (generated)
│   └── lib/                        # Library files
│
├── .gitignore                      # Git ignore file
└── README.md                       # Project documentation
```

## 📋 Prerequisites

Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher
  - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
- **Java Runtime Environment (JRE)**: Included with JDK
- **IDE (Optional)**: IntelliJ IDEA, Eclipse, or VS Code for easier development

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/pruthapatel05/Quiz-Application.git
   cd Quiz-Application
   ```

2. **Navigate to the source directory**
   ```bash
   cd java--quiz/src/Quiz
   ```

3. **Compile the Java files**
   ```bash
   javac -d ../../../bin Quiz/*.java
   ```

   Or compile all files at once:
   ```bash
   cd java--quiz/src
   javac -d ../bin Quiz/*.java
   ```

## 💻 Usage

### Running the Application

1. **Run the login screen** (Main entry point):
   ```bash
   cd java--quiz/src
   java Quiz.login
   ```

   Or from the bin directory (after compilation):
   ```bash
   cd java--quiz/bin
   java Quiz.login
   ```

2. **Application Flow**:
   - Enter your name in the login screen
   - Click "Rules" to view the quiz rules
   - Click "Start" to begin the quiz
   - Answer 10 multiple-choice questions
   - Use the "50-50 Lifeline" button to eliminate two wrong options (one-time use)
   - Submit your answers to view your score
   - Click "Play Again" to restart the quiz

### Using an IDE

1. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.)
2. Import the `java--quiz` folder as the source root
3. Run the `login.java` file as the main class


---

⭐ If you found this project helpful, please consider giving it a star!

