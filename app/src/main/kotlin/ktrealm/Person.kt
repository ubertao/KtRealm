package ktrealm

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
public open class Person(public open var name: String = ""): RealmObject() {}