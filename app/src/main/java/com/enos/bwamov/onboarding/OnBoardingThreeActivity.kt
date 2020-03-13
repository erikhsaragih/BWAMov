package com.enos.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enos.bwamov.R
import com.enos.bwamov.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_on_boarding_three.*

class OnBoardingThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_three)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OnBoardingThreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
