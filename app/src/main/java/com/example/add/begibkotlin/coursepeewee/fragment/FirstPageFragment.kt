package com.example.add.begibkotlin.coursepeewee.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import butterknife.OnClick
import com.example.add.begibkotlin.R
import com.example.add.begibkotlin.coursepeewee.activity.MainActivity
import com.example.add.begibkotlin.coursepeewee.toText


class FirstPageFragment : Fragment() {

    lateinit var edtUsername: EditText
    lateinit var edtPassword: EditText
    lateinit var btnSubmit: Button

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)
        edtUsername = view.findViewById(R.id.edt_Username)
        edtPassword = view.findViewById(R.id.edt_Password)
        btnSubmit = view.findViewById(R.id.btn_Submit)

        return view
    }

    fun getMainActivity(): MainActivity {
        return activity as MainActivity
    }

    @OnClick(R.id.btn_Submit) fun onClickLogin() {
        val username = edtUsername.toText()
        val password = edtPassword.toText()

        getMainActivity().changeFragment(Main2Fragment.newInstance(username, password))
    }

    companion object {
        fun newInstance(): FirstPageFragment {
            val bundle = Bundle()
            val fragment = FirstPageFragment()
            fragment.arguments = bundle
            return fragment
        }
    }
}
