# MVPDemo
Android MVP Architecture is address the common difficulties such as maintainability and testability.So in this article, We will discuss
the various difficulties that address by Android MVP Architecture.
# What is MVP ..?
MVP (Model View Presenter) design pattern is derived from MVC pattern most of the things is same, where is the controller is replaced by presenter. The MVP design pattern is set of guidelines that should follow for better code reusability and testability. As per MVP guidelines application divided into three part Model, View Presenter.
# Key point of MVP design pattern
1. MVP pattern addresses the common difficulties in android app, especially problem is related to maintainability and testability.
2. Model View Presenter increases the view separation of the concern and facilitated unit testing .
3. In the MVP pattern, we can separate background task from activity, fragment views to make them independent of most life cycle related event   
4. Using a consistent architectural and design pattern the development process become much more consistent, a lot of easier and transparent.
5. This way the application become more simpler, overall application reliability increases remarkable. The application code become cleaner and readable. Code maintainability become better and most importantly becomes fun and developer are Happy 🙂 .
# How MVP work ?
The MVP pattern is user interface software architecture pattern that reduces the behavior of UI component. In this case, it reduces the interaction with Activity and Fragments bare minimum by using Presenter. The Pressenter simply a controller like class to handle presentation logic and update view accordingly.  Using presenter we can write business logic in presenter layer that have minimum interaction with views that make much easier to test and much faster to test. Why it makes faster to test, well simply put we no longer need to test input and output. the android content is gone so we no need of android emulator and device, We just need on JVM for running test which is quite fast.
# Working with Dragger2
In this project, we are using Dagger2 with MVP. So don’t think much about Dagger2 read our another article with a complete explanation of Dagger2. In this project, I’m using dagger without explanation. Just put as per giving instruction.
