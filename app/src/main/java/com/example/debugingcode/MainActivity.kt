package com.example.debugingcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*قم بتعريف متغيرين من النوع المنطقي وقم بوضع احدهما صحيح والاخر  غلط
        قم بعمل جملة شرطية باستخدام && بين المتغيرين السابقين
       اذا كانت الجملة صحيحه اطبع(الجملة صحيحه)واذا كانت خاطئه اطبع حدث خطاما باستخدام Logcat
       ضع النقاط الخاصه بال Debugging على الجمل الشرطية وعلى جمل الطباعة
         */

        val havePen:Boolean = true
        val haveNotes:Boolean = false

        if (havePen == true && haveNotes == true){

            Log.d("result","i understand")
        }else{

            Log.d("result","i can not understand")
        }


    }
}