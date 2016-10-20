import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/m")
public class MtoKM {
 
	  
 
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		double Kilometer;
		Kilometer =  (f)*1.609; 
		jsonObject.put("Miles", f); 
		jsonObject.put("Kilometers", Kilometer);
 
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}