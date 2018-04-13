# KotlinBasics
This Repository Contains basic Syntax for Kotlin programming. The motice of this repo is to provide quick referrence to kotlin  syntaxes

Creating OnClickListeners in Kotlin
* OnclickListeners Old Way
 By Implementing them in the class

``` 

class MainActivity : AppCompatActivity(),  View.OnCLickListner 
{

 override fun oncreate(....){
 
  YourButtonReference.setOnclickListener(this)
 }



override fun onClick(view: View?) {
        Yours code goes here
      }

}

```

* By creating OnclickListeners objects
```
 //Adding a Listener to Add two Numbers
        var commonListener = object: View.OnClickListener{
            override fun onClick(view: View?) {


                //Since this view can be nullable to we have to put a ? mark
                when(view?.id ){
                   R.id.addbutton-> {                           //This is used when the add button is clicked
                       val num1 = num1et.text.toString().toInt()
                       val num2 = num2et.text.toString().toInt()

                       resultText.setText( (num1+num2).toString())
                    }
                }
            }
        }
    
    
    //Pass this variable to the setOnclickListener of a button
    
    addbutton.setOnClickListener(commonListener)

```

* Kotlin Way
```

buttonReference.setOnClickListener{
      var sum =1+1
       ..
       ...
       ... Your Code }

```



* Intents 
```
var intent=   val intent: Intent = Intent(applicationContext, YOURDESIREDACTIVITY::class.java)
startActivity(intent)
```

* Passing Data/Objects in Intents 

The Object which we want to pass through intents can be passed through two ways
        * By Implementing Serializable interface
        * By Implementing Parcalabel interface

below is the example of Serizable Interface
```
class Animal( val name: String,  val breed: String) :Serializable  {


}
```
Now Passing the Object in Intent 
```
  val dog = Animal("dog", "lab")
   val intent: Intent = Intent(applicationContext, AnimalResults::class.java)
            intent.putExtra("dog",dog )
   startActivity(intent)         
```

Now Retriving the Object from intent
```
 var intent = intent
 val dog = intent.getSerializableExtra("dog") as? Animal

```







