`MaterialPlayPauseViewButton` that toggle play/pause with material animation

This an improvements of the [OHoussein PlayPauseView](https://github.com/OHoussein/android-material-play-pause-view)
and [Alex Lockwood's PlayPauseView](https://github.com/alexjlockwood/material-pause-play-animation).

# Demo

<div  align="center">    
<img src="https://raw.githubusercontent.com/Romancha/android-material-play-pause-view-button/master/media/demo.gif" alt="demo" align=center />
</div>

# Usage

## Gradle dependency:

Add the following to your project level <i>build.gradle</i>:

```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Add this to your app <i>build.gradle</i>:

```
dependencies {
    compile 'com.github.Romancha:android-material-play-pause-view-button:2.3'
}
```

## Xml layout

```xml

<org.romancha.playpause.PlayPauseView
  android:id="@+id/play_pause_view"
  android:layout_width="60dp"
  android:layout_height="60dp"
  android:clickable="true"
  android:focusable="true"
  android:foreground="?android:selectableItemBackground"
  app:fill_color="#e1e1e1"
  app:pause_bg="#00a2ed"
  app:play_bg="#001eff"/>
```

- pause_bg : the background for the pause status
- play_bg : the background for the play status
- fill_color: the icon's color

## Code

#### Click listener

```kotlin
val playPauseView = layout.findViewById<PlayPauseView>(R.id.play_pause_view)
playPauseView.setOnClickListener {
  // View clicked
  playPauseView.toggle()
}
```

#### Methods

|Methods|Description|
|---|---|
|boolean onPlaying()|View is on 'playing' state|
|boolean onPause()|View is on 'pause' state|
|toggle()|Toogle the play/pause status with animation|
|void toggle(boolean withAnim)|Toogle the play/pause status with animation or not|
|void change(boolean isPlay)|Change state of view with animation. isPlay for playing, false else|
|change(boolean isPlay, boolean withAnim) |Change state of view with specified behavior|

# License

The MIT License (MIT)

Copyright (c) 2017 Romancha

Copyright 2016 OHoussein

Copyright (c) 2015 Alex Lockwood

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
