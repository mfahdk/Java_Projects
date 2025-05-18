# Description

The "App" class in JavaFX creates a virtual TV remote application. It includes a grid layout representing the remote control with buttons for channels, volume controls, and a display screen. Each channel button corresponds to a different TV show or cartoon. Clicking on a channel button changes the display screen to show the selected TV show or cartoon, along with its description. The volume can be adjusted using the volume control buttons, with the current volume level displayed on the screen. The "Channel" class serves as a helper class to manage each channel's media player, description, image path, and volume control. It includes methods to play, stop, increase, and decrease the volume of the channel's audio. Overall, the application provides a user-friendly interface for selecting TV shows and adjusting the volume, simulating a TV remote control.

## JavaFX Setup & Run Instructions (Windows + VS Code)

To successfully run the provided JavaFX code, you need to configure JavaFX in your development environment. This typically involves adding the JavaFX libraries to your project's build path and configuring the runtime environment to recognize JavaFX.

This guide explains how to **run this JavaFX project using JavaFX SDK 24.0.1 and VS Code**, with full support for modular launch and JavaFX runtime.


### 1. Prerequisites

* [x] **Java JDK 17+** (recommended with preview features enabled)
* [x] **JavaFX SDK 24.0.1**
  [Download here from Gluon](https://gluonhq.com/products/javafx/)
* [x] **VS Code with the following extensions:**

  * [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  * (Optional) Pleiades or Gluon JavaFX support

### 2. Project Folder Structure

```
project-root/
├── src/
│   └── App.java            # your main JavaFX class
├── bin/                    # compiled class files (VS Code will generate)
└── .vscode/
    └── launch.json         # custom launch config with JavaFX support
```

### 3. Install JavaFX SDK 24.0.1

1. Download and extract JavaFX SDK from:
   [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)

2. Extract to:

```
C:\javafx-sdk-24.0.1
```

(make sure `lib/` exists inside this folder)


### 4. Configure VS Code

Create or edit the `.vscode/launch.json` file inside your project folder:

```json
{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "java",
      "name": "Run JavaFX App",
      "request": "launch",
      "mainClass": "App",
      "projectName": "YourProjectName", // Update if needed
      "vmArgs": "--module-path C:\\javafx-sdk-24.0.1\\lib --add-modules javafx.controls,javafx.fxml,javafx.media"
    }
  ]
}
```

> Use **double backslashes** in the path (`\\`) for Windows JSON files.

### 5. Run the App

* Open the project folder in VS Code.
* Press `F5` to launch, or go to **Run > Start Debugging**.

If successful, a JavaFX window should appear.



### 6. (Optional) Run from CMD

If you'd like to test from the command line manually:

```bash
"C:\Path\To\java.exe" ^
--module-path "C:\javafx-sdk-24.0.1\lib" ^
--add-modules javafx.controls,javafx.fxml,javafx.media ^
-cp "D:\path\to\your\project\bin" ^
App
```

> Replace `App` with your actual class name if it's in a package (e.g. `com.example.App`)

# Code Demonstration

![Image](https://github.com/user-attachments/assets/1f21dc8f-c79c-4e30-a794-7141d79929d2)
