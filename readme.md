Read Me-DiceRoller App Course: FALL_2025 CPSI 36703-9S1 - Mobile Application Development Due Date: November 6, 2025

Overview As part of the FALL_2025 CPSI 36703-9S1-Mobile Application Development course, this project is an improved version of the DiceRoller Android application that was recreated from the original instructional playlist. The application significantly enhances its functionality and user experience while retaining all essential features.

Original Tutorial Reference • Playlist: DiceRoller Tutorial Playlist • All strings and dimensions use Android resources (no hard-coded literals) Features Baseline Features (Reproduced from Tutorial) • Roll dice with button tap • Display random dice results (1-6) • Clean, functional UI matching the original tutorial • Stable build that runs without crashes on emulator/physical devices Enhanced Features - FUNCTIONALITY ENHANCEMENT Multiple Dice with Roll History: • Two dice rolling simultaneously - Roll two dice at once for more complex games • Roll history tracking - Maintains a record of the last 5 rolls • Real-time history display - Shows previous rolls in a clean, formatted list • Enhanced gaming experience - Perfect for games requiring multiple dice like craps, board games, etc. Technical Specifications • Language: Kotlin • Architecture: Standard Android Activity-based • Build System: Gradle • Minimum SDK: API 21 (Android 5.0) • Target SDK: API 34 (Android 14) Code Structure kotlin MainActivity.kt - Handles dice rolling logic and UI updates activity_main.xml - Layout with two ImageViews for dice and history TextView Key Implementation Details: • Dice Management: Uses ImageView components for visual dice representation • Random Generation: Random.nextInt(1, 7) for fair dice rolls • History Management: MutableList with FIFO (First-In-First-Out) behavior • Resource Management: All strings properly externalized in strings.xml Setup & Installation Prerequisites • Android Studio Flamingo or later • Android Emulator or physical device with USB debugging enabled • Minimum API Level 21 Building the Project

Clone this repository
Open Android Studio and select "Open an existing project"
Navigate to the cloned repository and open it
Wait for Gradle sync to complete
Build the project (Build > Make Project)
Run on emulator or connected device (Run > Run 'app') APK Installation
Locate the provided APK file in submissions
Enable "Install from unknown sources" if needed
Install the APK on your Android device
Launch the DiceRoller app Demo Video https://youtube.com/shorts/9GPC3O1e5Fo?feature=share The video demonstrates: • Enhanced two-dice rolling feature • Roll history tracking and display • App stability and smooth performance • User interface responsiveness Screenshots

![Alt text]("screenshorts/screenshot1.png?raw=true" "Optional title")