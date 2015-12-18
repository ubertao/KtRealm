package com.example.ktrealm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.RealmQuery

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val realm: Realm  = Realm.getInstance(this)
        val query: RealmQuery<Person> = realm.where(Person::class.java)
        val person = query.findFirst()
        if (person == null) {
            realm.executeTransaction {
                val jack = Person("Jack")
                realm.copyToRealm(jack)
            }
        }
    }
}
