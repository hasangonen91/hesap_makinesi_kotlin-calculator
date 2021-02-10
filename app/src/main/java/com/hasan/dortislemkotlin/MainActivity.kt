package com.hasan.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1:Int? =null
    var sayi2:Int? =null
    var sonuc1:Int? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View){
         sayi1 =editText.text.toString().toIntOrNull()
         sayi2 =editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2 ==null){
            sonuc.text="Lütfen sayi girin"
        }else{
             sonuc1= sayi1!!+sayi2!!
            sonuc.text="Sonuç: ${sonuc1}"
        }
    }
    fun cikar(view: View){
         sayi1 =editText.text.toString().toIntOrNull()
         sayi2 =editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2 ==null){
            sonuc.text="Lütfen sayi girin"
        }else{
            sonuc1= sayi1!!-sayi2!!
            sonuc.text="Sonuç: ${sonuc1}"
        }
    }
    fun carp(view: View){
         sayi1 =editText.text.toString().toIntOrNull()
         sayi2 =editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2 ==null){
            sonuc.text="Lütfen sayi girin"
        }else{
            sonuc1= sayi1!!*sayi2!!
            sonuc.text="Sonuç: ${sonuc1}"
        }
    }
    fun bol(view: View){
         sayi1 =editText.text.toString().toIntOrNull()
         sayi2 =editText2.text.toString().toIntOrNull()
        if(sayi1==null || sayi2 ==null){
            sonuc.text="Lütfen sayi girin"
        }else{
            sonuc1= sayi1!!/sayi2!!
            sonuc.text="Sonuç: ${sonuc1}"
        }
    }
}