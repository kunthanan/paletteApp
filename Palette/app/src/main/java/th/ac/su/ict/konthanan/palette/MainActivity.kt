package th.ac.su.ict.konthanan.palette

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPalette1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewC.setBackgroundColor(Color.parseColor("#e9e1de"))
                viewC.setText("233-225-222")
            }
        })
        btPalette2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewC.setBackgroundColor(Color.parseColor("#e7cccb"))
                viewC.setText("231-204-203")
            }
        })

        btPalette3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewC.setBackgroundColor(Color.parseColor("#77839a"))
                viewC.setText("119-131-154")
            }
        })

        btPalette4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewC.setBackgroundColor(Color.parseColor("#9ca9bd"))
                viewC.setText("156-169-189")
            }
        })

        btPalette5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewC.setBackgroundColor(Color.parseColor("#c4ccd4"))
                viewC.setText("196-204-212")
            }
        })

        btPalette6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                viewC.setBackgroundColor(Color.parseColor("#dee2e5"))
                viewC.setText("222-226-229")
            }
        })

    }
}