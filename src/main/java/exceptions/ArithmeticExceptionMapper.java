package exceptions;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.Map;


@Provider
public class ArithmeticExceptionMapper implements ExceptionMapper<ArithmeticException> {

    @Override
    public Response toResponse(ArithmeticException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .type(MediaType.APPLICATION_JSON)
                .entity(Map.of("erreur", exception.getMessage()))
                .build();
    }
}
