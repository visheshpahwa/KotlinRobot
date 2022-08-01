class Robot {
    private val menu= listOf<String>("Pizza","Burger","Sandwich") //Created a list of food items



    fun ringAlarm(time:Int,restDays: String,currentDay: String) //Function to Ring Alarm
    {
        if (currentDay!=restDays){
            if(time in (24 downTo 0)){
                println("Alarm is ringing... It's $time o'clock")
            }
            else{
                println("Time is Invalid.")
            }
        }
        else{
            println("Today is Rest Day.")
        }

    }
    fun makeCoffee(choice:String,sugar:Int) //Function to make Coffee
    {
        if (choice=="Black" || choice=="With Milk"){
            println("Your $choice Coffee with $sugar spoon sugar is Ready...")
        }
        else{

            println("Please choose between Black Coffee or Coffee with Milk.")
        }
    }
    fun heatWater(temperature:Int) //Function to Heat Water
    {
        println("Water is heated to Temperature $temperature . Go get a Bath!")
    }
    fun packBag(day:String) //Function to pack Bag
    {
        when(day){
            "Monday"-> println("Science Book")
            "Tuesday"-> println("Maths Book")
            "Wednesday"-> println("English Book")
            "Thursday"-> println("Hindi Book")
            "Friday"-> println("Social Science Book")
            "Saturday"-> println("Computer Book")
            "Sunday"-> println("Off Today")
        }
        println("Your Bag is Packed")
    }
    fun cookBrunch() //Function to cook Breakfast and Lunch
    {

        println("Your ${menu.random()} is ready.")
    }
    fun ironClothes(clothes:String) //Function to Iron Clothes
    {
        println("Your $clothes is ready!!")
    }
}