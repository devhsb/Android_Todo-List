1- Create the room database for Task

2- When Floating-A-B clicked add new Task to the database

3- Retrieve data -> observer

4- format the date and add it to the view

5- display bottomSheet fragment

6- save a todo from bottomSheet data

7- 
            - make visible and gone the hidden calendar section
            - get the dueDate from calendarView.
            --> TIP: calendarView.setOnDateChangeListener(...) --> get date from the calendarView
            --> TIP: Calender.getInstance().set(Year,month,day) --> to set the date to the selected calendarView date
            
NOT_DONE -> 8-
            - get dueDate from chips
            --> TIP: Calender.getInstance().add(Calendar.DAY_OF_YEAR, 0); -> set up today. if we give it 1 value it will give it tomorrow date and so on.