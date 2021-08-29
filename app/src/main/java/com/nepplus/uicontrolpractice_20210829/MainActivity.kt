package com.nepplus.uicontrolpractice_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  qjxmsdl snfflaus => aptpwlrk wjrgls sodyddmf qkedkdhktj => xhtmxmfmf Emldnsmsep tkdyd.

        toastBtn.setOnClickListener {

            //aptpwlrk dlqfurehls sodyd(text thrtjddp wjrglsrkqt) dmf qkedkdhwk. => rldjrgoenjdi => qustnfmf aksemfdjtj wjwkdgoenwk
            val inputMessage = messageEdt.text.toString()


            //xhtmxmfmf Emldnfeo = > qustndp ekarls sodyddmf Emldnwk.

            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

        }
    }
}