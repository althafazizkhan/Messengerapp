package Application.messenger.database;

import java.util.HashMap;
import java.util.Map;

import Application.messenger.message.model.messageModel;
import Application.messenger.message.model.profile;

public class databaseClass {

	private static Map<Long, messageModel> messages = new HashMap<>();
	private static Map<String, profile> profiles = new HashMap<>();
	
	public static Map<Long, messageModel> getMessages(){
		return messages;
	}
	
	public static Map<String, profile> getProfile(){
		return profiles;
	}
	}


