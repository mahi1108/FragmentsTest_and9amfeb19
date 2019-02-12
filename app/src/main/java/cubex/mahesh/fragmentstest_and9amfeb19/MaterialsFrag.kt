package cubex.mahesh.fragmentstest_and9amfeb19

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MaterialsFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
           container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.materials,
                            container,false)

        return v
    }

}