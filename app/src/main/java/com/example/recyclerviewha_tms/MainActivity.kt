package com.example.recyclerviewha_tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ItemsClickListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText.setOnClickListener{openBottomSheet() }
    }
fun openBottomSheet() {
    val addPhotoBottomDialogFragment = ActionEdit.newInstance()
    addPhotoBottomDialogFragment.show(
        supportFragmentManager, ActionEdit.TAG
    )

}

    override fun onItemClick(item: String?) {
        TODO("Not yet implemented")
    }
}