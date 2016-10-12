package cn.eaglefire.app.demo.springbootwithgorm.domain

import grails.persistence.Entity
//import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

/**
 * Created by graemerocher on 22/07/2016.
 */
@Entity
class User implements GormEntity<User> {
//class User {
    Long id
    String name
}
