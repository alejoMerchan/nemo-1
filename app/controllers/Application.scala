package controllers

import play.api._
import play.api.mvc._



/**
 * Created by abelmeos on 2016/04/21.
 */
class Application   extends Controller {

  val prueba = "esto es una prueba"

  def index = Action{



    Ok(views.html.index.render())


  }



}
