package com.example.jblshop.data

import com.example.jblshop.R
import com.example.jblshop.data.model.JBL

class Datasource {

    fun loadJBL(): List<JBL> {
        return listOf(

            JBL(
                R.drawable.jblxtreme,
                289.99,
                "JBL Xtreme 3",
                false
            ),

            JBL(
                R.drawable.jblboombox,
                399.99,
                "JBL Boombox",
                false
            ),

            JBL(
                R.drawable.jblparty,
                499.99,
                "JBL Partybox",
                false
            ),

            JBL(
                R.drawable.jblgo,
                12.99,
                "JBL GO 2",
                true
            )
        )
    }


}