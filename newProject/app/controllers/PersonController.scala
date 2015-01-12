package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.personInsert
import models.personIns

//case class Person(name:String,address:String)

object PersonController extends Controller{
	val personForm = Form(
		mapping(
		"name" -> nonEmptyText,
		"address"->nonEmptyText
		)(personInsert.apply)(personInsert.unapply)

		
	) 

    def create = Action{
	  	implicit request => personForm.bindFromRequest.fold(
			errors => BadRequest("oops error occured!!"),
			name => {
				personIns.save(name)
				Redirect(routes.Application.index)
				
			}
		)
  }
}