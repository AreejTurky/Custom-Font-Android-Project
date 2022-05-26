# Custom-Font-Android-Project
A sample of how to change normal font to custom based in ur choice in some tips.

### Download the font
Search the font name for what you're looking for and download it in .ttf format

### Create sub directoty in res folder
Under your project folder, create a file called "font" that will have your custom font
Then, drag and drop what you have download in this file

### Change the style.xml
Or in new versions "themes.xml" under themes folder (the 1st file) and write the follow, 
in my example i used "Times New Roman" from the following link https://fonts.google.com/?subset=arabic

<style name="TimesNewRoman">
        <item name="android:fontFamily">@font/times_new_roman</item>
        <item name="fontFamily">@font/times_new_roman</item>
        <item name="android:textStyle">normal</item>
    </style>
    
   ### Note:
   You have to initalize it for android and font family. The name should be identical to the file you had downlaod.
   
   ### Last step
   You're now able to use your font in XML files. For my example i use it in TextView item.
   style="@style/TimesNewRoman"
   
  ### Result
  ![alt text](https://github.com/AreejTurky/Custom-Font-Android-Project/blob/main/screenshot.png)
