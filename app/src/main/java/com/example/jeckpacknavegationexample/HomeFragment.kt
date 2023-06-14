import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.jeckpacknavegationexample.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btnDetails = view.findViewById<Button>(R.id.btnDetails)
        btnDetails.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_details)
        }

        return view
    }
}