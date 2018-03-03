package com.example.logonrm.imcalculator.extension

fun Double.format (digits: Int) =
        java.lang.String.format ("%.${digits}f", this)

