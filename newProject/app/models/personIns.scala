package models


import models.Person
/*import play.api.db.slick.Config.driver.simple._*/
import play.api.db.slick._
import play.api.Play.current
import scala.slick._
import scala.slick.driver.MySQLDriver.simple._



case class personInsert( name :String, address :String)

object personIns{

  val dataPerson= TableQuery[Person]


  def save(value:personInsert) {
		DB.withTransaction { implicit session =>
		   //dataPerson+=personInsert(name="haripal",address="delhi")
		  dataPerson.insert(value)
		}}
  }  
	
