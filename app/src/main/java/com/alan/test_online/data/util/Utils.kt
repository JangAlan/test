package com.alan.test_online.data.util

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

object Utils {

    @SuppressLint("SimpleDateFormat")
    fun changeStringToDateFormat(value: String): String{
        try {
            val strDate: String = value

            //current date format
            val dateFormat: SimpleDateFormat = SimpleDateFormat("MM/dd/yyyy")
            val objDate: Date = dateFormat.parse(strDate)

            //Expected date format
            val dateFormat2 = SimpleDateFormat("MMM dd, yyyy")
            return dateFormat2.format(objDate)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }

    fun showAlert(context: Context, message: String){
        val builder1: AlertDialog.Builder = AlertDialog.Builder(context)
        builder1.setMessage(message)
        builder1.setCancelable(true)

        builder1.setPositiveButton(
                "Oke"
        ) { dialog, _ -> dialog.cancel() }

        val alert11: AlertDialog = builder1.create()
        alert11.show()
    }

    fun changeMinuteToDurationFormat(duration: Int): String{
        val hour = duration/60
        val minute = duration%60

        return if (hour>0){
            "$hour h $minute m"
        }else{
            "$minute m"
        }

    }

    @SuppressLint("NewApi")
    fun changeStringDateToYear(date: String): Int{
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy")
        val localDate: LocalDate = LocalDate.parse(date, formatter)

        return localDate.year
    }

}