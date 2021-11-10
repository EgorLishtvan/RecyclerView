package com.example.recyclerviewha_tms

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet.*
import java.lang.RuntimeException

class ActionBottomDialogFragment :BottomSheetDialogFragment(), View.OnClickListener{
  private var mListner:ItemsClickListner? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text0.setOnClickListener (this)
        text1.setOnClickListener (this)
        text2.setOnClickListener (this)
        text3.setOnClickListener (this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mListner= if (context is ItemsClickListner) {
            context
        } else{
            throw RuntimeException(
                context.toString() + "Must implement Item"
            )
        }
    }
    override fun onDetach() {
        super.onDetach()
        mListner=null
    }
    override fun onClick(p0: View?) {
        var v=null
        val tvSeleced =v as EditText
        mListner!!.onItemClick(tvSeleced.text.toString())
        dismiss()
    }




}