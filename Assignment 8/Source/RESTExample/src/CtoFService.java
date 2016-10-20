import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/hellohai")
public class CtoFService {
	@Path("{r}/{ur}/{o}")
	  @GET
	  @Produces("application/json")
	  public Response first(@PathParam("r")long miles,@PathParam("ur")long mgas,@PathParam("o")long gcost) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		
		float cost=(miles/mgas)*gcost;
		
		jsonObject.put("Miles to travel", miles);
		jsonObject.put("Cost of tracel", cost);
		
		

		String result = ""+ jsonObject;
		return Response.status(200).entity(result).build();
	  }
}