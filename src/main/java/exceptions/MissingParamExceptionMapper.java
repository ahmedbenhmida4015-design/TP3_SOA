package exceptions;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.Map;


@Provider
public class MissingParamExceptionMapper implements ExceptionMapper<MissingParamException> {

    @Override
    public Response toResponse(MissingParamException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .type(MediaType.APPLICATION_JSON)
                .entity(Map.of("erreur", exception.getMessage()))
                .build();
    }
}