package controllers;

import exceptions.MissingParamException;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import metier.Calculatrice;
import model.Reponse;

@Path("/calculatrice")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatriceController {

    @GET
    @Path("/addition")
    public Response addition(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        double x = require(a, "a");
        double y = require(b, "b");
        Reponse reponse = new Reponse("addition",a,b,Calculatrice.addition(x,y));
        return Response.ok(reponse).build();
    }

    @GET
    @Path("/soustraction")
    public Response soustraction(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        double x = require(a, "a");
        double y = require(b, "b");
        Reponse reponse = new Reponse("soustraction",a,b,Calculatrice.soustraction(x,y));
        return Response.ok(reponse).build();
    }

    @GET
    @Path("/multiplication")
    public Response multiplication(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        double x = require(a, "a");
        double y = require(b, "b");
        Reponse reponse = new Reponse("multiplication",a,b,Calculatrice.multiplication(x,y));
        return Response.ok(reponse).build();
    }

    @GET
    @Path("/division")
    public Response division(@QueryParam("a") Double a, @QueryParam("b") Double b) {
        double x = require(a, "a");
        double y = require(b, "b");
        Reponse reponse = new Reponse("division",a,b,Calculatrice.division(x,y));
        return Response.ok(reponse).build();
    }

    private static double require(Double valeur, String nom) throws MissingParamException{
        if (valeur == null) {
            throw new MissingParamException("Le paramètre '" + nom + "' est obligatoire");
        }
        return valeur;
    }
}
