import java.text.SimpleDateFormat

// -------------------------------------------- START OUTBOUND DATE CALCULATION ------------

for (int i = 0; i < 15000; i++) {
    // Days of the week
    daysOfWeek = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    season = "Low web"
    def today = Calendar.instance

    today.add(Calendar.DATE, 322);
    def Dateok = false;
    prepareDepartDate();

    def outDateString = new SimpleDateFormat("yyyy-MM-dd").format(outDate.time) + "T00:00:00";
//    println("Out Date #$i: $outDateString")


    while (!Dateok) {
        if (outDate > today) {
            println("Now I'm here")
            prepareDepartDate();
            outDateString = new SimpleDateFormat("yyyy-MM-dd").format(outDate.time) + "T00:00:00";
//            println("Out Date into if #$i: $outDateString")
        } else {
//            println("Here!!!!!11")
            Dateok = true;
            break;
        }
    }

// -------------------------------------------- END OUTBOUND DATE CALCULATION ---------

// -------------------------------------------- START RETURN DATE CALCULATION ---------

// Set the inbound date to the outbound date and add as many hours, days, months or years as you want
    inDate = outDate;
    inDate.add(Calendar.HOUR, 0); // Add x amount of hours to the inbound date - can be 0 to add nothing or negative to go back in time
    inDate.add(Calendar.DATE, 7); // Add x amount of days to the inbound date - can be 0 to add nothing or negative to go back in time
    inDate.add(Calendar.MONTH, 0);// Add x amount of months to the inbound date - can be 0 to add nothing or negative to go back in time
    inDate.add(Calendar.YEAR, 0); // Add x amount of years to the inbound date - can be 0 to add nothing or negative to go back in time

// What day of the week do you want to return on?
// If the resulting date does not fall on the day you want keep adding days until it does
    actualInboundDay = daysOfWeek[inDate.get(Calendar.DAY_OF_WEEK) - 1];
    while (actualInboundDay != expectedInboundDay) {
        inDate.add(Calendar.DATE, 1);
        actualInboundDay = daysOfWeek[inDate.get(Calendar.DAY_OF_WEEK) - 1];
    }

// Format the calculated date to the pattern specified below - this value will be passed into the request
    def inDateString = new SimpleDateFormat("yyyy-MM-dd").format(outDate.time) + "T00:00:00";
//    println("In Date #$i: $inDateString");

// -------------------------------------------- END RETURN DATE CALCULATION ---------------
    if (outDate.time <= Calendar.instance.time || outDate.time > inDate.time) {
        println("DATE MUST BE IN FUTURE\n${Calendar.instance.time}")
    }
}
println("the end!")

def prepareDepartDate() {
    Random random = new Random()
    // Set the outbound date to today's date - add as many hours, days, months or years as you want
    outDate = Calendar.instance;
    outDate.add(Calendar.DATE, random.nextInt(28 - 1));
    outDate.add(Calendar.MONTH, random.nextInt(10 - 1));

    expectedOutboundDay = expectedInboundDay = "Friday"

    if (season == "Low Web") {

        if (outDate.get(Calendar.MONTH) == 5)
            outDate.add(Calendar.MONTH, 3);
        else if (outDate.get(Calendar.MONTH) == 6)
            outDate.add(Calendar.MONTH, 2);
        else if (outDate.get(Calendar.MONTH) == 7)
            outDate.add(Calendar.MONTH, 2);
        else if (outDate.get(Calendar.MONTH) == 8)
            outDate.add(Calendar.MONTH, 1);
        else if (outDate.get(Calendar.MONTH) == 11)
            outDate.add(Calendar.MONTH, -1);
        else if (outDate.get(Calendar.MONTH) == 1)
            outDate.add(Calendar.MONTH, 1);

    } else if (season == "High Web") {
        if (outDate.get(Calendar.MONTH) == 1)
            outDate.add(Calendar.MONTH, 4);
        else if (outDate.get(Calendar.MONTH) == 2)
            outDate.add(Calendar.MONTH, 5);
        else if (outDate.get(Calendar.MONTH) == 3)
            outDate.add(Calendar.MONTH, 3);
        else if (outDate.get(Calendar.MONTH) == 4)
            outDate.add(Calendar.MONTH, 1);
        else if (outDate.get(Calendar.MONTH) == 9)
            outDate.add(Calendar.MONTH, 8);
        else if (outDate.get(Calendar.MONTH) == 10)
            outDate.add(Calendar.MONTH, 7);
        else if (outDate.get(Calendar.MONTH) == 11)
            outDate.add(Calendar.MONTH, 6);
    }

    // If the resulting date does not fall on the day you want keep adding days until it does
    actualOutboundDay = daysOfWeek[outDate.get(Calendar.DAY_OF_WEEK) - 1];
    while (actualOutboundDay != expectedOutboundDay) {
        outDate.add(Calendar.DATE, 1);
        actualOutboundDay = daysOfWeek[outDate.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
