package kr.hs.dgsw.work01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //val textView1 :findViewById<TextView>(R.id.mytext01)
        //textView1.text = "safdasdf"
        //val textView : findViewById(R.id.text1)

        val textView1 = findViewById<TextView>(R.id.mytext01)
        textView1.text = "123123123"

        val buttion1 = findViewById<TextView>(R.id.button1)
        buttion1.setOnClickListener(View.OnClickListener {
            textView1.text = "1111111111111"
        })

        val buttion2 = findViewById<TextView>(R.id.button2)
        buttion1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

            }

        })

//        textView.setOnClickListener {
//            Log.d("click", "Click!!")
//        }
//
//        // 2 -> 익명 함수 방식
//        textView.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Log.d("click", "Click!!")
//            }
//        })
//
//        // 3 -> 이름이 필요한 경우(click)
//        val click = object : View.OnClickListener {
//            override fun onClick(v: View?) {
//
//            }
//        }



//        Log.d("test","121212");
//
//        var a = 10;
//        var b:Int = 20;
//        println(a)
//
//        if(a==10){
//            textView1.text = "true"
//        }
//        for(i in 0..10){
//            Log.d("test","data : "+i);
//            Log.d("test","data1 : $i");
//        }
//        for(i in 10 downTo 0 step 3){
//            Log.d("test","data : "+i);
//            Log.d("test","data1 : $i");
//        }
//        var p1 = person()
//        Log.d("test","p1.a : "+p1.b);
//        test1()
    }
    class person(){
        var a = 0;
        val b = 10;

    }
    fun test1(){
        Log.d("test","fun1 ")
    }
    inner class CustomClick : View.OnClickListener{
        override fun onClick(v: View?) {
            when(v?.id){
                R.id.button1 -> {

                }
                R.id.button2 -> {

                }
            }
        }

    }
}