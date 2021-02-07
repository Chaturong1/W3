package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var TotalCredit: TextView = findViewById(R.id.TotalCredit)
        var GPA: TextView = findViewById(R.id.GPA)
        var Sj1: EditText =findViewById(R.id.Sj1)
        var Sj2: EditText =findViewById(R.id.Sj2)
        var Sj3: EditText =findViewById(R.id.Sj3)
        var Sj4: EditText =findViewById(R.id.Sj4)
        var Sj5: EditText =findViewById(R.id.Sj5)
        var Cd1: EditText =findViewById(R.id.Cd1)
        var Cd2: EditText =findViewById(R.id.Cd2)
        var Cd3: EditText =findViewById(R.id.Cd3)
        var Cd4: EditText =findViewById(R.id.Cd4)
        var Cd5: EditText =findViewById(R.id.Cd5)
        var P1: EditText =findViewById(R.id.P1)
        var P2: EditText =findViewById(R.id.P2)
        var P3: EditText =findViewById(R.id.P3)
        var P4: EditText =findViewById(R.id.P4)
        var P5: EditText =findViewById(R.id.P5)
        var Ok: Button =findViewById(R.id.Ok)
        var Clear: Button =findViewById(R.id.Clear)
        Ok.setOnClickListener(){
            var Sj1 = Sj1.text.toString()
            var Sj2 = Sj2.text.toString()
            var Sj3 = Sj3.text.toString()
            var Sj4 = Sj4.text.toString()
            var Sj5 = Sj5.text.toString()
            var Cd1 = Cd1.text.toString()
            var Cd2 = Cd2.text.toString()
            var Cd3 = Cd3.text.toString()
            var Cd4 = Cd4.text.toString()
            var Cd5 = Cd5.text.toString()
            var P1 = P1.text.toString()
            var P2 = P2.text.toString()
            var P3 = P3.text.toString()
            var P4 = P4.text.toString()
            var P5 = P5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcru =0.00
            if(Sj1 == "" || Sj2 == "" || Sj3 == "" || Sj4 == "" || Sj5 == "" ||
                Cd1 == "" || Cd2 == "" || Cd3 == "" || Cd4 == "" || Cd5 == "" ||
                P1 == "" || P2 == "" || P3 == "" || P4 == "" || P5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=Cd1.toDouble()*P1.toDouble()
                total2=Cd2.toDouble()*P2.toDouble()
                total3=Cd3.toDouble()*P3.toDouble()
                total4=Cd4.toDouble()*P4.toDouble()
                total5=Cd5.toDouble()*P5.toDouble()
                totalcru =Cd1.toDouble()+Cd2.toDouble()+Cd3.toDouble()+Cd4.toDouble()+Cd5.toDouble()
                total = (total1+total2+total3+total4+total5)/totalcru
                TotalCredit.setText(totalcru.toString())
                GPA.setText(total.toString())
            }
        }
        Clear.setOnClickListener(){
            TotalCredit.setText("")
            GPA.setText("")
            Sj1.setText("")
            Sj2.setText("")
            Sj3.setText("")
            Sj4.setText("")
            Sj5.setText("")
            Cd1.setText("")
            Cd2.setText("")
            Cd3.setText("")
            Cd4.setText("")
            Cd5.setText("")
            P1.setText("")
            P2.setText("")
            P3.setText("")
            P4.setText("")
            P5.setText("")
        }
    }
}