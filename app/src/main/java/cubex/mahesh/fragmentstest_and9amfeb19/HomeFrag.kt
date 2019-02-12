package cubex.mahesh.fragmentstest_and9amfeb19

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.home.view.*

class HomeFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
           container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.home,
                            container,false)

       v.clickme.setOnClickListener {
            Toast.makeText(activity, " Don't Click Me....",
                        Toast.LENGTH_LONG).show()
        }

        return v
    }

}