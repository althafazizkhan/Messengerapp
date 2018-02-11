package Application.messenger.message.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Application.messenger.database.databaseClass;
import Application.messenger.message.model.messageModel;
import Application.messenger.message.model.profile;

public class profileService {
	
	

	private Map<String, profile> userProfile = databaseClass.getProfile();
	
	public profileService() {
		userProfile.put("aziz", new profile(1L,"althafkhan", "ALthaf khan", "khan"));
		userProfile.put("Sultan", new profile(2L, "MunnaKhan", "Munawar khan", "althaf"));
	}


	public List<profile> getprofiles() {

		return new ArrayList<profile>(userProfile.values());
	}

	public profile getprofile(String pro) {

		return userProfile.get(pro);
	}

	public profile addProfiles(profile pro) {
		pro.setId(userProfile.size() + 1);
		userProfile.put(pro.getProfileName(), pro);
		return pro;
	}
	
	public profile updateProfile(profile pro) {

		if (pro.getProfileName().isEmpty()) {
			return null;
		} else {
			userProfile.put(pro.getProfileName(), pro);
			return pro;
		}
	}
	

	public profile removeprofile(String pro) {

		return userProfile.remove(pro);
	}

	
}
