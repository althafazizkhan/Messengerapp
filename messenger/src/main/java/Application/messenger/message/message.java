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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import Application.messenger.message.model.messageModel;
import Application.messenger.message.model.service.messageService;

@Path("/message")

public class message {

	messageService ms = new messageService();
	messageModel mm = new messageModel();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<messageModel> getmessage(@QueryParam("year") int year, @QueryParam("start") int start,
			@QueryParam("size") int size) {
		if (year > 0) {
			return ms.getMessageyear(year);
		}
		if (start >= 0 && size >= 0) {
			return ms.getPaginated(start, size);
		}
		else

		return ms.getmessages();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public messageModel addMessage(messageModel me) {
		return ms.addMessages(me);
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public messageModel Delmessages(@PathParam("messageId") long id) {
		return ms.removemessage(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public messageModel Updatemessages(@PathParam("messageId") long id, messageModel me) {
		mm.setId(id);
		return ms.updateMessages(me);
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public messageModel getmessages(@PathParam("messageId") long id) {
		return ms.getMessages(id);
	}

}
