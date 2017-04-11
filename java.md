# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-4. Complete the following tasks: (~180 mins)

- [Seconds](seconds/Seconds.java)
- [Count A-s](countas/CountAs.java)
- [Pirates](pirates/Pirates.java)
- [Box](box/Box.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

### How can you generate a random number? [2p]
#### Your answer: The Math.random() method gives back a double which is greather or equal to 0 and smaller than 1. If we need an integer number, we can use (int) before Math.random() * 10. We should multiply it by 10 because when it makes an integer from the random number, it will  take the whole part of it. So with (int)(Math.random() * 10) we will get random numbers between 0 and 9. We can get random integers in an interval with adding the random integer number to the bottom of the interval and multiplying the random number with the difference of the bottom and the top of the interval. For example to generate random integers between 25 and 110 we should use this: 25 + (int) (Math.random() * 85)
