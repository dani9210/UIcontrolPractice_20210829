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

        //  카피메세지버튼이 눌리면 - > 메세지가 적힌 내용을 받아와서 = > 텍스트뷰의 문구(text)로 반영


        copyMessageBtn.setOnClickListener {

            //입력한 내용 받아오기. (변수에 저장)
            val inputmessage = messageEdt.text.toString()

            //메세지 텍스트뷰의 text 속성에, 내용을 대입.   (set)

            messageTxt.text = inputmessage


        }


    }
}