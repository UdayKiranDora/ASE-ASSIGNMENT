import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/km")
public class KMtoM {
 	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		double Miles;
		Miles =  (f)*0.6213; 
		jsonObject.put("Kilometers", f); 
		jsonObject.put("Miles", Miles);
 
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}