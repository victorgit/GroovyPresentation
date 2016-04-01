package c_date

    import groovy.time.*

    time = new TimeDuration(5, 54, 0, 30)
    assert time.toString() == "5 hours, 54 minutes, 0.030 seconds"

    use (TimeCategory) {
        println 5.hours + 54.minutes + 30.milliseconds
        println 1.week - 1.day
        println 3.days.ago
    }




    import groovy.time.TimeCategory
    import groovy.time.TimeDuration

    start = new Date()
    // do something here
    stop = new Date()
    td = TimeCategory.minus( stop, start )
    println td



    benchmark = { closure ->
        start = new Date()
        closure.call()
        now = new Date()
        TimeCategory.minus(now, start)
    }

    calculation = {
        sleep(2000)
        (0..10000).inject(0) { sum, item ->
            sum + item
        }
    }

    duration = benchmark { calculation.call() }
    println "execution took ${duration}"


