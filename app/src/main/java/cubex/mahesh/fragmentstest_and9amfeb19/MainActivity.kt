package cubex.mahesh.fragmentstest_and9amfeb19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frame1,HomeFrag())
        tx.commit()

        home.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,HomeFrag())
            tx.addToBackStack("true")
            tx.commit()
        }
        courses.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,CoursesFrag())
            tx.addToBackStack("true")
            tx.commit()
        }
        projects.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,ProjectsFrag())
            tx.addToBackStack("true")
            tx.commit()
        }
        materials.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frame1,MaterialsFrag())
            tx.addToBackStack("true")
            tx.commit()
        }

    }
}
