package Application.messenger.message.model.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import Application.messenger.database.databaseClass;
import Application.messenger.message.model.messageModel;

public class messageService {

	private Map<Long, messageModel> messages = databaseClass.getMessages();

	public messageService() {
		messages.put(1L, new messageModel(1, "ALthaf khan", "khan"));
		messages.put(2L, new messageModel(2, "Munawar khan", "althaf"));
	}

	public List<messageModel> getmessages() {

		return new ArrayList<messageModel>(messages.values());
	}

	public messageModel getMessages(long id) {

		return messages.get(id);
	}
	
	public List<messageModel> getMessageyear(int year) {
		List<messageModel> messageyear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(messageModel MM : messages.values()) {
			cal.setTime(MM.getCreated());
			if(cal.get(Calendar.YEAR) == year) {
				messageyear.add(MM);
			}
		}
		return messageyear;
	}
	
	public List<messageModel> getPaginated(int start, int size){
		List<messageModel> list = new ArrayList<messageModel>(messages.values());
		if(start + size > list.size()) 
			return new ArrayList<messageModel>();
			return list.subList(start, start + size);
		
		
	}

	public messageModel addMessages(messageModel message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public messageModel updateMessages(messageModel message) {

		if (message.getId() <= 0) {
			return null;
		} else {
			messages.put(message.getId(), message);
			return message;
		}
	}

	public messageModel removemessage(long id) {

		return messages.remove(id);
	}
}
