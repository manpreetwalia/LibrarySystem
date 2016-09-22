
import library.entities.Member;
import library.interfaces.daos.IMemberHelper;
import library.interfaces.entities.IMember;

public class Memberinfo implements IMemberHelper {

	@Override
	public IMember makeMember(String firstName, String lastName,
			String contactPhone, String emailAddress, int id) {
		
		return new Member(firstName, lastName, contactPhone, emailAddress, id);
	}

}
