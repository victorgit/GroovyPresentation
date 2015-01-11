package date

import groovy.time.*

def time = new TimeDuration(5, 54, 0, 30)
assert "5 hours, 54 minutes, 0.030 seconds" == time.toString()

use (TimeCategory) {
    println 5.hours + 54.minutes + 30.milliseconds
    println 1.week - 1.day
    println 3.days.ago
}



