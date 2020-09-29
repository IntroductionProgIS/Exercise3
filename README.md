# Exercise 3

The aim of this exercise is to create a color picker containing:

  - **A List of Sliders** to modify and navigate each color
  - **A List of Textfields** to modify each color by inputing the proper value
  - **A textField for Hexadecimal** to view and/or input the color value in hexadecimal
  - **A Square view** to show the color resulting from the parameters

<p align="center"><img src="/img/ColorPicker.png" width="600"></p>


1. Import this project in Eclipse *To import this project in eclipse, you should open Eclipse and follow these steps:*
   1. *Go to File \> Import...*
   2. *Select Git \> Projects from Git*
   3. *Select Clone URI*
   4. *Fill the URI box with `https://github.com/IntroductionProgIS/Exercise3.git` (All the other parts should be automatically filled)*
   5. *Click on "Next", "Next" and "Finish"*

> *To see the tasks that you need to do in a project: Go to Eclipse and select Window \> Show View \> Tasks*

2. Setup the project properties to add the .jar from javafx to the project and add your JRE by going in the same window through *Add Librairy... \> JRE System Library \> Finish* 

3. Create a run configuration for this project, inside Run As \> Run Configurations, with Main.java as the main class. Inside Arguments for this configuration, add inside the VM arguments : "--add-module=javafx.controls --add-module=javafx.fxml"

4. Understand the construction of the project by looking at the classes in controller, model and view packages.

5. Adding the visual elements inside the view.

6. Binding the visual elements with the controllers.

7. (Optional) Recreate the view in a new project using Scene Builder.
 

