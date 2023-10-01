package Anonymous_Interfaces_46

fun main() {

    val button = Button()

//  For concrete implementation
//    button.clickListener = MyListener()
//    button.click("Button")


//    button.clickListener = object :OnClickListener{
//        override fun onClick(viewName: String) {
//            println("On Click Clicked. $viewName")
//        }
//
//    }

//    OR

    button.setMyListener(object : OnClickListener {
        override fun onClick(viewName: String) {
            println("On Click Clicked. $viewName abc")
        }

    })

    button.click("Button")


//    MAP

    val map = Map()
    map.clickListener = object : OnClickListener {
        override fun onClick(viewName: String) {
            println("$viewName Clicked!!!")
        }

    }
    map.click("MAP")
}


// Below is a concrete implementation
//class MyListener:OnClickListener{
//    override fun onClick(viewName: String) {
//        println("$viewName Clicked.")
//    }
//
//}

interface OnClickListener {
    fun onClick(viewName: String)
}

abstract class View {
    lateinit var clickListener: OnClickListener

    fun setMyListener(clickListener: OnClickListener) {
        this.clickListener = clickListener
    }

    fun click(viewName: String) {
        clickListener.onClick(viewName)
    }
}


class Button : View()
class Image : View()
class Map : View()