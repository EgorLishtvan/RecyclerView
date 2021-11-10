package com.example.recyclerviewha_tms

class ActionEdit {
    companion object{
        const val TAG="ActionBottom"
        fun newInstance()
        :ActionBottomDialogFragment{
            return ActionBottomDialogFragment()
        }
    }
}