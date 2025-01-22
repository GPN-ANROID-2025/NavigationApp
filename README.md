# Day 5 : Android Activity and Navigation Guide

This repository provides a guide to understanding key concepts in Android development, focusing on the Activity, Activity Lifecycle, Navigation, and Intents. These are fundamental building blocks of Android app development, and mastering them is essential for building robust and user-friendly applications.

## Topics Covered

### 1. **Activity**
   - An Activity represents a single screen in an Android app. It is a crucial component in the Android application structure, as it provides the user interface (UI) for interaction.
   - This section covers how to define, launch, and manage activities in an Android app.

### 2. **Activity Lifecycle**
   - Every Activity has a lifecycle that dictates how it interacts with the system and the user. Understanding the lifecycle is important for managing UI updates, memory usage, and performance.
   - Topics include the following lifecycle methods:
     - `onCreate()`
     - `onStart()`
     - `onResume()`
     - `onPause()`
     - `onStop()`
     - `onDestroy()`
    
![Activity Lifecycle Image](https://developer.android.com/guide/components/images/activity_lifecycle.png)



### 3. **Navigation**
   - Android provides a navigation framework that helps manage app flow, including switching between activities and passing data between them.
   - Topics covered:
     - Using `Intent` to navigate between activities.
     - Using the Navigation Component for more complex navigation scenarios (e.g., handling back stacks, deep linking).

### 4. **Intents**
   - Intents are messages that allow components to request actions from other components, either within the same app or across different apps.
   - There are two types of intents:
     - **Explicit Intents**: Used to start a specific Activity.
     - **Implicit Intents**: Used to request an action from another app (e.g., opening a web page).

