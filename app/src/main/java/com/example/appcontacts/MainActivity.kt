package com.example.appcontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var contacts = ArrayList<Contact>()
    var contactAdapter =  ContactAdapter(contacts)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContact()
        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvContact)
        rvContact.adapter=contactAdapter
        rvContact.layoutManager=LinearLayoutManager(this)
    }

    private fun loadContact() {
        contacts.add(Contact("jack","leon"))
        contacts.add(Contact("ronaldo","lopez"))
        contacts.add(Contact("pedro","lenn"))
        contacts.add(Contact("quito","lowen"))
        contacts.add(Contact("jhony","lerrewel"))
        contacts.add(Contact("emilia","sannar"))
        contacts.add(Contact("jennifer","ford"))

    }
}