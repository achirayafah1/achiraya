package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(product.render());

    }
    public static Result index2() {
        return ok(manu.render());

    }

}
