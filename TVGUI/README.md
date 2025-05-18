# Description

The "App" class in JavaFX creates a virtual TV remote application. It includes a grid layout representing the remote control with buttons for channels, volume controls, and a display screen. Each channel button corresponds to a different TV show or cartoon. Clicking on a channel button changes the display screen to show the selected TV show or cartoon, along with its description. The volume can be adjusted using the volume control buttons, with the current volume level displayed on the screen. The "Channel" class serves as a helper class to manage each channel's media player, description, image path, and volume control. It includes methods to play, stop, increase, and decrease the volume of the channel's audio. Overall, the application provides a user-friendly interface for selecting TV shows and adjusting the volume, simulating a TV remote control.

# Using JavaFX

To successfully run the provided JavaFX code, you need to configure JavaFX in your development environment. This typically involves adding the JavaFX libraries to your project's build path and configuring the runtime environment to recognize JavaFX.

1. **Add JavaFX libraries to the project**: Download the JavaFX SDK from the official website or use a build tool like Maven or Gradle to manage dependencies. Then, add the JavaFX libraries to your project's build path in your IDE. This includes adding the `javafx.base`, `javafx.controls`, `javafx.fxml`, `javafx.graphics`, `javafx.media`, and `javafx.swing` modules to your project.

2. **Set module path**: If you're using Java 9 or later, you need to specify the module path to include the JavaFX modules. You can do this by adding the `--module-path` option to your compiler and runtime commands and specifying the path to the `lib` directory of the JavaFX SDK.

3. **Configure VM options**: When running your JavaFX application, you may need to specify VM options to include JavaFX modules. Use the `--add-modules` option to specify which JavaFX modules your application requires. For example: `--add-modules javafx.controls,javafx.fxml`.

4. **Ensure correct JavaFX version**: Make sure that the version of JavaFX you're using matches the version expected by your code. Incompatibilities between versions may cause runtime errors.

By configuring JavaFX properly in your development environment, you'll be able to compile and run the provided JavaFX code successfully, enabling you to interact with the simulated TV remote control interface.

# Code Demonstration

![JavaFX](https://github.com/mfahdk/Java_TVGui/assets/158589984/6ee2109b-cbb0-4bef-aba4-9ba36edce515)


