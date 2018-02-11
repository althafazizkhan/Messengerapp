package Application.messenger.message;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Application.messenger.message.model.profile;
import Application.messenger.message.model.service.profileService;

@Path("/profile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class profileResource {

	profileService ps = new profileService();
	profile prof = new profile();

	@GET
	public List<profile> getprofile() {
		return ps.getprofiles();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public profile addprofile(profile me) {
		return ps.addProfiles(me);
	}

	@GET
	@Path("/{profileName}")
	public profile getmessages(@PathParam("profileName") String profile, profile pro) {
		pro.setProfileName(profile);
		return ps.updateProfile(pro);
				}
	
	@PUT
	@Path("/{profileName}")
	public profile Updateprofile(@PathParam("profileName") String profile, profile pro) {
		pro.setProfileName(profile);
		return ps.updateProfile(pro);
	}

	@DELETE
	@Path("/{profileName}")
	public profile Delmessages(@PathParam("profileName") String profile) {
		return ps.removeprofile(profile);
	}


}
