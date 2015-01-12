package models


import models.personInsert
import models.personIns
import scala.slick._
import scala.slick.driver.MySQLDriver.simple._
import scala.slick.lifted._

class Person (tag: Tag) extends Table[personInsert] (tag, "person")
{
 
 	def name=column[String]("pname")
    def add = column[String]("padd")
    
    def * = (name, add) <> (personInsert.tupled, personInsert.unapply) 
}