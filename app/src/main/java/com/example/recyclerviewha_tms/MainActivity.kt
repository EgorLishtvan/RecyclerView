package com.example.recyclerviewha_tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewha_tms.ActionEdit.Companion.newInstance
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URLClassLoader.newInstance
import javax.xml.parsers.DocumentBuilderFactory.newInstance
import javax.xml.transform.TransformerFactory.newInstance
import com.example.recyclerviewha_tms.ActionBottomDialogFragment as ActionBottomDialogFragment

class MainActivity : AppCompatActivity(),ItemsClickListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText.setOnClickListener{openBottomSheet()}
    }
fun openBottomSheet(){
    val addPhotoBottomDialogFragment = ActionEdit.newInstance()
    addPhotoBottomDialogFragment.show(
        supportFragmentManager, ActionEdit.TAG
    )

}

    override fun onItemClick(item: String?) {
        TODO("Not yet implemented")
    }
//    override fun onItemClick(item: String?) {
//        "".also { it.also { it.also { editText.text=it } } }
//    }


}