Notice
---------
**Circular List Adapter** is now part of an even more awesome [Adapter Kit] project!

About
-----

Circular list adapter for Android's [ListView][list-view-link]. This adapter makes your existing list adapter appear circular and possibly infinite unless you scroll down through two billion list items ;). Works with list adapters that you already have. No project specific dependencies. Just include the [latest jar][jar-download] or the [sources][sources-download-link] to your Android project.

Pros
----

  - From finite to infinite list items with just a single argument constructor.

Compatibility
-------------

  - Android 1.6 and up

Usage
-----

    // 1. Wrap your existing adapter with the CircularListAdapter
    CircularListAdapter circularAdapter = new CircularListAdapter(yourAdapter);
    
    // 2. Set the adapter to your ListView
    listView.setAdapter(circularAdapter);

Also you can check a [complete example][simple-example-link] for a quick start. The [sources][sources-download-link] have a few more examples as well.

Screenshots
-------------------
<img src="https://dl.dropbox.com/u/18586857/open-source/screenshots/cla-ss1.png"> &nbsp; <img src="https://dl.dropbox.com/u/18586857/open-source/screenshots/cla-ss2.png">

Attribution
-----------
The fabulous spectrum background was downloaded from [TECHSTARTD][youtube-channel-link]

License
---------------------

    Copyright 2012 Mobs and Geeks

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

  [Adapter Kit]: https://github.com/mobsandgeeks/adapter-kit
  [list-view-link]: http://developer.android.com/reference/android/widget/ListView.html
  [google-search]: https://www.google.co.in/search?ie=UTF-8&q=android+section+adapter
  [github-project]: https://github.com/ragunathjawahar/circular-list-adapter
  [sources-download-link]: https://github.com/ragunathjawahar/circular-list-adapter/zipball/master
  [jar-download]: https://github.com/ragunathjawahar/circular-list-adapter/downloads
  [simple-example-link]: https://github.com/ragunathjawahar/circular-list-adapter/blob/master/src/com/mobsandgeeks/demo/CircularSentenceActivity.java
  [youtube-channel-link]: http://www.youtube.com/watch?v=09NobleGXns
  
