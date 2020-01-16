import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import kotlinx.android.synthetic.main.item.view.*

class MyApdater(private var datas: Array<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        Log.d("tag1" , "onCreateViewHolder")
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d("tag1" , "onBind")
        holder.textField.text = datas[position]
    }
}

class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    var textField = view.chat_title
}